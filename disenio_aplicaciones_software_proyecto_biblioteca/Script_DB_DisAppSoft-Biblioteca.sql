/**********************************************************
	Crear tabla autor
***********************************************************/

/****** Object:  Table [dbo].[autor]    Script Date: 11/6/2020 1:39:28 AM ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[autor]') AND type in (N'U'))
DROP TABLE [dbo].[autor]
GO

/****** Object:  Table [dbo].[autor]    Script Date: 11/6/2020 1:39:28 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[autor](
	[cod_autor] [int] IDENTITY(1,1) NOT NULL,
	[autor] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_autor] PRIMARY KEY CLUSTERED 
(
	[cod_autor] ASC
)WITH (STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO




/**********************************************************
	Crear tabla catalogo
***********************************************************/

/****** Object:  Table [dbo].[catalogo]    Script Date: 11/6/2020 1:41:06 AM ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[catalogo]') AND type in (N'U'))
DROP TABLE [dbo].[catalogo]
GO

/****** Object:  Table [dbo].[catalogo]    Script Date: 11/6/2020 1:41:06 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[catalogo](
	[cod_catalogo] [int] NOT NULL,
	[catalogo] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_catalogo] PRIMARY KEY CLUSTERED 
(
	[cod_catalogo] ASC
)WITH (STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO



/**********************************************************
	Crear tabla editorial
***********************************************************/

/****** Object:  Table [dbo].[editorial]    Script Date: 11/6/2020 1:41:57 AM ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[editorial]') AND type in (N'U'))
DROP TABLE [dbo].[editorial]
GO

/****** Object:  Table [dbo].[editorial]    Script Date: 11/6/2020 1:41:57 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[editorial](
	[cod_editorial] [int] IDENTITY(1,1) NOT NULL,
	[editorial] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_editorial] PRIMARY KEY CLUSTERED 
(
	[cod_editorial] ASC
)WITH (STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO



/**********************************************************
	Crear tabla estado
***********************************************************/


/****** Object:  Table [dbo].[estado]    Script Date: 11/6/2020 1:42:38 AM ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[estado]') AND type in (N'U'))
DROP TABLE [dbo].[estado]
GO

/****** Object:  Table [dbo].[estado]    Script Date: 11/6/2020 1:42:38 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[estado](
	[cod_estado] [int] NOT NULL,
	[estado] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_estado] PRIMARY KEY CLUSTERED 
(
	[cod_estado] ASC
)WITH (STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO


/**********************************************************
	Crear tabla estado_por_disponibilidad
***********************************************************/

ALTER TABLE [dbo].[estado_por_disponibilidad] DROP CONSTRAINT [FK_estado_por_disponibilidad_estado]
GO

/****** Object:  Table [dbo].[estado_por_disponibilidad]    Script Date: 11/6/2020 1:43:38 AM ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[estado_por_disponibilidad]') AND type in (N'U'))
DROP TABLE [dbo].[estado_por_disponibilidad]
GO

/****** Object:  Table [dbo].[estado_por_disponibilidad]    Script Date: 11/6/2020 1:43:38 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[estado_por_disponibilidad](
	[cod_existencia] [int] NOT NULL,
	[cod_estado] [int] NOT NULL,
 CONSTRAINT [PK_estado_por_disponibilidad] PRIMARY KEY CLUSTERED 
(
	[cod_existencia] ASC
)WITH (STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[estado_por_disponibilidad]  WITH CHECK ADD  CONSTRAINT [FK_estado_por_disponibilidad_estado] FOREIGN KEY([cod_estado])
REFERENCES [dbo].[estado] ([cod_estado])
GO

ALTER TABLE [dbo].[estado_por_disponibilidad] CHECK CONSTRAINT [FK_estado_por_disponibilidad_estado]
GO



/**********************************************************
	Crear tabla estudiante
***********************************************************/

