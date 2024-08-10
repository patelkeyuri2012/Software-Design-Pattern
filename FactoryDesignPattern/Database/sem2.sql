create database `sem2`;

use `sem2`;

CREATE TABLE `student` (
  `sid` INT NOT NULL,
  `sname` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`sid`));

insert into `student` values (1, 'keyuri'); 
insert into `student` values (2, 'yashvi'); 
insert into `student` values (3, 'jainil'); 

CREATE TABLE `student_detail` (
  `student_no` int NOT NULL,
  `student_name` varchar(50) NOT NULL,
  `student_dob` date NOT NULL,
  `student_cno` varchar(10) NOT NULL,
  PRIMARY KEY (`student_no`)
);

INSERT INTO `student_detail` values (1, 'keyuri', '2002-12-20', '8293740287');
INSERT INTO `student_detail` values (2, 'yashvi', '2003-1-28', '9237481093');
INSERT INTO `student_detail` values (3, 'jainil', '2000-12-27', '7023813950');

CREATE TABLE `user` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `roleid` int NOT NULL,
  `first_name` varchar(15) NOT NULL,
  `last_name` varchar(15) NOT NULL,
  `password` varchar(10) NOT NULL,
  `email` varchar(25) NOT NULL,
  `contact_no` varchar(10) NOT NULL,
  `address` varchar(50) NOT NULL,
   PRIMARY KEY (`user_id`),
   FOREIGN KEY (`roleid`) REFERENCES `role`(`roleId`)
);


CREATE TABLE `role` (
  `roleId` INT NOT NULL,
  `roleName` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`roleId`)
);
  
INSERT INTO `role` (`roleId`, `roleName`) VALUES ('1', 'Admin');
INSERT INTO `role` (`roleId`, `roleName`) VALUES ('2', 'Guest');
INSERT INTO `role` (`roleId`, `roleName`) VALUES ('3', 'Registered User');

INSERT INTO `user` (`roleid`, `first_name`, `last_name`, `password`, `email`, `contact_no`, `address`) VALUES (1, 'keyuri', 'patel', '123456', 'keyuri@gamil.com', '8735979376', 'dev parijat, ahmedabad');

SELECT * FROM `user`;
SELECT * FROM `role`;


SELECT `roleid` FROM `user` WHERE `email` = 'keyuri@gamil.com' AND `password` = '123456';
SELECT `roleid` FROM `user` WHERE `email` = 'yashvi@gmail.com' AND `password` = '234567';
SELECT `roleid` FROM `user` WHERE `email` = 'prey@gmail.com' AND `password` = 'preypatel';

SELECT `role`.`roleName` FROM `user` JOIN `role` ON `user`.`roleid` = `role`.`roleId` WHERE `email` = 'prey@gmail.com' AND `password` = 'preypatel';

SELECT `first_name` FROM `user` WHERE `email` = 'prey@gmail.com' AND `password` = 'preypatel';

CREATE TABLE `book_detail` (
  `bookId` int NOT NULL AUTO_INCREMENT,
  `bookName` varchar(45) NOT NULL,
  `authorName` varchar(45) NOT NULL,
  `bookIsbnNo` varchar(13) NOT NULL,
  `bookPublishedDate` DATE NOT NULL ,
  `publisher` varchar(50) NOT NULL,
  PRIMARY KEY (`bookId`, `bookIsbnNo`)
);

INSERT INTO `book_detail` (`bookId`, `bookName`, `authorName`, `bookIsbnNo`, `bookPublishedDate`, `publisher`) VALUES ('1', 'Ketlak Shbdo Mari Kalme', 'Keyuri Patel', '9798887332673', '2022-06-20', 'Notion Press');

SELECT * FROM `book_detail`;


