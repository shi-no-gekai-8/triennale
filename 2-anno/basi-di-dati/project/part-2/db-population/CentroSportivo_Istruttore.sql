-- MySQL dump 10.13  Distrib 8.0.18, for Linux (x86_64)
--
-- Host: localhost    Database: CentroSportivo
-- ------------------------------------------------------
-- Server version	8.0.18

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Istruttore`
--

DROP TABLE IF EXISTS `Istruttore`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Istruttore` (
  `CodiceFiscale` varchar(50) NOT NULL,
  `Nome` varchar(50) NOT NULL,
  `Cognome` varchar(50) NOT NULL,
  `Contratto` varchar(50) NOT NULL,
  `#Telefono` varchar(20) DEFAULT NULL,
  `Riconoscimento` varchar(50) DEFAULT NULL,
  `AnniEsperienza` int(11) DEFAULT NULL,
  `Documento` varchar(200) DEFAULT NULL,
  `TipoDocumento` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`CodiceFiscale`),
  UNIQUE KEY `CodiceFiscale_UNIQUE` (`CodiceFiscale`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Istruttore`
--

LOCK TABLES `Istruttore` WRITE;
/*!40000 ALTER TABLE `Istruttore` DISABLE KEYS */;
INSERT INTO `Istruttore` VALUES ('DMRLCU00A13D615B','Luca','De Martino','Tempo Indeterminato','3888580018',NULL,3,NULL,NULL),('FRRMRT80A01C129S','Umberto','Ferrara','Annuale',NULL,'3° Olimpiadi di Londra 2012',10,'attestato','laurea in scienze motorie'),('PCCLNS99S27A509Y','Alfonso','Piccolo','Biennale','3884628196',NULL,2,'attestato','diploma liceo scientifico'),('VTLLRD95T13F912F','Alfredo','Vitelli','Triennale','3491289515','1° posto Victory Cup(calcio dilettantistico)',5,'attestato','diploma liceo classico'),('ZPPRNT80A01A783T','Renato','Zappia','Tempo Indeterminato','3475516471','2° Posto Olimpiadi Regionali',10,'attestato','laurea in scienze motorie');
/*!40000 ALTER TABLE `Istruttore` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-12-09 22:50:18