/****** Object:  Table [dbo].[estudiante]    Script Date: 11/6/2020 1:44:23 AM ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[estudiante]') AND type in (N'U'))
DROP TABLE [dbo].[estudiante]
GO

/****** Object:  Table [dbo].[estudiante]    Script Date: 11/6/2020 1:44:23 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[estudiante](
	[cod_estudiante] [int] NOT NULL,
	[nombre1] [nvarchar](50) NOT NULL,
	[nombre2] [nvarchar](50) NULL,
	[apellido1] [nvarchar](50) NOT NULL,
	[apellido2] [nvarchar](50) NOT NULL,
	[tipo_identidad] [nvarchar](50) NOT NULL,
	[cedula] [nvarchar](50) NOT NULL,
	[num_pasaporte] [nvarchar](50) NOT NULL,
	[cedula_residente] [nvarchar](50) NOT NULL,
	[telefono] [nvarchar](50) NULL,
	[direccion] [nvarchar](50) NULL,
	[correo] [nvarchar](50) NOT NULL,
	[contrasenia] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_estudiante] PRIMARY KEY CLUSTERED 
(
	[cod_estudiante] ASC
)WITH (STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO



/**********************************************************
	Crear tabla libro
***********************************************************/

ALTER TABLE [dbo].[libro] DROP CONSTRAINT [FK_libro_pais]
GO

ALTER TABLE [dbo].[libro] DROP CONSTRAINT [FK_libro_libro_tipo]
GO

ALTER TABLE [dbo].[libro] DROP CONSTRAINT [FK_libro_libro_por_catalogo]
GO

ALTER TABLE [dbo].[libro] DROP CONSTRAINT [FK_libro_libro_por_autor]
GO

ALTER TABLE [dbo].[libro] DROP CONSTRAINT [FK_libro_editorial]
GO

/****** Object:  Table [dbo].[libro]    Script Date: 11/6/2020 1:45:10 AM ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[libro]') AND type in (N'U'))
DROP TABLE [dbo].[libro]
GO

/****** Object:  Table [dbo].[libro]    Script Date: 11/6/2020 1:45:10 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[libro](
	[cod_libro] [int] IDENTITY(1,1) NOT NULL,
	[ISBN] [nvarchar](50) NOT NULL,
	[titulo] [nvarchar](100) NOT NULL,
	[cod_editorial] [int] NOT NULL,
	[cod_pais] [int] NOT NULL,
	[cod_tipoLibro] [int] NOT NULL,
	[fecha_adquisicion] [date] NOT NULL,
 CONSTRAINT [PK_libro] PRIMARY KEY CLUSTERED 
(
	[cod_libro] ASC
)WITH (STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[libro]  WITH CHECK ADD  CONSTRAINT [FK_libro_editorial] FOREIGN KEY([cod_editorial])
REFERENCES [dbo].[editorial] ([cod_editorial])
GO

ALTER TABLE [dbo].[libro] CHECK CONSTRAINT [FK_libro_editorial]
GO

ALTER TABLE [dbo].[libro]  WITH CHECK ADD  CONSTRAINT [FK_libro_libro_por_autor] FOREIGN KEY([cod_libro])
REFERENCES [dbo].[libro_por_autor] ([cod_libro])
GO

ALTER TABLE [dbo].[libro] CHECK CONSTRAINT [FK_libro_libro_por_autor]
GO

ALTER TABLE [dbo].[libro]  WITH CHECK ADD  CONSTRAINT [FK_libro_libro_por_catalogo] FOREIGN KEY([cod_libro])
REFERENCES [dbo].[libro_por_catalogo] ([cod_libro])
GO

ALTER TABLE [dbo].[libro] CHECK CONSTRAINT [FK_libro_libro_por_catalogo]
GO

ALTER TABLE [dbo].[libro]  WITH CHECK ADD  CONSTRAINT [FK_libro_libro_tipo] FOREIGN KEY([cod_tipoLibro])
REFERENCES [dbo].[libro_tipo] ([cod_tipoLibro])
GO

ALTER TABLE [dbo].[libro] CHECK CONSTRAINT [FK_libro_libro_tipo]
GO

ALTER TABLE [dbo].[libro]  WITH CHECK ADD  CONSTRAINT [FK_libro_pais] FOREIGN KEY([cod_pais])
REFERENCES [dbo].[pais] ([cod_pais])
GO

ALTER TABLE [dbo].[libro] CHECK CONSTRAINT [FK_libro_pais]
GO



/**********************************************************
	Crear tabla libro_por_autor
***********************************************************/

ALTER TABLE [dbo].[libro_por_autor] DROP CONSTRAINT [FK_libro_por_autor_autor]
GO

