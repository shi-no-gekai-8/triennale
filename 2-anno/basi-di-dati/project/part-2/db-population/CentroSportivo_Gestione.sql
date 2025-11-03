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
-- Table structure for table `Gestione`
--

DROP TABLE IF EXISTS `Gestione`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Gestione` (
  `NomeCentro` varchar(50) NOT NULL,
  `CodiceFiscale` varchar(50) NOT NULL,
  PRIMARY KEY (`CodiceFiscale`,`NomeCentro`),
  UNIQUE KEY `NomeCentro_UNIQUE` (`NomeCentro`),
  UNIQUE KEY `CodiceFiscale_UNIQUE` (`CodiceFiscale`),
  KEY `fk_nomCentro_idx` (`NomeCentro`),
  KEY `fk_codFiscale_idx` (`CodiceFiscale`),
  CONSTRAINT `fk_codFiscale` FOREIGN KEY (`NomeCentro`) REFERENCES `Centro` (`Nome`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_nomCentro1` FOREIGN KEY (`CodiceFiscale`) REFERENCES `Responsabile` (`CodiceFiscale`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Gestione`
--

LOCK TABLES `Gestione` WRITE;
/*!40000 ALTER TABLE `Gestione` DISABLE KEYS */;
INSERT INTO `Gestione` VALUES ('Fitness&Wellness','ZPPLNS00D08H703S'),('Juventus Center','SPSVCN77R17G230N'),('Napoli Campus','PRRGPP76C19B227X'),('Sports&Co','MTRDVD98E20F912E'),('Training Ground','MRNDNT80C06F913O');
/*!40000 ALTER TABLE `Gestione` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-12-09 22:50:19
