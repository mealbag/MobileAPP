CREATE DATABASE  IF NOT EXISTS `lunchboxdb` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `lunchboxdb`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: lunchboxdb
-- ------------------------------------------------------
-- Server version	5.7.19-log

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
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `Customer_ID` int(11) NOT NULL AUTO_INCREMENT,
  `LoginUserName` varchar(45) NOT NULL,
  `FirstName` varchar(45) NOT NULL,
  `LastName` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL,
  `dob` varchar(45) NOT NULL,
  `MobileNum` varchar(100) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Company` varchar(45) DEFAULT NULL,
  `Address` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`Customer_ID`),
  UNIQUE KEY `LoginUserName_UNIQUE` (`LoginUserName`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='Customer table';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (1,'sairam1','Sai','Ram','sairam','1-feb-1990','4083750836','suresh@gmail.com','infosys','Cedar pond Dr apt 10 Warwick RI-02886'),(2,'ram','ram','raj','admin','15-Aug-1947','4083750837','ram@gmail.com','tcs','40 Cedar pond Dr apt 10 Warwick RI-02886'),(3,'sai','name','laasstname','das','15-sept-1969','1221212','sai@gmail.com',NULL,NULL),(4,'kiran','Kiran','t','kiran1','15-sept-1990','1234567891','kiran@gmail.com',NULL,NULL),(5,'suresh','Suresh','raju','admin','01-jul-1992','2083750836','suresh.raju@gmail.com',NULL,NULL),(7,'suresh3','Suresh','raju','admin','01-jul-1992','1083750836','suresh.raju@gmail.com',NULL,NULL),(8,'suresh4','Suresh','raju','admin','01-jul-1992','9083750836','suresh.raju@gmail.com',NULL,NULL);
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-08-21 16:47:53
