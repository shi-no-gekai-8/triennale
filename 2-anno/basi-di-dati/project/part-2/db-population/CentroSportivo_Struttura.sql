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
-- Table structure for table `Struttura`
--

DROP TABLE IF EXISTS `Struttura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Struttura` (
  `CodiceStruttura` varchar(50) NOT NULL,
  `Areale` float NOT NULL,
  `AttrezzatureSala` varchar(50) DEFAULT NULL,
  `TipologiaCampo` varchar(50) NOT NULL,
  `NomeCentro` varchar(50) NOT NULL,
  `DataPrenotazione` varchar(20) DEFAULT NULL,
  `OraPrenotazione` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`CodiceStruttura`),
  UNIQUE KEY `CodiceStruttura_UNIQUE` (`CodiceStruttura`),
  KEY `fk_nomCentro_idx` (`NomeCentro`),
  CONSTRAINT `fk_nomCentro2` FOREIGN KEY (`NomeCentro`) REFERENCES `Centro` (`Nome`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Struttura`
--

LOCK TABLES `Struttura` WRITE;
/*!40000 ALTER TABLE `Struttura` DISABLE KEYS */;
INSERT INTO `Struttura` VALUES ('1023',1500,'Si','Aperto','Napoli Campus','05/12/2018','09:45'),('2647',500,'Sì','Aperto','Fitness&Wellness','15/06/2018','17:30'),('3214',1000,'No','Chiuso','Training Ground','10/10/2018','21:00'),('5648',350,'Si','Aperto','Sports&Co','30/09/2019','12:05'),('9087',600.5,'No','Chiuso','Juventus Center','26/01/2019','19:30');
/*!40000 ALTER TABLE `Struttura` ENABLE KEYS */;
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
