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
-- Table structure for table `svolgimento`
--

DROP TABLE IF EXISTS `svolgimento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `svolgimento` (
  `CodiceStruttura` varchar(50) NOT NULL,
  `CodiceAttività` varchar(20) NOT NULL,
  `DataPrenotazione` date NOT NULL,
  `OraPrenotazione` time NOT NULL,
  `DurataPrenotazione` time NOT NULL,
  PRIMARY KEY (`CodiceStruttura`,`CodiceAttività`),
  KEY `fk_codStruttura_idx` (`CodiceStruttura`),
  KEY `fk_codAttivitaSportiva_idx` (`CodiceAttività`),
  CONSTRAINT `fk_codAttivita1` FOREIGN KEY (`CodiceAttività`) REFERENCES `attivitàsportiva` (`CodiceAttività`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_codStruttura1` FOREIGN KEY (`CodiceStruttura`) REFERENCES `struttura` (`CodiceStruttura`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `svolgimento`
--

LOCK TABLES `svolgimento` WRITE;
/*!40000 ALTER TABLE `svolgimento` DISABLE KEYS */;
INSERT INTO `svolgimento` VALUES ('1023','5432','2018-12-05','16:30:00','03:00:00'),('1023','8726','2018-12-05','09:45:00','02:30:00'),('1840','5432','2020-01-02','18:00:00','03:00:00'),('2647','6782','2018-06-15','17:30:00','03:30:00'),('3214','5432','2018-10-10','21:00:00','01:00:00'),('5648','5432','2019-09-30','12:05:00','04:00:00'),('5648','9012','2019-01-26','19:30:00','02:45:00');
/*!40000 ALTER TABLE `svolgimento` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-01-10 22:31:36
