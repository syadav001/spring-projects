CREATE DATABASE  IF NOT EXISTS `spring-crud-rest`;
USE `spring-crud-rest`;
--
-- Table structure for table `employee_record`
--

DROP TABLE IF EXISTS `employee_record`;

CREATE TABLE `employee_record` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
);