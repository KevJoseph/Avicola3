CREATE DATABASE  IF NOT EXISTS `bd_avicola` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `bd_avicola`;
-- MySQL dump 10.13  Distrib 5.5.53, for debian-linux-gnu (x86_64)
--
-- Host: 127.0.0.1    Database: bd_avicola
-- ------------------------------------------------------
-- Server version	5.5.53-0ubuntu0.14.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `asistencias`
--

DROP TABLE IF EXISTS `asistencias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `asistencias` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `idpersonal` int(10) unsigned NOT NULL,
  `codpersonal` varchar(8) DEFAULT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `apellido` varchar(100) DEFAULT NULL,
  `idgalpon` int(10) unsigned NOT NULL DEFAULT '1',
  `estado` int(1) DEFAULT NULL,
  `hora_extra` int(1) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `asistencias_ibfk_1` (`idpersonal`),
  KEY `asistencias_ibfk_2` (`idgalpon`),
  CONSTRAINT `asistencias_ibfk_1` FOREIGN KEY (`idpersonal`) REFERENCES `personal` (`id`),
  CONSTRAINT `asistencias_ibfk_2` FOREIGN KEY (`idgalpon`) REFERENCES `galpones` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `asistencias`
--

LOCK TABLES `asistencias` WRITE;
/*!40000 ALTER TABLE `asistencias` DISABLE KEYS */;
INSERT INTO `asistencias` VALUES (1,1,'77167125','Kevin','Ramos',1,NULL,NULL,NULL),(2,2,'77167125','Juan','Sanchez',1,NULL,NULL,NULL),(4,1,'77167125','Kevin','Ramos',1,NULL,NULL,NULL),(5,2,'77167125','Juan','Sanchez',1,NULL,NULL,NULL),(7,1,'77167125','Kevin','Ramos',1,NULL,NULL,NULL),(8,2,'77167125','Juan','Sanchez',1,NULL,NULL,NULL),(10,1,'77167125','Kevin','Ramos',1,NULL,NULL,NULL),(11,2,'77167125','Juan','Sanchez',1,NULL,NULL,NULL),(13,1,'77167125','Kevin','Ramos',1,NULL,NULL,NULL),(14,2,'77167125','Juan','Sanchez',1,NULL,NULL,NULL),(16,1,'77167125','Kevin','Ramos',1,NULL,NULL,NULL),(17,2,'77167125','Juan','Sanchez',1,NULL,NULL,NULL),(19,1,'77167125','Kevin','Ramos',1,NULL,NULL,NULL),(20,2,'77167125','Juan','Sanchez',1,NULL,NULL,NULL),(22,1,'77167125','Kevin','Ramos',1,NULL,NULL,NULL),(23,2,'77167125','Juan','Sanchez',1,NULL,NULL,NULL),(25,1,'77167125','Kevin','Ramos',1,NULL,NULL,NULL),(26,2,'77167125','Juan','Sanchez',1,NULL,NULL,NULL);
/*!40000 ALTER TABLE `asistencias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `descansos`
--

DROP TABLE IF EXISTS `descansos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `descansos` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nombre_p` varchar(100) DEFAULT NULL,
  `apellido_p` varchar(100) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `estado` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `descansos`
--

LOCK TABLES `descansos` WRITE;
/*!40000 ALTER TABLE `descansos` DISABLE KEYS */;
/*!40000 ALTER TABLE `descansos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `galpones`
--

DROP TABLE IF EXISTS `galpones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `galpones` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `numero_galpon` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `galpones`
--

LOCK TABLES `galpones` WRITE;
/*!40000 ALTER TABLE `galpones` DISABLE KEYS */;
INSERT INTO `galpones` VALUES (1,'1');
/*!40000 ALTER TABLE `galpones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `personal`
--

DROP TABLE IF EXISTS `personal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `personal` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `codpersonal` varchar(8) DEFAULT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `apellido` varchar(100) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `tipo` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `personal`
--

LOCK TABLES `personal` WRITE;
/*!40000 ALTER TABLE `personal` DISABLE KEYS */;
INSERT INTO `personal` VALUES (1,'77167125','Kevin','Ramos','2017-01-09','Fijo'),(2,'77167125','Juan','Sanchez','2017-01-09','Fijo');
/*!40000 ALTER TABLE `personal` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-01-09  7:29:03
