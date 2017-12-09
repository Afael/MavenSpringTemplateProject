/*
SQLyog Ultimate v12.4.3 (64 bit)
MySQL - 10.1.25-MariaDB : Database - ContactManagement
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ContactManagement` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `ContactManagement`;

/*Table structure for table `contactperson` */

DROP TABLE IF EXISTS `contactperson`;

CREATE TABLE `contactperson` (
  `ContactPersonId` int(11) NOT NULL AUTO_INCREMENT,
  `ContactPersonName` varchar(50) DEFAULT NULL,
  `ContactPersonPhone` varchar(12) DEFAULT NULL,
  `ContactPersonEmail` varchar(50) DEFAULT NULL,
  `ContactPersonAddress` varchar(150) DEFAULT NULL,
  `ContactPersonLoginName` varchar(50) NOT NULL,
  `ContactPersonPassword` varchar(50) DEFAULT NULL,
  `ContactPersonRole` int(1) DEFAULT NULL,
  `ContactPersonLoginStatus` int(1) DEFAULT NULL,
  PRIMARY KEY (`ContactPersonId`),
  UNIQUE KEY `UNIQUE` (`ContactPersonLoginName`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `contactperson` */

insert  into `contactperson`(`ContactPersonId`,`ContactPersonName`,`ContactPersonPhone`,`ContactPersonEmail`,`ContactPersonAddress`,`ContactPersonLoginName`,`ContactPersonPassword`,`ContactPersonRole`,`ContactPersonLoginStatus`) values 
(1,'Jajang Jaenal Yusup','082111455499','jajangjayuz87@gmail.com','Jakarta Pusat','afael','4f43L87!@',1,1),
(2,'Anyta Fazmy Elyatine','081221832678','afael@gmail.com','Panyingkiran Sumedang','nyta','nyt0190!@',2,1),
(3,'Amanda Fazmy','082342129900','afazmy@gmail.com','Panyingkiran Sumedang','amanda','afazmy!@',2,1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
