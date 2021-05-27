-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-05-2021 a las 08:38:37
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.4.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `deliverybufa`
--
CREATE DATABASE IF NOT EXISTS `deliverybufa` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `deliverybufa`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `IdCliente` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `DNI` varchar(100) NOT NULL,
  `Nómina` int(100) NOT NULL,
  `Tipo de Vehiculo` varchar(100) NOT NULL,
  `Carnet` varchar(100) NOT NULL,
  `Numero de Repartos` int(100) NOT NULL,
  `IdEmpleado` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`DNI`, `Nómina`, `Tipo de Vehiculo`, `Carnet`, `Numero de Repartos`, `IdEmpleado`) VALUES
('20943454D', 34543, 'Turismo', 'B', 0, 1),
('34534545E', 65756756, 'Moto', 'AM', 0, 2),
('23445454F', 98709887, 'Bicicleta', 'Ninguno', 0, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empresa`
--

CREATE TABLE `empresa` (
  `Codigo` int(100) NOT NULL,
  `Nombre` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `empresa`
--

INSERT INTO `empresa` (`Codigo`, `Nombre`) VALUES
(1, 'McDonald\'s'),
(2, 'Burger King'),
(3, 'Telepizza'),
(4, 'Foster\'s Hollywood');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `localidad`
--

CREATE TABLE `localidad` (
  `Codigo` int(100) NOT NULL,
  `Nombre` varchar(100) NOT NULL,
  `Codigo Postal` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `localidad`
--

INSERT INTO `localidad` (`Codigo`, `Nombre`, `Codigo Postal`) VALUES
(1, 'L\'Alcúdia', 46250),
(2, 'Carcaixent', 46740),
(3, 'Alzira', 46600),
(4, 'Benimodo', 46291);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `menu`
--

CREATE TABLE `menu` (
  `Código` int(100) NOT NULL,
  `Nombre` varchar(100) NOT NULL,
  `Precio` int(100) NOT NULL,
  `CodigoEmrpesa` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `menu`
--

INSERT INTO `menu` (`Código`, `Nombre`, `Precio`, `CodigoEmrpesa`) VALUES
(1, 'BigMac', 8, 1),
(2, 'BigKing', 8, 2),
(3, 'Margarita', 10, 3),
(4, 'Costilla', 12, 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE `pedido` (
  `IdPedido` int(100) NOT NULL,
  `Menu` varchar(100) NOT NULL,
  `Fecha del Pedido` date NOT NULL,
  `Hora del Pedido` date NOT NULL,
  `Precio del Pedido` int(100) NOT NULL,
  `Estado del Pedido` int(11) NOT NULL,
  `CodigoLocalidad` int(100) NOT NULL,
  `IdCliente` int(100) NOT NULL,
  `IdEmpleado` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `ID` int(100) NOT NULL,
  `Nombre` varchar(100) NOT NULL,
  `Apellidos` varchar(100) NOT NULL,
  `Nombre de usuario` varchar(100) NOT NULL,
  `Contraseña` varchar(100) NOT NULL,
  `Correo` varchar(100) NOT NULL,
  `Direccion` varchar(100) NOT NULL,
  `Localidad` varchar(100) NOT NULL,
  `Codigo Postal` int(100) NOT NULL,
  `Fecha de Nacimiento` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`ID`, `Nombre`, `Apellidos`, `Nombre de usuario`, `Contraseña`, `Correo`, `Direccion`, `Localidad`, `Codigo Postal`, `Fecha de Nacimiento`) VALUES
(1, 'Eric', 'Quintero Moreno', 'eeriic20', '1234', 'ericquintero2002@gmail.com', 'Calle rey Jaume', 'Alberic', 46324, '2002-04-18'),
(2, 'David', 'Ortolá Guerrero', 'david7', '1234', 'davidortola2000@gmail.com', 'Carrer san jimeno', 'Carcagente', 46740, '2000-12-18'),
(3, 'Alex', 'Ripoll Perez', 'elxulillodetubarrio', '1234', 'elxulillodetubarrio@gmail.com', 'Carrer la plumilla', 'Alzira', 46600, '2007-11-22');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sirve`
--

CREATE TABLE `sirve` (
  `CodigoLocalidad` int(100) NOT NULL,
  `CodigoEmpresa` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `sirve`
--

INSERT INTO `sirve` (`CodigoLocalidad`, `CodigoEmpresa`) VALUES
(1, 3),
(2, 2),
(3, 1),
(3, 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tiene`
--

CREATE TABLE `tiene` (
  `CodigoMenu` int(100) NOT NULL,
  `IdPedido` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`IdCliente`);

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`IdEmpleado`);

--
-- Indices de la tabla `empresa`
--
ALTER TABLE `empresa`
  ADD PRIMARY KEY (`Codigo`);

--
-- Indices de la tabla `localidad`
--
ALTER TABLE `localidad`
  ADD PRIMARY KEY (`Codigo`);

--
-- Indices de la tabla `menu`
--
ALTER TABLE `menu`
  ADD PRIMARY KEY (`Código`),
  ADD KEY `CodigoEmrpesa` (`CodigoEmrpesa`);

--
-- Indices de la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`IdPedido`),
  ADD KEY `CodigoLocalidad` (`CodigoLocalidad`),
  ADD KEY `IdCliente` (`IdCliente`),
  ADD KEY `IdEmpleado` (`IdEmpleado`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `sirve`
--
ALTER TABLE `sirve`
  ADD PRIMARY KEY (`CodigoLocalidad`,`CodigoEmpresa`),
  ADD KEY `CodigoEmpresa` (`CodigoEmpresa`);

--
-- Indices de la tabla `tiene`
--
ALTER TABLE `tiene`
  ADD PRIMARY KEY (`CodigoMenu`,`IdPedido`),
  ADD KEY `IdPedido` (`IdPedido`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `empresa`
--
ALTER TABLE `empresa`
  MODIFY `Codigo` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `localidad`
--
ALTER TABLE `localidad`
  MODIFY `Codigo` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `menu`
--
ALTER TABLE `menu`
  MODIFY `Código` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `pedido`
--
ALTER TABLE `pedido`
  MODIFY `IdPedido` int(100) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `persona`
--
ALTER TABLE `persona`
  MODIFY `ID` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD CONSTRAINT `cliente_ibfk_1` FOREIGN KEY (`IdCliente`) REFERENCES `persona` (`ID`);

--
-- Filtros para la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD CONSTRAINT `empleado_ibfk_1` FOREIGN KEY (`IdEmpleado`) REFERENCES `persona` (`ID`);

--
-- Filtros para la tabla `menu`
--
ALTER TABLE `menu`
  ADD CONSTRAINT `menu_ibfk_1` FOREIGN KEY (`CodigoEmrpesa`) REFERENCES `empresa` (`Codigo`);

--
-- Filtros para la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD CONSTRAINT `pedido_ibfk_1` FOREIGN KEY (`CodigoLocalidad`) REFERENCES `localidad` (`Codigo`),
  ADD CONSTRAINT `pedido_ibfk_2` FOREIGN KEY (`IdCliente`) REFERENCES `cliente` (`IdCliente`),
  ADD CONSTRAINT `pedido_ibfk_3` FOREIGN KEY (`IdEmpleado`) REFERENCES `empleado` (`IdEmpleado`);

--
-- Filtros para la tabla `sirve`
--
ALTER TABLE `sirve`
  ADD CONSTRAINT `sirve_ibfk_1` FOREIGN KEY (`CodigoEmpresa`) REFERENCES `empresa` (`Codigo`),
  ADD CONSTRAINT `sirve_ibfk_2` FOREIGN KEY (`CodigoLocalidad`) REFERENCES `localidad` (`Codigo`);

--
-- Filtros para la tabla `tiene`
--
ALTER TABLE `tiene`
  ADD CONSTRAINT `tiene_ibfk_1` FOREIGN KEY (`CodigoMenu`) REFERENCES `menu` (`Código`),
  ADD CONSTRAINT `tiene_ibfk_2` FOREIGN KEY (`IdPedido`) REFERENCES `pedido` (`IdPedido`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
