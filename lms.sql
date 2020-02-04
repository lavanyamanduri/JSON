-- MySQL dump 10.13  Distrib 5.7.28, for Linux (x86_64)
--
-- Host: localhost    Database: LMS
-- ------------------------------------------------------
-- Server version	5.7.28-0ubuntu0.18.04.4

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
-- Table structure for table `CandidateBankDetails`
--

DROP TABLE IF EXISTS `CandidateBankDetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CandidateBankDetails` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Candidate_Id` varchar(5) DEFAULT NULL,
  `Name` varchar(30) DEFAULT NULL,
  `AccountNumber` varchar(20) DEFAULT NULL,
  `Is_AccountNumber_Verified` varchar(5) DEFAULT NULL,
  `Ifsc_Code` int(11) DEFAULT NULL,
  `Is_Ifsc_Code_Verified` varchar(5) DEFAULT NULL,
  `Pan_Number` varchar(20) DEFAULT NULL,
  `Is_Pan_Number_Verified` varchar(5) DEFAULT NULL,
  `Aadhar_Number` varchar(20) DEFAULT NULL,
  `Is_Aadhar_Number_verified` varchar(5) DEFAULT NULL,
  `Creator_Stamp` date DEFAULT NULL,
  PRIMARY KEY (`ID`),
  CONSTRAINT `CandidateBankDetails_ibfk_1` FOREIGN KEY (`ID`) REFERENCES `UserDetails` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CandidateBankDetails`
--