/****** Object:  Table [dbo].[libro_por_autor]    Script Date: 11/6/2020 1:46:05 AM ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[libro_por_autor]') AND type in (N'U'))
DROP TABLE [dbo].[libro_por_autor]
GO

/****** Object:  Table [dbo].[libro_por_autor]    Script Date: 11/6/2020 1:46:05 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[libro_por_autor](
	[cod_libro] [int] NOT NULL,
	[cod_autor] [int] NOT NULL,
 CONSTRAINT [PK_libro_por_autor] PRIMARY KEY CLUSTERED 
(
	[cod_libro] ASC
)WITH (STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[libro_por_autor]  WITH CHECK ADD  CONSTRAINT [FK_libro_por_autor_autor] FOREIGN KEY([cod_autor])
REFERENCES [dbo].[autor] ([cod_autor])
GO

ALTER TABLE [dbo].[libro_por_autor] CHECK CONSTRAINT [FK_libro_por_autor_autor]
GO




/**********************************************************
	Crear tabla libro_por_catalogo
***********************************************************/

ALTER TABLE [dbo].[libro_por_catalogo] DROP CONSTRAINT [FK_libro_por_catalogo_catalogo]
GO

/****** Object:  Table [dbo].[libro_por_catalogo]    Script Date: 11/6/2020 1:46:40 AM ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[libro_por_catalogo]') AND type in (N'U'))
DROP TABLE [dbo].[libro_por_catalogo]
GO

/****** Object:  Table [dbo].[libro_por_catalogo]    Script Date: 11/6/2020 1:46:40 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[libro_por_catalogo](
	[cod_libro] [int] NOT NULL,
	[cod_catalogo] [int] NOT NULL,
 CONSTRAINT [PK_libro_por_catalogo] PRIMARY KEY CLUSTERED 
(
	[cod_libro] ASC
)WITH (STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[libro_por_catalogo]  WITH CHECK ADD  CONSTRAINT [FK_libro_por_catalogo_catalogo] FOREIGN KEY([cod_catalogo])
REFERENCES [dbo].[catalogo] ([cod_catalogo])
GO

ALTER TABLE [dbo].[libro_por_catalogo] CHECK CONSTRAINT [FK_libro_por_catalogo_catalogo]
GO




/**********************************************************
	Crear tabla libro_por_disponibilidad
***********************************************************/

ALTER TABLE [dbo].[libro_por_disponibilidad] DROP CONSTRAINT [FK_libro_por_disponibilidad_libro]
GO

ALTER TABLE [dbo].[libro_por_disponibilidad] DROP CONSTRAINT [FK_libro_por_disponibilidad_estado_por_disponibilidad]
GO

/****** Object:  Table [dbo].[libro_por_disponibilidad]    Script Date: 11/6/2020 1:47:31 AM ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[libro_por_disponibilidad]') AND type in (N'U'))
DROP TABLE [dbo].[libro_por_disponibilidad]
GO

/****** Object:  Table [dbo].[libro_por_disponibilidad]    Script Date: 11/6/2020 1:47:31 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[libro_por_disponibilidad](
	[cod_existencia] [int] NOT NULL,
	[cod_libro] [int] NOT NULL,
 CONSTRAINT [PK_libro_por_disponibilidad] PRIMARY KEY CLUSTERED 
(
	[cod_existencia] ASC
)WITH (STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[libro_por_disponibilidad]  WITH CHECK ADD  CONSTRAINT [FK_libro_por_disponibilidad_estado_por_disponibilidad] FOREIGN KEY([cod_existencia])
REFERENCES [dbo].[estado_por_disponibilidad] ([cod_existencia])
GO

ALTER TABLE [dbo].[libro_por_disponibilidad] CHECK CONSTRAINT [FK_libro_por_disponibilidad_estado_por_disponibilidad]
GO

ALTER TABLE [dbo].[libro_por_disponibilidad]  WITH CHECK ADD  CONSTRAINT [FK_libro_por_disponibilidad_libro] FOREIGN KEY([cod_libro])
REFERENCES [dbo].[libro] ([cod_libro])
GO

ALTER TABLE [dbo].[libro_por_disponibilidad] CHECK CONSTRAINT [FK_libro_por_disponibilidad_libro]
GO



/**********************************************************
	Crear tabla libro_tipo
***********************************************************/

