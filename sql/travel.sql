-- MySQL dump 10.13  Distrib 8.0.12, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: travel
-- ------------------------------------------------------
-- Server version	8.0.12

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `icon`
--

DROP TABLE IF EXISTS `icon`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `icon` (
  `id` varchar(255) NOT NULL,
  `img_url` varchar(256) DEFAULT NULL,
  `icon_desc` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `icon`
--

LOCK TABLES `icon` WRITE;
/*!40000 ALTER TABLE `icon` DISABLE KEYS */;
INSERT INTO `icon` VALUES ('0001','http://img1.qunarzz.com/piao/fusion/1803/95/f3dd6c383aeb3b02.png','景点门票'),('0002','http://img1.qunarzz.com/piao/fusion/1803/f5/a963333e1fa802.png','本地玩乐'),('0003','https://img1.qunarzz.com/piao/fusion/1803/20/831d62d2e1c7be02.png','名胜风景'),('0004','http://img1.qunarzz.com/piao/fusion/1804/5a/13ceb38dcf262f02.png','一日游'),('0005','http://img1.qunarzz.com/piao/fusion/1803/95/8246f27355943202.png','游乐场'),('0006','http://img1.qunarzz.com/piao/fusion/1803/ab/6f7d6e44963c9302.png','泡温泉'),('0007','http://img1.qunarzz.com/piao/fusion/1804/ff/fdf170ee89594b02.png','世界必游'),('0008','http://img1.qunarzz.com/piao/fusion/1803/ec/0e1e0238e24ba02.png','节日景点'),('0009','http://img1.qunarzz.com/piao/fusion/1803/3e/86314b2af03b7502.png','万达乐园');
/*!40000 ALTER TABLE `icon` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `recommend`
--

DROP TABLE IF EXISTS `recommend`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `recommend` (
  `id` varchar(255) NOT NULL,
  `img_url` varchar(256) DEFAULT NULL,
  `reco_desc` varchar(128) DEFAULT NULL,
  `title` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recommend`
--

LOCK TABLES `recommend` WRITE;
/*!40000 ALTER TABLE `recommend` DISABLE KEYS */;
INSERT INTO `recommend` VALUES ('0001','http://img1.qunarzz.com/sight/p0/1610/83/83a873f755d64992a3.water.jpg_200x200_f7acbacd.jpg','红古滩风景区,旅游胜地','万达主题乐园'),('0002','http://img1.qunarzz.com/sight/p0/1711/63/6340336461c16842a3.img.png_200x200_ac63191b.png','国际旅游的首选温泉池','金燕国际温泉'),('0003','http://img1.qunarzz.com/sight/p0/1410/21/67f72f6b54ede94fae27e32d6ba92ae5.jpg_200x200_e85f5596.jpg','极地温泉,让你欲罢不能','北极天幕温泉'),('0004','http://img1.qunarzz.com/sight/p0/1705/1c/1c9ea91d1d73e159a3.water.jpg_200x200_7d604203.jpg','感受中国文化的魅力','文化旅游城');
/*!40000 ALTER TABLE `recommend` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `swiper`
--

DROP TABLE IF EXISTS `swiper`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `swiper` (
  `id` varchar(255) NOT NULL,
  `img_url` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `swiper`
--

LOCK TABLES `swiper` WRITE;
/*!40000 ALTER TABLE `swiper` DISABLE KEYS */;
INSERT INTO `swiper` VALUES ('0001','http://192.168.1.7:8080/imgs/home/swiper_1.jpg'),('0002','http://192.168.1.7:8080/imgs/home/swiper_2.jpeg'),('0003','http://192.168.1.7:8080/imgs/home/swiper_3.jpg');
/*!40000 ALTER TABLE `swiper` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `weekend`
--

DROP TABLE IF EXISTS `weekend`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `weekend` (
  `id` varchar(255) NOT NULL,
  `img_url` varchar(256) DEFAULT NULL,
  `title` varchar(32) DEFAULT NULL,
  `weekend_desc` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `weekend`
--

LOCK TABLES `weekend` WRITE;
/*!40000 ALTER TABLE `weekend` DISABLE KEYS */;
INSERT INTO `weekend` VALUES ('0001','http://img1.qunarzz.com/sight/source/1505/bd/688c12889af7ad.jpg_r_640x214_cc490c32.jpg','七彩摩天轮','感受夜晚灯光的绚丽色彩'),('0002','http://img1.qunarzz.com/sight/source/1510/de/2c2ca6e158f80f.jpg_r_640x214_2385de27.jpg','天山温泉','你没有玩过的温泉池'),('0003','http://img1.qunarzz.com/sight/p0/1602/49/4917c5b8d400d5b890.img.jpg_640x276_94c1abd2.jpg','北海道草原','平静的世界一极草原'),('0004','http://img1.qunarzz.com/sight/p0/201311/05/23daced01bd5072fc8d65eac.jpg_640x276_5a546be0.jpg','文化旅游城','感受中国文化的魅力');
/*!40000 ALTER TABLE `weekend` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-02-19  3:36:40
