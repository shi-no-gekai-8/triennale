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
-- Table structure for table `Segretario`
--

DROP TABLE IF EXISTS `Segretario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Segretario` (
  `CodiceFiscale` varchar(50) NOT NULL,
  `Nome` varchar(50) NOT NULL,
  `Cognome` varchar(50) NOT NULL,
  `Contratto` varchar(50) NOT NULL,
  `#Telefono` varchar(20) DEFAULT NULL,
  `PrenotazioneStruttura` varchar(50) NOT NULL,
  PRIMARY KEY (`CodiceFiscale`),
  UNIQUE KEY `CodiceFiscale_UNIQUE` (`CodiceFiscale`),
  KEY `fk_codStruttura_idx` (`PrenotazioneStruttura`),
  CONSTRAINT `fk_codStruttura2` FOREIGN KEY (`PrenotazioneStruttura`) REFERENCES `Struttura` (`CodiceStruttura`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Segretario`
--

LOCK TABLES `Segretario` WRITE;
/*!40000 ALTER TABLE `Segretario` DISABLE KEYS */;
INSERT INTO `Segretario` VALUES ('DLANTN63A01A294X','Antonio','Dalia','Biennale','3278422383','2647'),('DNNGRD81A18I483A','Gerardo','Donnarumma','Tempo Indeterminato','3388716693','5648'),('MNZMME85C19G813Q','Emma','Manzo','Triennale','3803803820','9087'),('MRRNTN79S14E906P','Antonio','Mirra','Quintennale',NULL,'1023'),('MTRNDR68E15F839U','Andrea','Amitrano','Quadriennale',NULL,'3214');
/*!40000 ALTER TABLE `Segretario` ENABLE KEYS */;
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
