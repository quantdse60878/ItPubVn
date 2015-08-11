-- MySQL dump 10.13  Distrib 5.6.24, for Win64 (x86_64)
--
-- Host: localhost    Database: xml2015
-- ------------------------------------------------------
-- Server version	5.7.8-rc-log

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
-- Dumping data for table `brand`
--

LOCK TABLES `brand` WRITE;
/*!40000 ALTER TABLE `brand` DISABLE KEYS */;
INSERT INTO `brand` VALUES (1,'Apple','Apple mobile'),(2,'Samsung','Samsung Electronics'),(3,'NOKIA - Microsoft','NOKIA'),(4,'Asus','Asus Zenfone'),(5,'LG','LG'),(6,'HTC','HTC'),(7,'Vertu','Vertu'),(8,'Mobiado','Mobiado');
/*!40000 ALTER TABLE `brand` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `devicetype`
--

LOCK TABLES `devicetype` WRITE;
/*!40000 ALTER TABLE `devicetype` DISABLE KEYS */;
INSERT INTO `devicetype` VALUES (1,'Smartphone','Mobile device'),(2,'Tablet','Tablet'),(3,'Phablet','Phablet'),(4,'Luxury Mobile','Luxury Mobile');
/*!40000 ALTER TABLE `devicetype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `importschedule`
--

LOCK TABLES `importschedule` WRITE;
/*!40000 ALTER TABLE `importschedule` DISABLE KEYS */;
INSERT INTO `importschedule` VALUES (1,'Apple IPhone 5',0,0,'http://cellphones.com.vn/mobile/iphone-5.html','//div[@class=\'category-products\']//h2[@class=\'product-name\']//a','//*[@id=\'product_addtocart_form\']/div[2]/div[1]/div[1]/h1','//*[@id=\'product_addtocart_form\']/div[2]/div[1]/div[4]/div','//*[@id=\'product_addtocart_form\']/div[2]/div[1]/div[5]/div','//*[@id=\'product_addtocart_form\']/div[2]/div[3]/div[2]/div[1]/div','//*[@id=\'image\']','//*[@id=\'price\']','\'http://localhost:8080\'','//div[@class=\'content-thongso\']//ul//li',1,1,1,'2015-08-11 00:00:00','2015-08-11 00:00:00'),(2,'Apple IPhone 6',0,0,'http://cellphones.com.vn/mobile/iphone-6.html','//div[@class=\'category-products\']//h2[@class=\'product-name\']//a','//*[@id=\'product_addtocart_form\']/div[2]/div[1]/div[1]/h1','//*[@id=\'product_addtocart_form\']/div[2]/div[1]/div[4]/div','//*[@id=\'product_addtocart_form\']/div[2]/div[1]/div[5]/div','//*[@id=\'product_addtocart_form\']/div[2]/div[3]/div[2]/div[1]/div','//*[@id=\'image\']','//*[@id=\'price\']','\'http://localhost:8080\'','//div[@class=\'content-thongso\']//ul//li',1,1,1,'2015-08-11 00:00:00','2015-08-11 00:00:00'),(3,'Apple IPhone 5S',0,0,'http://cellphones.com.vn/mobile/iphone-5s.html','//div[@class=\'category-products\']//h2[@class=\'product-name\']//a','//*[@id=\'product_addtocart_form\']/div[2]/div[1]/div[1]/h1','//*[@id=\'product_addtocart_form\']/div[2]/div[1]/div[4]/div','//*[@id=\'product_addtocart_form\']/div[2]/div[1]/div[5]/div','//*[@id=\'product_addtocart_form\']/div[2]/div[3]/div[2]/div[1]/div','//*[@id=\'image\']','//*[@id=\'price\']','\'http://localhost:8080\'','//div[@class=\'content-thongso\']//ul//li',1,1,1,'2015-08-11 00:00:00','2015-08-11 00:00:00'),(4,'Apple IPhone 6S',0,0,'http://cellphones.com.vn/mobile/iphone-6-plus.html','//div[@class=\'category-products\']//h2[@class=\'product-name\']//a','//*[@id=\'product_addtocart_form\']/div[2]/div[1]/div[1]/h1','//*[@id=\'product_addtocart_form\']/div[2]/div[1]/div[4]/div','//*[@id=\'product_addtocart_form\']/div[2]/div[1]/div[5]/div','//*[@id=\'product_addtocart_form\']/div[2]/div[3]/div[2]/div[1]/div','//*[@id=\'image\']','//*[@id=\'price\']','\'http://localhost:8080\'','//div[@class=\'content-thongso\']//ul//li',1,1,1,'2015-08-11 00:00:00','2015-08-11 00:00:00');
/*!40000 ALTER TABLE `importschedule` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `inventory`
--

LOCK TABLES `inventory` WRITE;
/*!40000 ALTER TABLE `inventory` DISABLE KEYS */;
/*!40000 ALTER TABLE `inventory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `inventorytracking`
--

LOCK TABLES `inventorytracking` WRITE;
/*!40000 ALTER TABLE `inventorytracking` DISABLE KEYS */;
/*!40000 ALTER TABLE `inventorytracking` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `order`
--

LOCK TABLES `order` WRITE;
/*!40000 ALTER TABLE `order` DISABLE KEYS */;
/*!40000 ALTER TABLE `order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `orderdetail`
--

LOCK TABLES `orderdetail` WRITE;
/*!40000 ALTER TABLE `orderdetail` DISABLE KEYS */;
/*!40000 ALTER TABLE `orderdetail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `productinfo`
--

LOCK TABLES `productinfo` WRITE;
/*!40000 ALTER TABLE `productinfo` DISABLE KEYS */;
/*!40000 ALTER TABLE `productinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'system','Automatic System'),(2,'admin','Admin'),(3,'customer','Customer'),(4,'staff','Staff');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'system','system','System',0,'vi-VN',NULL,NULL,NULL,0),(2,'admin','admin','Admin',0,'vi-VN',NULL,NULL,NULL,0);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `userrole`
--

LOCK TABLES `userrole` WRITE;
/*!40000 ALTER TABLE `userrole` DISABLE KEYS */;
INSERT INTO `userrole` VALUES (1,1,1),(2,2,2);
/*!40000 ALTER TABLE `userrole` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-08-11 23:20:29
