

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


--
-- crear DB
--
/*
CREATE DATABASE `factorydb` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `factorydb`;
*/

CREATE DATABASE `ulacitProyecto` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `ulacitProyecto`;


-- --------------------------------------------------------

--
-- Table structure for table `bill`
--
/*
CREATE TABLE IF NOT EXISTS `bill` (
  `billid` int(100) NOT NULL,
  `dealer` varchar(100) NOT NULL,
  `products` varchar(100) NOT NULL,
  `qty` varchar(100) NOT NULL,
  `total` varchar(100) NOT NULL,
  `phone` varchar(100) NOT NULL,
  `date` date NOT NULL,
  PRIMARY KEY (`billid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
*/

CREATE TABLE IF NOT EXISTS `factura` (
  `idFactura` int(100) NOT NULL,
  `proveedor` varchar(100) NOT NULL,
  `productos` varchar(100) NOT NULL,
  `cantidad` varchar(100) NOT NULL,
  `total` varchar(100) NOT NULL,
  `telefono` varchar(100) NOT NULL,
  `fecha` date NOT NULL,
  PRIMARY KEY (`idFactura`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `category`
--
/*
CREATE TABLE IF NOT EXISTS `category` (
  `category1` varchar(100) NOT NULL,
  `subcategory` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
*/

CREATE TABLE IF NOT EXISTS `categoria` (
  `categoria1` varchar(100) NOT NULL,
  `subcategoria` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


-- --------------------------------------------------------

--
-- Table structure for table `company`
--

CREATE TABLE IF NOT EXISTS `compania` (
  `compania` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


-- --------------------------------------------------------

--
-- Table structure for table `createuser`
--

/*
CREATE TABLE IF NOT EXISTS `createuser` (
  `username` varchar(100) NOT NULL,
  `usertype` varchar(100) NOT NULL,
  `name1` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
*/

CREATE TABLE IF NOT EXISTS `crearUsuario` (
  `nombreUsuario` varchar(100) NOT NULL,
  `tipoUsuario` varchar(100) NOT NULL,
  `nombre1` varchar(100) NOT NULL,
  `contrasenia` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `createuser`
--
/*
INSERT INTO `createuser` (`username`, `usertype`, `name1`, `password`) VALUES
('Admin', 'Admin', 'Admin', '123'),
('Manager', 'Manager', 'Manager', '123');
*/

INSERT INTO `crearUsuario` (`nombreUsuario`, `tipoUsuario`, `nombre1`, `contrasenia`) VALUES
('Admin', 'Administrador', 'Admin', '123'),
('Manager', 'Vendedor', 'Manager', '123');

-- --------------------------------------------------------

--
-- Table structure for table `member`
--
/*
CREATE TABLE IF NOT EXISTS `member` (
  `ID` int(4) NOT NULL,
  `NAME` varchar(100) NOT NULL,
  `usertype` varchar(100) NOT NULL,
  `PHONE` varchar(100) NOT NULL,
  `GENDER` varchar(20) NOT NULL,
  `ADDRESS` varchar(100) NOT NULL,
  `dob` date NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
*/

CREATE TABLE IF NOT EXISTS `miembro` (
  `ID` int(4) NOT NULL,
  `NOMBRE` varchar(100) NOT NULL,
  `tipoUsuario` varchar(100) NOT NULL,
  `TELEFONO` varchar(100) NOT NULL,
  `GENERO` varchar(20) NOT NULL,
  `DIRECCION` varchar(100) NOT NULL,
  `fechaDeNacimiento` date NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `products`
--
/*
CREATE TABLE IF NOT EXISTS `products` (
  `items` varchar(100) NOT NULL,
  `rates` varchar(100) NOT NULL,
  `category` varchar(100) NOT NULL,
  `subcategory` varchar(100) NOT NULL,
  `quantity` varchar(100) NOT NULL,
  PRIMARY KEY (`items`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
*/

CREATE TABLE IF NOT EXISTS `productos` (
  `items` varchar(100) NOT NULL,
  `precios` varchar(100) NOT NULL,
  `categorias` varchar(100) NOT NULL,
  `subcategorias` varchar(100) NOT NULL,
  `cantidades` varchar(100) NOT NULL,
  PRIMARY KEY (`items`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

