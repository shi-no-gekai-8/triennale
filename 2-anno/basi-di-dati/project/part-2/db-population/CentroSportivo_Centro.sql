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
-- Table structure for table `Centro`
--

DROP TABLE IF EXISTS `Centro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Centro` (
  `Nome` varchar(50) NOT NULL,
  `Città` varchar(50) NOT NULL,
  `CAP` int(5) NOT NULL,
  `Via` varchar(50) NOT NULL,
  `#NumeroCivico` int(11) NOT NULL,
  `#Fax` varchar(20) DEFAULT NULL,
  `#Telefono` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Nome`),
  UNIQUE KEY `Nome_UNIQUE` (`Nome`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Centro`
--

LOCK TABLES `Centro` WRITE;
/*!40000 ALTER TABLE `Centro` DISABLE KEYS */;
INSERT INTO `Centro` VALUES ('Fitness&Wellness','Salerno',84100,'Piazza Alfano',10,'0892964497	','0894964497'),('Juventus Center','Pagani',84016,'Via Corallo',33,NULL,NULL),('Napoli Campus','Napoli',80121,'Via Partenope',26,'0812451987',NULL),('Sports&Co','Nocera Inferiore',84014,'Via Fucilari',41,'081765086','081793086'),('Training Ground','Nocera Superiore',84015,'Via Nicotera',12,NULL,'0815153687	');
/*!40000 ALTER TABLE `Centro` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-12-09 22:50:17