CREATE TABLE `medicine` (
  `id` int NOT NULL AUTO_INCREMENT,
  `medicine_name` varchar(45) NOT NULL,
  `medicine_details` varchar(45) NOT NULL,
  `manufacturer_name` varchar(50) NOT NULL,
  `batch_no` varchar(20) NOT NULL,
  `manufacturing_month_year` DATE NOT NULL,
  `expiry_month_year` DATE NOT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO `medicine` (`medicine_name`, `medicine_details`, `manufacturer_name`, `batch_no`, `manufacturing_month_year`, `expiry_month_year`) VALUES ('Paracetamol', 'Pain reliever', 'Preet Pharmaceuticals', '123456', '2024-01-01', '2025-01-01');
INSERT INTO `medicine` (`medicine_name`, `medicine_details`, `manufacturer_name`, `batch_no`, `manufacturing_month_year`, `expiry_month_year`) VALUES ('Ibuprofen', 'Anti-inflammatory', 'Hetvi Pharma', '789012', '2022-03-01', '2025-03-01');
INSERT INTO `medicine` (`medicine_name`, `medicine_details`, `manufacturer_name`, `batch_no`, `manufacturing_month_year`, `expiry_month_year`) VALUES ('Amoxicillin', 'Antibiotic', 'SGVP Labs', '345678', '2022-07-01', '2024-05-01');
INSERT INTO `medicine` (`medicine_name`, `medicine_details`, `manufacturer_name`, `batch_no`, `manufacturing_month_year`, `expiry_month_year`) VALUES ('Omeprazole', 'Proton pump inhibitor ', 'Heartbeat Industries', '901234', '2021-09-01', '2023-09-01');
INSERT INTO `medicine` (`medicine_name`, `medicine_details`, `manufacturer_name`, `batch_no`, `manufacturing_month_year`, `expiry_month_year`) VALUES ('Cetirizine', 'Antihistamine', 'GMBell Pharmaceuticals', '567890', '2022-11-01', '2024-11-01');

SELECT * FROM `medicine`;

SELECT `id`, `medicine_name`, `medicine_details`, `manufacturer_name`, `batch_no`, CONCAT( DATE_FORMAT(`manufacturing_month_year`, '%M'), ' ', DATE_FORMAT(`manufacturing_month_year`, '%Y')) AS `manufacturing_month_year`,  CONCAT( DATE_FORMAT(`expiry_month_year`, '%M'), ' ', DATE_FORMAT(`expiry_month_year`, '%Y')) AS `expiry_month_year` FROM  `medicine` where `medicine_name` LIKE "Amoxicillin";
SELECT `id`, `medicine_name`, `medicine_details`, `manufacturer_name`, `batch_no`, CONCAT( DATE_FORMAT(`manufacturing_month_year`, '%M'), ' ', DATE_FORMAT(`manufacturing_month_year`, '%Y')) AS `manufacturing_month_year`,  CONCAT( DATE_FORMAT(`expiry_month_year`, '%M'), ' ', DATE_FORMAT(`expiry_month_year`, '%Y')) AS `expiry_month_year` FROM  `medicine` where `manufacturer_name` LIKE "GMBell Pharmaceuticals";


CREATE TABLE `catalogue` (
  `categogueId` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(45) NOT NULL,
  `description` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`categogueId`)
);

CREATE TABLE `book` (
  `bookId` int NOT NULL AUTO_INCREMENT,
  `categogueId` int NOT NULL,
  `title` varchar(45) NOT NULL,
  `author` varchar(20) NOT NULL,
  `price` varchar(10) NOT NULL,
  `quantity` varchar(3) NOT NULL,
  `ISBN` varchar(13) NOT NULL UNIQUE,
  `publisher` varchar(30) NOT NULL,
  `editionYear` varchar(4) NOT NULL,
   PRIMARY KEY (`bookId`),
   FOREIGN KEY (`categogueId`) REFERENCES `catalogue`(`categogueId`)
);


INSERT INTO `catalogue` (`title`, `description`) VALUES ('novel', 'It is a narrative work of prose fiction that tells a story about specific human experiences over a considerable length');

INSERT INTO `book` (`categogueId`, `title`, `author`, `price`, `quantity`, `ISBN`, `publisher`, `editionYear`) VALUES (1, 'Ketlak Shabdo Mari Kalme', 'Keyuri Patel', '150', '50', '9798887332673', 'Notion Press', '2022');

SELECT * FROM `book`;

SELECT * FROM `catalogue`;

UPDATE `catalogue` SET `title` = "story", `description` = "it is novel" WHERE `categogueId` = 3;

UPDATE `book` SET `categogueId` = "2", `title` = "kuchh kuchh", `author` = "ke", `price` = "21", `quantity` = "2", `ISBN` = "98765432", `publisher` = "bhnd", `editionYear` ="2024-03-04" WHERE `bookId` = 3;
