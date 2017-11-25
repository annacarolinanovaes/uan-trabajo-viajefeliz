-- phpMyAdmin SQL Dump
-- version 4.3.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 15-Nov-2017 às 23:15
-- Versão do servidor: 5.6.24
-- PHP Version: 5.6.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `dbviajefeliz`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_alquiler`
--

CREATE TABLE IF NOT EXISTS `tb_alquiler` (
  `codAlquiler` int(11) NOT NULL,
  `fechaInicio` date DEFAULT NULL,
  `fechaFin` date DEFAULT NULL,
  `cantidadPersonas` int(4) DEFAULT NULL,
  `pago` bit(1) DEFAULT NULL,
  `usuarioCod` int(11) DEFAULT NULL,
  `cabanaOCasa` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tb_alquiler`
--

INSERT INTO `tb_alquiler` (`codAlquiler`, `fechaInicio`, `fechaFin`, `cantidadPersonas`, `pago`, `usuarioCod`, `cabanaOCasa`) VALUES
(0, '2017-11-15', '2017-12-13', 2, b'1', 0, 1),
(1, '2017-11-16', '2017-11-21', 1, b'1', 1, 2),
(2, '2017-11-23', '2017-11-24', 1, b'1', 1, 2),
(3, '2017-12-01', '2017-12-04', 3, b'1', 2, 2),
(4, '2018-01-01', '2018-01-07', 3, b'1', 3, 2);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_arrendatario`
--

CREATE TABLE IF NOT EXISTS `tb_arrendatario` (
  `codArrendatario` int(11) NOT NULL,
  `nombreArrendatario` varchar(255) DEFAULT NULL,
  `cedulaCuidadania` int(20) DEFAULT NULL,
  `telefono` varchar(10) DEFAULT NULL,
  `correoElectronicoArrendatario` varchar(45) DEFAULT NULL,
  `contrasenhaArrendatario` varchar(45) DEFAULT NULL,
  `nacionalidadArrendatario` varchar(255) DEFAULT NULL,
  `direccionResidenciaArrendatario` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tb_arrendatario`
--

INSERT INTO `tb_arrendatario` (`codArrendatario`, `nombreArrendatario`, `cedulaCuidadania`, `telefono`, `correoElectronicoArrendatario`, `contrasenhaArrendatario`, `nacionalidadArrendatario`, `direccionResidenciaArrendatario`) VALUES
(0, 'Anna Carolina Novaes', 2147483647, '3053179861', 'anna_carolinanovaes@hotmail.com', '1234', 'Brasil', 'Carrera 69D #24-15');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_cabanaocasa`
--

CREATE TABLE IF NOT EXISTS `tb_cabanaocasa` (
  `codCabanaOCasa` int(11) NOT NULL,
  `nombreCabanaOCasa` varchar(255) DEFAULT NULL,
  `ubicacionCabanaOCasa` varchar(255) DEFAULT NULL,
  `ciudadCabanaOCasa` varchar(255) DEFAULT NULL,
  `precioDiariaCabanaOCasa` double DEFAULT NULL,
  `nroBanosCabanaOCasa` int(2) DEFAULT NULL,
  `nroHabitacionesCabanaOCasa` int(2) DEFAULT NULL,
  `fotoCabanaOCasa` blob,
  `arrendatario` int(11) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tb_cabanaocasa`
--

INSERT INTO `tb_cabanaocasa` (`codCabanaOCasa`, `nombreCabanaOCasa`, `ubicacionCabanaOCasa`, `ciudadCabanaOCasa`, `precioDiariaCabanaOCasa`, `nroBanosCabanaOCasa`, `nroHabitacionesCabanaOCasa`, `fotoCabanaOCasa`, `arrendatario`) VALUES
(1, 'Casa en Bogotá', 'Carrera 69D #24-15', 'Bogotá', 25000, 1, 2, 0x7465737465, 0),
(2, 'Teste', 'Teste', 'Teste', 20000, 1, 2, NULL, 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_encuestasatisfacion`
--

CREATE TABLE IF NOT EXISTS `tb_encuestasatisfacion` (
  `codAvaliacion` int(11) NOT NULL,
  `nota` double DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `cabanaocasa` int(11) DEFAULT NULL,
  `usuario` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tb_encuestasatisfacion`
--

INSERT INTO `tb_encuestasatisfacion` (`codAvaliacion`, `nota`, `descripcion`, `cabanaocasa`, `usuario`) VALUES
(1, 5, 'Muy bueno!', 1, 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_usuario`
--

CREATE TABLE IF NOT EXISTS `tb_usuario` (
  `codUsuario` int(11) NOT NULL,
  `nombreUsuario` varchar(255) DEFAULT NULL,
  `correoelectronico` varchar(255) DEFAULT NULL,
  `contrasenha` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tb_usuario`
--

INSERT INTO `tb_usuario` (`codUsuario`, `nombreUsuario`, `correoelectronico`, `contrasenha`) VALUES
(0, 'annacn', 'anna@gmail.com', '123'),
(1, 'brayans', 'brayan@gmail.com', '321'),
(2, 'arthurfelipe', 'arthur@gmail.com', '123'),
(3, 'rosaferreira', 'rosa@gmail.com', '123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_alquiler`
--
ALTER TABLE `tb_alquiler`
  ADD PRIMARY KEY (`codAlquiler`), ADD KEY `casaOCabana_idx` (`cabanaOCasa`), ADD KEY `usuarioCod_idx` (`usuarioCod`);

--
-- Indexes for table `tb_arrendatario`
--
ALTER TABLE `tb_arrendatario`
  ADD PRIMARY KEY (`codArrendatario`);

--
-- Indexes for table `tb_cabanaocasa`
--
ALTER TABLE `tb_cabanaocasa`
  ADD PRIMARY KEY (`codCabanaOCasa`), ADD KEY `idArrendatario_idx` (`arrendatario`);

--
-- Indexes for table `tb_encuestasatisfacion`
--
ALTER TABLE `tb_encuestasatisfacion`
  ADD PRIMARY KEY (`codAvaliacion`), ADD KEY `usuario_idx` (`usuario`), ADD KEY `cabanaocasa_idx` (`cabanaocasa`);

--
-- Indexes for table `tb_usuario`
--
ALTER TABLE `tb_usuario`
  ADD PRIMARY KEY (`codUsuario`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_cabanaocasa`
--
ALTER TABLE `tb_cabanaocasa`
  MODIFY `codCabanaOCasa` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `tb_alquiler`
--
ALTER TABLE `tb_alquiler`
ADD CONSTRAINT `casaOCabana` FOREIGN KEY (`cabanaOCasa`) REFERENCES `tb_cabanaocasa` (`codCabanaOCasa`) ON UPDATE CASCADE;

--
-- Limitadores para a tabela `tb_cabanaocasa`
--
ALTER TABLE `tb_cabanaocasa`
ADD CONSTRAINT `arrendatario` FOREIGN KEY (`arrendatario`) REFERENCES `tb_arrendatario` (`codArrendatario`) ON UPDATE CASCADE;

--
-- Limitadores para a tabela `tb_encuestasatisfacion`
--
ALTER TABLE `tb_encuestasatisfacion`
ADD CONSTRAINT `cabanaocasa` FOREIGN KEY (`cabanaocasa`) REFERENCES `tb_cabanaocasa` (`codCabanaOCasa`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `usuario` FOREIGN KEY (`usuario`) REFERENCES `tb_usuario` (`codUsuario`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
