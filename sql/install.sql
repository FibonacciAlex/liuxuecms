CREATE DATABASE  IF NOT EXISTS `liuxuecms` ;

CREATE TABLE IF NOT EXISTS `person_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30),
  `sex` varchar(2),
  `email`  varchar(30),
  `department`  varchar(30),
  PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
insert into person_info(id,name,sex,email,department) values(1,'Sandwich','0','yuzhaoufengg@126.com','GZ');