/****** Object:  Table [dbo].[libro_tipo]    Script Date: 11/6/2020 1:48:19 AM ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[libro_tipo]') AND type in (N'U'))
DROP TABLE [dbo].[libro_tipo]
GO

/****** Object:  Table [dbo].[libro_tipo]    Script Date: 11/6/2020 1:48:19 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[libro_tipo](
	[cod_tipoLibro] [int] IDENTITY(1,1) NOT NULL,
	[tipo] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_libro_tipo] PRIMARY KEY CLUSTERED 
(
	[cod_tipoLibro] ASC
)WITH (STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO



/**********************************************************
	Crear table pais
***********************************************************/

/****** Object:  Table [dbo].[pais]    Script Date: 11/6/2020 1:49:49 AM ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[pais]') AND type in (N'U'))
DROP TABLE [dbo].[pais]
GO

/****** Object:  Table [dbo].[pais]    Script Date: 11/6/2020 1:49:49 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[pais](
	[cod_pais] [int] IDENTITY(1,1) NOT NULL,
	[pais] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_pais] PRIMARY KEY CLUSTERED 
(
	[cod_pais] ASC
)WITH (STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO



/**********************************************************
	Crear table prestamo
***********************************************************/

ALTER TABLE [dbo].[prestamo] DROP CONSTRAINT [FK_prestamo_tipo_prestamo]
GO

ALTER TABLE [dbo].[prestamo] DROP CONSTRAINT [FK_prestamo_libro_por_disponibilidad]
GO

ALTER TABLE [dbo].[prestamo] DROP CONSTRAINT [FK_prestamo_estudiante]
GO

/****** Object:  Table [dbo].[prestamo]    Script Date: 11/6/2020 1:51:17 AM ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[prestamo]') AND type in (N'U'))
DROP TABLE [dbo].[prestamo]
GO

/****** Object:  Table [dbo].[prestamo]    Script Date: 11/6/2020 1:51:17 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[prestamo](
	[cod_prestamo] [int] IDENTITY(1,1) NOT NULL,
	[cod_existencia] [int] NOT NULL,
	[cod_estudiante] [int] NOT NULL,
	[fecha_prestamo] [date] NOT NULL,
	[fecha_retorno] [date] NOT NULL,
	[fecha_realRetorno] [date] NOT NULL,
	[cod_tipoPrestamo] [char](1) NOT NULL,
	[multa] [int] NULL,
 CONSTRAINT [PK_prestamo] PRIMARY KEY CLUSTERED 
(
	[cod_prestamo] ASC
)WITH (STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[prestamo]  WITH CHECK ADD  CONSTRAINT [FK_prestamo_estudiante] FOREIGN KEY([cod_estudiante])
REFERENCES [dbo].[estudiante] ([cod_estudiante])
GO

ALTER TABLE [dbo].[prestamo] CHECK CONSTRAINT [FK_prestamo_estudiante]
GO

ALTER TABLE [dbo].[prestamo]  WITH CHECK ADD  CONSTRAINT [FK_prestamo_libro_por_disponibilidad] FOREIGN KEY([cod_existencia])
REFERENCES [dbo].[libro_por_disponibilidad] ([cod_existencia])
GO

ALTER TABLE [dbo].[prestamo] CHECK CONSTRAINT [FK_prestamo_libro_por_disponibilidad]
GO

ALTER TABLE [dbo].[prestamo]  WITH CHECK ADD  CONSTRAINT [FK_prestamo_tipo_prestamo] FOREIGN KEY([cod_tipoPrestamo])
REFERENCES [dbo].[tipo_prestamo] ([cod_tipoPrestamo])
GO

ALTER TABLE [dbo].[prestamo] CHECK CONSTRAINT [FK_prestamo_tipo_prestamo]
GO


/**********************************************************
	Crear table tipo_prestamo
***********************************************************/

/****** Object:  Table [dbo].[tipo_prestamo]    Script Date: 11/6/2020 1:51:48 AM ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[tipo_prestamo]') AND type in (N'U'))
DROP TABLE [dbo].[tipo_prestamo]
GO

/****** Object:  Table [dbo].[tipo_prestamo]    Script Date: 11/6/2020 1:51:48 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[tipo_prestamo](
	[cod_tipoPrestamo] [char](1) NOT NULL,
	[tipoPrestamo] [nvarchar](50) NULL,
 CONSTRAINT [PK_tipo_prestamo] PRIMARY KEY CLUSTERED 
(
	[cod_tipoPrestamo] ASC
)WITH (STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO


