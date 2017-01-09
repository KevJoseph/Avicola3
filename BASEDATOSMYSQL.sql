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
  `codpersonal` varchar(8) NOT NULL,
  `nombre_p` varchar(100) DEFAULT NULL,
  `apellido_p` varchar(100) DEFAULT NULL,
  `estado` int(1) DEFAULT NULL,
  `cod_galpon` int(10) unsigned NOT NULL,
  `hora_extra` int(1) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cod_galpon` (`cod_galpon`),
  KEY `codpersonal` (`codpersonal`),
  CONSTRAINT `asistencias_ibfk_2` FOREIGN KEY (`cod_galpon`) REFERENCES `galpones` (`id`),
  CONSTRAINT `codpersonal` FOREIGN KEY (`codpersonal`) REFERENCES `personal` (`codpersonal`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `asistencias`
--

LOCK TABLES `asistencias` WRITE;
/*!40000 ALTER TABLE `asistencias` DISABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `galpones`
--

LOCK TABLES `galpones` WRITE;
/*!40000 ALTER TABLE `galpones` DISABLE KEYS */;
INSERT INTO `galpones` VALUES (1,'1'),(2,'2'),(3,'3');
/*!40000 ALTER TABLE `galpones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `personal`
--

DROP TABLE IF EXISTS `personal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `personal` (
  `codpersonal` varchar(8) NOT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `apellido` varchar(100) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `tipo` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`codpersonal`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `personal`
--

LOCK TABLES `personal` WRITE;
/*!40000 ALTER TABLE `personal` DISABLE KEYS */;
INSERT INTO `personal` VALUES ('1','Kevin','Ramos','2017-01-02','Fijo'),('2','Max','Chumpitaz','2017-01-02','Volante'),('3','Juan','Gutierrez','2017-01-02','Fijo'),('4','Viviana ','Roja ','2017-01-02','Fijo');
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

-- Dump completed on 2017-01-02 15:38:49
