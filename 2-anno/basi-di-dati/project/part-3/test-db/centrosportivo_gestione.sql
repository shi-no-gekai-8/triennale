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
-- Table structure for table `gestione`
--

DROP TABLE IF EXISTS `gestione`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `gestione` (
  `NomeCentro` varchar(50) NOT NULL,
  `CodiceFiscale` varchar(20) NOT NULL,
  PRIMARY KEY (`NomeCentro`,`CodiceFiscale`),
  UNIQUE KEY `NomeCentro_UNIQUE` (`NomeCentro`),
  KEY `fk_nomCentro_idx` (`NomeCentro`),
  KEY `fk_codFiscale_idx` (`CodiceFiscale`),
  CONSTRAINT `fk_codFiscale1` FOREIGN KEY (`CodiceFiscale`) REFERENCES `responsabile` (`CodiceFiscale`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_nomCentro1` FOREIGN KEY (`NomeCentro`) REFERENCES `centro` (`Nome`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gestione`
--

LOCK TABLES `gestione` WRITE;
/*!40000 ALTER TABLE `gestione` DISABLE KEYS */;
INSERT INTO `gestione` VALUES ('Sports&Co','MTRDVD98E20F912E'),('Napoli Campus','PRRGPP76C19B227X'),('Juventus Center','SPSVCN77R17G230N'),('Training Ground','TRMDLD46L14Z404B'),('Fitness&Wellness','ZPPLNS00D08H703S');
/*!40000 ALTER TABLE `gestione` ENABLE KEYS */;
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
