-- MySQL dump 10.13  Distrib 8.0.18, for Linux (x86_64)
--
-- Host: localhost    Database: centrosportivo
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
-- Table structure for table `assegnazione`
--

DROP TABLE IF EXISTS `assegnazione`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `assegnazione` (
  `CodiceFiscale` varchar(20) NOT NULL,
  `CodiceAttività` varchar(20) NOT NULL,
  PRIMARY KEY (`CodiceFiscale`,`CodiceAttività`),
  KEY `fk_codFiscale2` (`CodiceFiscale`),
  KEY `fk_codAttività4` (`CodiceAttività`),
  CONSTRAINT `fk_codAttivita3` FOREIGN KEY (`CodiceAttività`) REFERENCES `corso` (`CodiceAttività`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_codFiscale2` FOREIGN KEY (`CodiceFiscale`) REFERENCES `istruttore` (`CodiceFiscale`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `assegnazione`
--

LOCK TABLES `assegnazione` WRITE;
/*!40000 ALTER TABLE `assegnazione` DISABLE KEYS */;
INSERT INTO `assegnazione` VALUES ('DMRLCU00A13D615B','5432'),('FRRMRT80A01C129S','8726'),('PCCLNS99S27A509Y','1258'),('PCCLNS99S27A509Y','9012'),('VTLLRD95T13F912F','7654'),('ZPPRNT80A01A783T','6782');
/*!40000 ALTER TABLE `assegnazione` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-01-10 22:31:37
