DROP DATABASE IF EXISTS `proyectofinal`;
CREATE DATABASE IF NOT EXISTS `proyectofinal` DEFAULT CHARACTER SET utf8mb4;
USE proyectofinal;

DROP TABLE IF EXISTS `local_comercial`;
DROP TABLE IF EXISTS `empleado`;
DROP TABLE IF EXISTS `factura`;
DROP TABLE IF EXISTS `cliente`;
DROP TABLE IF EXISTS `contacto_proveedor`;
DROP TABLE IF EXISTS `proveedor`;
DROP TABLE IF EXISTS `articulo`;

CREATE TABLE local_comercial (
	id INT NOT NULL AUTO_INCREMENT,
	direccion1 VARCHAR(100) NOT NULL,
	direccion2 VARCHAR(100) NOT NULL,
	provincia VARCHAR(20) NOT NULL,
	canton VARCHAR(50) NOT NULL,
	distrito VARCHAR(50) NOT NULL,
	telefono INT,
	email VARCHAR(100),
	PRIMARY KEY ( id )
);

CREATE TABLE empleado (
	id INT NOT NULL AUTO_INCREMENT,
	usuario VARCHAR(100) NOT NULL,
	contrasenia VARCHAR(100) NOT NULL,
	nombre1 VARCHAR(100) NOT NULL,
	nombre2 VARCHAR(100),
	apellido1 VARCHAR(100) NOT NULL,
	apellido2 VARCHAR(100),
	email VARCHAR(255),
	tipoUsuario VARCHAR(1),
	clienteAtendido INT,
	visitaRealizada INT,
	horarioDefinido VARCHAR(100),
	asignarLocal VARCHAR(100),
	descuento INT,
	PRIMARY KEY ( id )
);

CREATE TABLE factura (
	id INT NOT NULL AUTO_INCREMENT,
	idCliente INT NOT NULL,
	email VARCHAR(255) NOT NULL,
	nombre VARCHAR(100) NOT NULL,
	nombreCajero VARCHAR(100) NOT NULL,
	fecha VARCHAR(10) NOT NULL,
	hora VARCHAR(5),
	listaArticulos VARCHAR(255),
	subtotal DECIMAL(20,2),
	impuesto DECIMAL(20,2),
	total DECIMAL(20,2),
	PRIMARY KEY ( id )
);

CREATE TABLE cliente (
	id INT NOT NULL AUTO_INCREMENT,
	nombre1 VARCHAR(100) NOT NULL,
	nombre2 VARCHAR(100) NOT NULL,
	apellido1 VARCHAR(100) NOT NULL,
	apellido2 VARCHAR(100),
	email VARCHAR(100),
	telefono INT,
	PRIMARY KEY ( id )
);

CREATE TABLE contacto_proveedor (
	id INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    apellido1 VARCHAR(100) NOT NULL,
    apellido2 VARCHAR(100),
    telefono INT,
    email VARCHAR(100),
    PRIMARY KEY ( id )
);

CREATE TABLE proveedor (
	id INT NOT NULL AUTO_INCREMENT,
    proveedorNombre VARCHAR(100) NOT NULL,
    contactoProveedor INT,
    correo VARCHAR(100) NOT NULL,
    telefono1 INT NOT NULL,
    telefono2 INT,
    direccion VARCHAR(255),
    PRIMARY KEY ( id ),
    FOREIGN KEY (contactoProveedor) REFERENCES contacto_proveedor(id)
);

CREATE TABLE articulo (
	id INT NOT NULL AUTO_INCREMENT,
	descripcion VARCHAR(200) NOT NULL,
	precio DECIMAL NOT NULL,
	categoria VARCHAR(100) NOT NULL,
	disponible VARCHAR(1),
	idProveedor INT,
	cantidadDisponible INT,
	PRIMARY KEY (id),
	FOREIGN KEY (idProveedor) REFERENCES proveedor(id)
);

-- Agregar un local comercial
INSERT INTO local_comercial (direccion1, direccion2, provincia, canton, distrito, telefono, email) VALUES ("125 metros al Este de Contadores", "Local 23", "San Jose", "Desamparados", "Desamparados", 222505050, "test@test.com");

-- Agregar dato de un empleado completo.
INSERT INTO empleado (usuario, contrasenia, nombre1, nombre2, apellido1, apellido2, email, tipoUsuario, clienteAtendido, visitaRealizada, horarioDefinido, asignarLocal, descuento)
VALUES ("roger123", "password123", "Roger", "Jose", "Ulate", "Rivera", "test@ulacit.com", 'E', 24, 4, "Lunes a Viernes, 7 a 4", "San Jose", 12);

-- Agregar dato de un empleado Admin
INSERT INTO empleado (usuario, contrasenia, nombre1, nombre2, apellido1, apellido2, email, tipoUsuario, clienteAtendido, visitaRealizada, horarioDefinido, asignarLocal, descuento)
VALUES ("javier123", "password123", "Javier", "Jose", "Godnez", "Prearty", "tester@ulacit.com", "A", 0, 0, "", "", 0);

-- Crear factura
INSERT INTO factura (idCliente, email, nombre, nombreCajero, fecha, hora, listaArticulos, subtotal, impuesto, total)
VALUES (110200201, "test@proveedor.com", "nombreProveedor", "William", "01/01/2020", "21:30", "Lista de articulos", 250000, 12.0, 275000.0);

-- Crear un cliente demo
INSERT INTO cliente (nombre1, nombre2, apellido1, apellido2, email, telefono)
VALUES ("Priscilla", "Maria", "Kenwood", "Ceratton", "cliente@correo.com", 84845656);

-- Crear contacto de proveedor
INSERT INTO contacto_proveedor (nombre, apellido1, apellido2, telefono, email)
VALUES ("Contacto de Proveedor", "Apellido de Proveedor 1", "Apellido de Proveedor 2", 89898989, "contacto@proveedor.com");

-- Crear proveedor
INSERT INTO proveedor (proveedorNombre, contactoProveedor, correo, telefono1, telefono2, direccion)
VALUES ("Microsoft", 1 , "microsoft@email.com", 23232323, 46465685, "USA, California");

-- Crear articulos
INSERT INTO articulo (descripcion, precio, categoria, disponible, idProveedor, cantidadDisponible)
VALUES ("Articulo mouse, 300 DPI", 75600.0, "Perifericos", "S", 1, 15);