LOCK TABLES `CandidateBankDetails` WRITE;
/*!40000 ALTER TABLE `CandidateBankDetails` DISABLE KEYS */;
INSERT INTO `CandidateBankDetails` VALUES (1,'B101','AjayKumar','25642887456554','Yes',5615246,'Yes','ERJPM8654D','Yes','80556430582','Yes','2019-12-12'),(2,'B102','BhanuKumar','256428874896554','Yes',56155846,'Yes','QWEM8654D','Yes','86566430582','Yes','2019-12-13'),(3,'B103','ChanduRaj','25642889276454','Yes',56155848,'Yes','QWEM86564D','Yes','86568430582','Yes','2019-12-12'),(4,'B104','SamJohn','245465576454','Yes',56155658,'Yes','QKEM86564D','Yes','86568430582','Yes','2019-12-12'),(5,'B105','SritiRajYadav','245549655454','Yes',5155658,'Yes','QKEM865564D','Yes','86568425582','Yes','2019-12-12');
/*!40000 ALTER TABLE `CandidateBankDetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CandidateDocuments`
--

DROP TABLE IF EXISTS `CandidateDocuments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CandidateDocuments` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Candidate_Id` varchar(5) NOT NULL,
  `Doc_Type` varchar(50) NOT NULL,
  `Doc_Path` varchar(100) NOT NULL,
  `Status` varchar(10) NOT NULL,
  `Creator_Stamp` date DEFAULT NULL,
  PRIMARY KEY (`ID`),
  CONSTRAINT `CandidateDocuments_ibfk_1` FOREIGN KEY (`ID`) REFERENCES `UserDetails` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CandidateDocuments`
--

LOCK TABLES `CandidateDocuments` WRITE;
/*!40000 ALTER TABLE `CandidateDocuments` DISABLE KEYS */;
INSERT INTO `CandidateDocuments` VALUES (1,'B101','pdf','d:/home/documents/doc.pdf','Done','2019-12-12'),(2,'B102','pdf','e:/home/documents/doc.pdf','Done','2019-12-12'),(3,'B103','pdf','e:/home/documents/file.pdf','Done','2019-12-21'),(4,'B104','pdf','f:/home/documents/file.pdf','Done','2019-12-21'),(5,'B105','pdf','d:/home/documents/file.pdf','Done','2019-12-21');
/*!40000 ALTER TABLE `CandidateDocuments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CandidateEducationDetailedCheck`
--

DROP TABLE IF EXISTS `CandidateEducationDetailedCheck`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CandidateEducationDetailedCheck` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Candidate_Id` varchar(10) DEFAULT NULL,
  `FieldName` varchar(20) DEFAULT NULL,
  `Is_Verified` varchar(5) DEFAULT NULL,
  `LastUpd_Stamp` date DEFAULT NULL,
  `LastUpd_User` varchar(30) DEFAULT NULL,
  `Creator_Stamp` date DEFAULT NULL,
  PRIMARY KEY (`ID`),
  CONSTRAINT `CandidateEducationDetailedCheck_ibfk_1` FOREIGN KEY (`ID`) REFERENCES `UserDetails` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CandidateEducationDetailedCheck`
--

LOCK TABLES `CandidateEducationDetailedCheck` WRITE;
/*!40000 ALTER TABLE `CandidateEducationDetailedCheck` DISABLE KEYS */;
INSERT INTO `CandidateEducationDetailedCheck` VALUES (1,'B101','CSE','Yes','2019-12-12','Ajay','2019-12-12'),(2,'B102','CSE','Yes','2019-11-12','Bhanu','2019-12-12'),(3,'B103','ECE','Yes','2019-11-21','Chandu','2019-12-21'),(4,'B104','ECE','Yes','2019-11-21','Sam','2019-12-21'),(5,'B105','IT','Yes','2019-12-21','Sriti','2019-12-13');
/*!40000 ALTER TABLE `CandidateEducationDetailedCheck` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CandidatePersonalDetailsCheck`
--

DROP TABLE IF EXISTS `CandidatePersonalDetailsCheck`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CandidatePersonalDetailsCheck` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `CandidateId` varchar(20) NOT NULL,
  `FieldName` varchar(30) NOT NULL,
  `IsVerifiedLastUpdStamp` varchar(5) DEFAULT NULL,
  `LastUpdUser` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  CONSTRAINT `CandidatePersonalDetailsCheck_ibfk_1` FOREIGN KEY (`ID`) REFERENCES `UserDetails` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CandidatePersonalDetailsCheck`
--

LOCK TABLES `CandidatePersonalDetailsCheck` WRITE;
/*!40000 ALTER TABLE `CandidatePersonalDetailsCheck` DISABLE KEYS */;
INSERT INTO `CandidatePersonalDetailsCheck` VALUES (1,'B101','CSE','Yes','Ajay'),(2,'B102','CSE','Yes','Bhanu'),(3,'B103','ECE','Yes','Chandu'),(4,'B104','ECE','Yes','Sam'),(5,'B105','IT','Yes','Sriti');
/*!40000 ALTER TABLE `CandidatePersonalDetailsCheck` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CandidateQualification`
--

DROP TABLE IF EXISTS `CandidateQualification`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CandidateQualification` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Candidate_Id` varchar(5) DEFAULT NULL,
  `Diploma` varchar(5) DEFAULT NULL,
  `Degree_Name` varchar(20) DEFAULT NULL,
  `Is_Degree_Name_Verified` varchar(5) DEFAULT NULL,
  `Employee_Decipline` varchar(20) DEFAULT NULL,
  `Is_Employee_Decipline_Verified` varchar(5) DEFAULT NULL,
  `Passing_Year` int(11) DEFAULT NULL,
  `Is_Passing_Year_Verified` varchar(5) DEFAULT NULL,
  `Aggregate_Percentage` double DEFAULT NULL,
  `Is_Aggregate_Percentage_Verified` varchar(5) DEFAULT NULL,
  `Final_Year_Percentage` double DEFAULT NULL,
  `Is_Final_Year_Percentage_Verified` varchar(5) DEFAULT NULL,
  `Training_Institute` varchar(20) DEFAULT NULL,
  `Is_Training_Institute_Verified` varchar(5) DEFAULT NULL,
  `Training_Duration_Month` varchar(10) DEFAULT NULL,
  `Is_Training_Duration_Month_Verified` varchar(5) DEFAULT NULL,
  `Other_Training` varchar(10) DEFAULT NULL,
  `Is_Other_Training_Verified` varchar(10) DEFAULT NULL,
  `Creator_Stamp` date DEFAULT NULL,
  PRIMARY KEY (`ID`),
  CONSTRAINT `CandidateQualification_ibfk_1` FOREIGN KEY (`ID`) REFERENCES `UserDetails` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CandidateQualification`
--

LOCK TABLES `CandidateQualification` WRITE;
/*!40000 ALTER TABLE `CandidateQualification` DISABLE KEYS */;
INSERT INTO `CandidateQualification` VALUES (1,'B101','No','BTech','Yes','Good','Yes',2019,'Yes',71,'Yes',70,'Yes','ABC','Yes','April','Yes','No','Yes','2019-12-12'),(2,'B102','No','BTech','Yes','Good','Yes',2019,'Yes',69,'Yes',71,'Yes','JSpiders','Yes','May','Yes','No','Yes','2019-12-12'),(3,'B103','No','BTech','Yes','Good','Yes',2018,'Yes',74,'Yes',73,'Yes','ABC','Yes','May','Yes','No','Yes','2019-12-12'),(4,'B104','No','BTech','Yes','Good','Yes',2019,'Yes',70,'Yes',70,'Yes','ABC','Yes','May','Yes','No','Yes','2019-12-12'),(5,'B105','No','BTech','Yes','Good','Yes',2019,'Yes',70,'Yes',70,'Yes','ABC','Yes','June','Yes','No','Yes','2019-12-12');
/*!40000 ALTER TABLE `CandidateQualification` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CandidateTechStackAssignment`
--

DROP TABLE IF EXISTS `CandidateTechStackAssignment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CandidateTechStackAssignment` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Requirement_ID` varchar(20) DEFAULT NULL,
  `Candidate_Id` varchar(20) DEFAULT NULL,
  `Assign_Date` date DEFAULT NULL,
  `Status` varchar(20) DEFAULT NULL,
  `Creator_Stamp` date DEFAULT NULL,
  PRIMARY KEY (`ID`),
  CONSTRAINT `CandidateTechStackAssignment_ibfk_1` FOREIGN KEY (`ID`) REFERENCES `UserDetails` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CandidateTechStackAssignment`
--

LOCK TABLES `CandidateTechStackAssignment` WRITE;
/*!40000 ALTER TABLE `CandidateTechStackAssignment` DISABLE KEYS */;
INSERT INTO `CandidateTechStackAssignment` VALUES (1,'R101','C101','2019-12-23','1','2019-12-12'),(2,'R102','C102','2019-12-24','1','2019-12-12'),(3,'R103','C103','2019-12-24','1','2019-12-12'),(4,'R104','C104','2019-12-24','1','2019-12-12'),(5,'R105','C105','2019-12-24','1','2019-12-12');
/*!40000 ALTER TABLE `CandidateTechStackAssignment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Company`
--

DROP TABLE IF EXISTS `Company`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Company` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(20) DEFAULT NULL,
  `Address` varchar(50) DEFAULT NULL,
  `Location` varchar(50) DEFAULT NULL,
  `Status` varchar(10) DEFAULT NULL,
  `Creator_Stamp` date DEFAULT NULL,
  PRIMARY KEY (`ID`),
  CONSTRAINT `Company_ibfk_1` FOREIGN KEY (`ID`) REFERENCES `UserDetails` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Company`
--

LOCK TABLES `Company` WRITE;
/*!40000 ALTER TABLE `Company` DISABLE KEYS */;
INSERT INTO `Company` VALUES (1,'Wipro','Whitefield','Bangalore','Active','2019-12-16'),(2,'TCS','Whitefield','Bangalore','Active','2019-12-16'),(3,'Amazon','Electronic City','Bangalore','Active','2019-12-16'),(4,'Zoho','Electronic City','Bangalore','Active','2019-12-16'),(5,'Flipkart','Electronic City','Bangalore','Active','2019-12-16');
/*!40000 ALTER TABLE `Company` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CompanyRequirement`
--

DROP TABLE IF EXISTS `CompanyRequirement`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CompanyRequirement` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Company_Id` varchar(30) DEFAULT NULL,
  `Requested_Month` varchar(10) DEFAULT NULL,
  `City` varchar(30) DEFAULT NULL,
  `Is_Doc_Verified` varchar(20) DEFAULT NULL,
  `Requirement_Doc_Path` varchar(100) DEFAULT NULL,
  `No_Of_Engg` int(11) DEFAULT NULL,
  `Tech_Stack_Id` varchar(30) DEFAULT NULL,
  `Tech_Type_Id` varchar(30) DEFAULT NULL,
  `Lead_ID` varchar(30) DEFAULT NULL,
  `Ideation_Engg_ID` varchar(30) DEFAULT NULL,
  `Buddy_Engg_Id` varchar(30) DEFAULT NULL,
  `Special_Remark` varchar(15) DEFAULT NULL,
  `Status` tinyint(1) DEFAULT NULL,
  `Creator_Stamp` date DEFAULT NULL,
  PRIMARY KEY (`ID`),
  CONSTRAINT `CompanyRequirement_ibfk_1` FOREIGN KEY (`ID`) REFERENCES `UserDetails` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CompanyRequirement`
--

LOCK TABLES `CompanyRequirement` WRITE;
/*!40000 ALTER TABLE `CompanyRequirement` DISABLE KEYS */;
INSERT INTO `CompanyRequirement` VALUES (1,'C101','March','Banglore','Yes','d:/home/documents/file.doc',150,'J123','C123','L123','I123','B123','Good',1,'2019-12-12'),(2,'C102','April','Banglore','Yes','d:/home/documents/file.doc',156,'J234','C234','L234','I234','B234','Good',1,'2019-12-12'),(3,'C103','March','Mumbai','Yes','d:/home/documents/file.doc',178,'J234','C234','L234','I234','B234','Good',1,'2019-12-12'),(4,'C104','March','Mumbai','Yes','d:/home/documents/file.doc',157,'J2346','C2634','L5234','I5234','B2314','Good',1,'2019-12-12'),(5,'C105','March','Banglore','Yes','d:/home/documents/file.doc',1128,'J1234','C1234','L1234','I1234','B1234','Good',1,'2019-12-12');
/*!40000 ALTER TABLE `CompanyRequirement` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `FellowshipCandidate`
--

DROP TABLE IF EXISTS `FellowshipCandidate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `FellowshipCandidate` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `FirstName` varchar(30) NOT NULL,
  `MiddleName` varchar(30) DEFAULT NULL,
  `LastName` varchar(30) NOT NULL,
  `EmailID` varchar(40) NOT NULL,
  `HiredCity` varchar(30) NOT NULL,
  `Degree` varchar(30) NOT NULL,
  `HiredDate` date DEFAULT NULL,
  `MobileNumber` varchar(10) NOT NULL,
  `PermanentPincode` int(11) DEFAULT NULL,
  `HiredLab` varchar(20) DEFAULT NULL,
  `Attitude` varchar(10) NOT NULL,
  `CommunicationRemark` varchar(50) DEFAULT NULL,
  `KnowledgeRemark` varchar(50) DEFAULT NULL,
  `AggregatePercentage` decimal(10,0) DEFAULT NULL,
  `Status` varchar(20) DEFAULT NULL,
  `BirthDate` date DEFAULT NULL,
  `IS_Birth_Date_Verified` varchar(10) DEFAULT NULL,
  `Parant_Name` varchar(20) DEFAULT NULL,
  `Parent_Occupation` varchar(25) DEFAULT NULL,
  `Parent_Mobile_Number` int(11) DEFAULT NULL,
  `Parent_Annual_Salary` varchar(20) DEFAULT NULL,
  `LocalAddress` varchar(50) DEFAULT NULL,
  `PermanentAddress` varchar(50) DEFAULT NULL,
  `Photo_Path` varchar(50) DEFAULT NULL,
  `Joining_Date` date DEFAULT NULL,
  `Candidate_Status` varchar(10) DEFAULT NULL,
  `Personal_Information` varchar(50) DEFAULT NULL,
  `Bank_Information` varchar(50) DEFAULT NULL,
  `Educational_Information` varchar(30) DEFAULT NULL,
  `Document_Status` varchar(20) DEFAULT NULL,
  `Remark` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  CONSTRAINT `FellowshipCandidate_ibfk_1` FOREIGN KEY (`ID`) REFERENCES `UserDetails` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `FellowshipCandidate`
--

LOCK TABLES `FellowshipCandidate` WRITE;
/*!40000 ALTER TABLE `FellowshipCandidate` DISABLE KEYS */;
INSERT INTO `FellowshipCandidate` VALUES (1,'Sriti','Raj','Yadav','Sriti@gmail.com','Banglore','BTech','2019-12-21','954456823 ',56123,'Bridgelabz','No','Good','Good',70,'Selected','1997-10-11','Yes','Hari','Business',987466523,'SevenLakhs','Banglore','Pune','E:/home/Picture/img.png','2019-11-11','FS','Yes','Axis','BTech','Provided','Good'),(2,'Bhanu',NULL,'Kumar','Bhanu@gmail.com','Banglore','BTech','2019-10-12','987456823 ',56123,'Bridgelabz','No','Good','Good',69,'Selected','1997-10-11','Yes','Sandeep','Teacher',987465523,'FiveLakhs','Vizag','Vizag','F:/home/Picture/img.png','2019-11-11','FS','Yes','SBI','BTech','Provided','Good'),(3,'Chandra',NULL,'Raj','Chandu@gmail.com','Mumbai','BTech','2019-10-21','987456823 ',56123,'Bridgelabz','No','Good','Good',74,'Selected','1997-11-11','Yes','vinay','Teacher',985465523,'FiveLakhs','Vizag','Hyderbad','F:/home/Picture/img.png','2019-11-11','FS','Yes','SBI','BTech','Provided','Good'),(4,'Sam',NULL,'John','Samjohn@gmail.com','Banglore','BTech','2019-10-21','987456623 ',56123,'Bridgelabz','No','Good','Good',70,'Selected','1997-09-11','Yes','Vijay','Government Job',985565523,'SixLakhs','Hyderbad','Hyderbad','F:/home/Picture/img.png','2019-11-11','FS','Yes','Axis','BTech','Provided','Good'),(5,'Sriti','Raju','Yadav','Sriti@gmail.com','Banglore','BTech','2019-12-21','9887456623',56123,'Bridgelabz','No','Good','Good',70,'Selected','1997-03-11','Yes','Vikranth','Government Job',985565523,'SixLakhs','Banglore','Banglore','F:/home/Picture/img.png','2019-11-11','FS','Yes','Axis','BTech','Provided','Good');
/*!40000 ALTER TABLE `FellowshipCandidate` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `HiredCandidates`
--

DROP TABLE IF EXISTS `HiredCandidates`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `HiredCandidates` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `FirstName` varchar(30) NOT NULL,
  `MiddleName` varchar(30) DEFAULT NULL,
  `LastName` varchar(30) NOT NULL,
  `EmailID` varchar(40) NOT NULL,
  `HiredCity` varchar(30) NOT NULL,
  `Degree` varchar(30) NOT NULL,
  `HiredDate` date DEFAULT NULL,
  `MobileNumber` varchar(10) NOT NULL,
  `PermanentPincode` int(11) DEFAULT NULL,
  `HiredLab` varchar(20) DEFAULT NULL,
  `Attitude` varchar(10) NOT NULL,
  `CommunicationRemark` varchar(50) DEFAULT NULL,
  `KnowledgeRemark` varchar(50) DEFAULT NULL,
  `AggregatePercentage` decimal(10,0) DEFAULT NULL,
  `Status` varchar(20) DEFAULT NULL,
  KEY `ID` (`ID`),
  CONSTRAINT `HiredCandidates_ibfk_1` FOREIGN KEY (`ID`) REFERENCES `UserDetails` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `HiredCandidates`
--

LOCK TABLES `HiredCandidates` WRITE;
/*!40000 ALTER TABLE `HiredCandidates` DISABLE KEYS */;
INSERT INTO `HiredCandidates` VALUES (1,'Ajay','Ram','Kumar','ajay@gmail.com','Banglore','BTech','2019-12-12','987456123',56123,'Bridgelabz','No','Good','Good',71,'Selected'),(2,'Bhanu',NULL,'Kumar','Bhanu@gmail.com','Banglore','BTech','2019-10-12','987456823',56123,'Bridgelabz','No','Good','Good',69,'Selected'),(3,'Chandra',NULL,'Raj','Chandu@gmail.com','Mumbai','BTech','2019-10-21','987456823',56123,'Bridgelabz','No','Good','Good',74,'Selected'),(4,'Sam',NULL,'John','Samjohn@gmail.com','Banglore','BTech','2019-10-21','987456823',56123,'Bridgelabz','No','Good','Good',70,'Selected'),(5,'Sriti','Raju','Yadav','Sriti@gmail.com','Banglore','BTech','2019-12-21','985456823',56123,'Bridgelabz','No','Good','Good',70,'Selected');
/*!40000 ALTER TABLE `HiredCandidates` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Lab`
--

DROP TABLE IF EXISTS `Lab`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Lab` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(20) DEFAULT NULL,
  `Location` varchar(30) DEFAULT NULL,
  `Address` varchar(50) DEFAULT NULL,
  `Status` tinyint(1) DEFAULT NULL,
  `Creator_Stamp` date DEFAULT NULL,
  PRIMARY KEY (`ID`),
  CONSTRAINT `Lab_ibfk_1` FOREIGN KEY (`ID`) REFERENCES `UserDetails` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Lab`
--

LOCK TABLES `Lab` WRITE;
/*!40000 ALTER TABLE `Lab` DISABLE KEYS */;
INSERT INTO `Lab` VALUES (1,'Bangalore','Bangalore','BDA Complex',1,'2019-12-12'),(2,'ChennaiLab','Chennai','HSR Complex',1,'2019-12-12'),(3,'Bangalore','Bangalore','BDA Complex',1,'2019-12-12'),(4,'MumbaiLab','Mumbai','Jayanagar Complex',1,'2019-12-12'),(5,'Bangalore','Bangalore','BDA Complex',1,'2019-12-12');
/*!40000 ALTER TABLE `Lab` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `LabThreshold`
--

DROP TABLE IF EXISTS `LabThreshold`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `LabThreshold` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Lad_ID` varchar(30) NOT NULL,
  `Lab_Capacity` varchar(30) DEFAULT NULL,
  `Lead_Threshold` int(11) DEFAULT NULL,
  `Ideation_Engg_Threshold` int(11) DEFAULT NULL,
  `Buddy_Engg_Threshold` int(11) DEFAULT NULL,
  `Status` tinyint(1) DEFAULT NULL,
  `Creator_Stamp` date DEFAULT NULL,
  PRIMARY KEY (`ID`),
  CONSTRAINT `LabThreshold_ibfk_1` FOREIGN KEY (`ID`) REFERENCES `UserDetails` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `LabThreshold`
--

LOCK TABLES `LabThreshold` WRITE;
/*!40000 ALTER TABLE `LabThreshold` DISABLE KEYS */;
INSERT INTO `LabThreshold` VALUES (1,'L1','30',1,1,1,1,'2019-12-12'),(2,'L2','40',1,1,1,1,'2019-12-12'),(3,'L3','25',1,1,1,1,'2019-12-12'),(4,'L4','30',1,1,1,1,'2019-12-12'),(5,'L5','30',1,1,1,1,'2019-12-12');
/*!40000 ALTER TABLE `LabThreshold` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `MakerProgram`
--

DROP TABLE IF EXISTS `MakerProgram`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `MakerProgram` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Program_Name` varchar(30) DEFAULT NULL,
  `Program_Type` varchar(20) DEFAULT NULL,
  `Program_Link` varchar(50) DEFAULT NULL,
  `Tech_Stack_Id` varchar(20) DEFAULT NULL,
  `Tech_Type_Id` varchar(20) DEFAULT NULL,
  `Is_Program_Approved` varchar(10) DEFAULT NULL,
  `Description` varchar(150) DEFAULT NULL,
  `Status` varchar(10) DEFAULT NULL,
  `Creator_Stamp` date DEFAULT NULL,
  PRIMARY KEY (`ID`),
  CONSTRAINT `MakerProgram_ibfk_1` FOREIGN KEY (`ID`) REFERENCES `UserDetails` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `MakerProgram`
--

LOCK TABLES `MakerProgram` WRITE;
/*!40000 ALTER TABLE `MakerProgram` DISABLE KEYS */;
INSERT INTO `MakerProgram` VALUES (1,'Java','IT','https://java.com','S101','Coding','Yes','Happy Coding','Active','2020-01-10'),(2,'React','IT','https://react.com','S102','Coding','Yes','Happy Coding','Active','2020-01-10'),(3,'Android','IT','https://Android.com','S102','Coding','Yes','FrontEnd Developer','Active','2020-01-10'),(4,'Java','IT','https://java.com','S105','Coding','Yes','Happy Coding','Active','2020-01-10'),(5,'.NET','IT','https://asp.net.com','S104','Coding','Yes','FullSatck Developer','Active','2020-01-10');
/*!40000 ALTER TABLE `MakerProgram` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Mentor`
--

DROP TABLE IF EXISTS `Mentor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Mentor` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(50) DEFAULT NULL,
  `Mentor_Type` varchar(20) DEFAULT NULL,
  `Lab_ID` varchar(20) DEFAULT NULL,
  `Status` varchar(20) DEFAULT NULL,
  `Creator_Stamp` date DEFAULT NULL,
  PRIMARY KEY (`ID`),
  CONSTRAINT `Mentor_ibfk_1` FOREIGN KEY (`ID`) REFERENCES `UserDetails` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Mentor`
--

LOCK TABLES `Mentor` WRITE;
/*!40000 ALTER TABLE `Mentor` DISABLE KEYS */;
INSERT INTO `Mentor` VALUES (1,'Kiran','BuddyEngineer','L101','Active','2019-12-12'),(2,'Kumar','Ideation Lead','L102','Active','2019-12-12'),(3,'Varun','Ideation Lead','L103','Active','2019-12-12'),(4,'Kumar','Ideation Lead','L104','Active','2019-11-12'),(5,'Kiran','BuddyEngineer','L105','Active','2019-12-12');
/*!40000 ALTER TABLE `Mentor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `MentorIdeationMap`
--

DROP TABLE IF EXISTS `MentorIdeationMap`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `MentorIdeationMap` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Mentor_ID` varchar(10) DEFAULT NULL,
  `Tech_Stack_Id` varchar(20) DEFAULT NULL,
  `Status` varchar(20) DEFAULT NULL,
  `DateTime` date DEFAULT NULL,
  `Creator_Stamp` date DEFAULT NULL,
  PRIMARY KEY (`ID`),
  CONSTRAINT `MentorIdeationMap_ibfk_1` FOREIGN KEY (`ID`) REFERENCES `UserDetails` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `MentorIdeationMap`
--

LOCK TABLES `MentorIdeationMap` WRITE;
/*!40000 ALTER TABLE `MentorIdeationMap` DISABLE KEYS */;
INSERT INTO `MentorIdeationMap` VALUES (1,'M1','Java','Active','2019-12-12','2019-11-12'),(2,'M2','React','Active','2019-12-12','2019-11-12'),(3,'M3','Android','Active','2019-12-12','2019-11-12'),(4,'M4','.NET','Active','2019-12-12','2019-11-12'),(5,'M5','Java','Active','2019-12-12','2019-11-12');
/*!40000 ALTER TABLE `MentorIdeationMap` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `MentorTechStack`
--

DROP TABLE IF EXISTS `MentorTechStack`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `MentorTechStack` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Mentor_ID` varchar(30) DEFAULT NULL,
  `Status` varchar(20) DEFAULT NULL,
  `Creator_Stamp` date DEFAULT NULL,
  PRIMARY KEY (`ID`),
  CONSTRAINT `MentorTechStack_ibfk_1` FOREIGN KEY (`ID`) REFERENCES `UserDetails` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `MentorTechStack`
--

LOCK TABLES `MentorTechStack` WRITE;
/*!40000 ALTER TABLE `MentorTechStack` DISABLE KEYS */;
INSERT INTO `MentorTechStack` VALUES (1,'M1','Active','2019-12-12'),(2,'M2','Active','2019-12-12'),(3,'M3','Active','2019-12-12'),(4,'M4','Active','2019-12-12'),(5,'M5','Active','2019-12-12');
/*!40000 ALTER TABLE `MentorTechStack` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `TechStack`
--

DROP TABLE IF EXISTS `TechStack`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `TechStack` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Tech_Name` varchar(30) DEFAULT NULL,
  `Image_Path` varchar(100) DEFAULT NULL,
  `FrameWork` varchar(100) DEFAULT NULL,
  `Cur_Status` tinyint(1) DEFAULT NULL,
  `Creator_Stamp` date DEFAULT NULL,
  PRIMARY KEY (`ID`),
  CONSTRAINT `TechStack_ibfk_1` FOREIGN KEY (`ID`) REFERENCES `UserDetails` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `TechStack`
--

LOCK TABLES `TechStack` WRITE;
/*!40000 ALTER TABLE `TechStack` DISABLE KEYS */;
INSERT INTO `TechStack` VALUES (1,'Java','d:/home/pictures/image.png','Spring',1,'2019-12-12'),(2,'React','e:/home/pictures/image.png','Angular',1,'2019-12-12'),(3,'Android','e:/home/pictures/image.png','Webkit',1,'2019-12-12'),(4,'.NET','e:/home/pictures/image.png','.net',1,'2019-12-12'),(5,'Java','d:/home/pictures/image.png','Spring',1,'2019-12-12');
/*!40000 ALTER TABLE `TechStack` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `TechType`
--

DROP TABLE IF EXISTS `TechType`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `TechType` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Tech_Name` varchar(30) DEFAULT NULL,
  `Cur_Status` tinyint(1) DEFAULT NULL,
  `Creator_Stamp` date DEFAULT NULL,
  PRIMARY KEY (`ID`),
  CONSTRAINT `TechType_ibfk_1` FOREIGN KEY (`ID`) REFERENCES `UserDetails` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `TechType`
--

LOCK TABLES `TechType` WRITE;
/*!40000 ALTER TABLE `TechType` DISABLE KEYS */;
INSERT INTO `TechType` VALUES (1,'Java',1,'2019-12-12'),(2,'React',1,'2019-12-12'),(3,'Android',1,'2019-12-12'),(4,'.NET',1,'2019-12-12'),(5,'Java',1,'2019-12-12');
/*!40000 ALTER TABLE `TechType` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `UserDetails`
--

DROP TABLE IF EXISTS `UserDetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `UserDetails` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `EmailID` varchar(40) NOT NULL,
  `FirstName` varchar(30) NOT NULL,
  `LastName` varchar(30) NOT NULL,
  `Password` varchar(30) NOT NULL,
  `ContactNumber` int(11) NOT NULL,
  `verified` varchar(5) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `UserDetails`
--

LOCK TABLES `UserDetails` WRITE;
/*!40000 ALTER TABLE `UserDetails` DISABLE KEYS */;
INSERT INTO `UserDetails` VALUES (1,'ajay@gmail.com','Ajay','Kumar','Ajay1',945657896,'Yes'),(2,'Bhanu@gmail.com','Bhanu','Kumar','Bhanu1',945657896,'Yes'),(3,'Chandu@gmail.com','Chandu','Raj','Chandu1',923657896,'Yes'),(4,'Samjohn@gmail.com','Sam','John','SamJohn1',923657896,'Yes'),(5,'Sriti@gmail.com','Sriti','Yadav','Sriti1',912365766,'Yes');
/*!40000 ALTER TABLE `UserDetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `UserRoles`
--

DROP TABLE IF EXISTS `UserRoles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `UserRoles` (
  `User_Id` varchar(10) NOT NULL,
  `Role_Name` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `UserRoles`
--

LOCK TABLES `UserRoles` WRITE;
/*!40000 ALTER TABLE `UserRoles` DISABLE KEYS */;
INSERT INTO `UserRoles` VALUES ('R101','Java'),('R102','React'),('R103','Android'),('R104','.NET'),('R105','Java');
/*!40000 ALTER TABLE `UserRoles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `SlNo` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `fullName` varchar(30) NOT NULL,
  `Email` varchar(40) NOT NULL,
  `userName` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  PRIMARY KEY (`SlNo`),
  UNIQUE KEY `userName` (`userName`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'lavanya','lavanya@gmail.com','lmandu','lavanya');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-01-14 19:28:10
