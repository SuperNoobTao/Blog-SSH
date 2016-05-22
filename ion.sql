/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50615
Source Host           : localhost:3306
Source Database       : ion

Target Server Type    : MYSQL
Target Server Version : 50615
File Encoding         : 65001

Date: 2016-05-22 21:04:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for answertable
-- ----------------------------
DROP TABLE IF EXISTS `answertable`;
CREATE TABLE `answertable` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `question_id` int(11) NOT NULL,
  `time` datetime DEFAULT NULL,
  `answer_student_number` varchar(255) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of answertable
-- ----------------------------
INSERT INTO `answertable` VALUES ('15', '11', '2016-04-24 19:14:58', '0000', '0000');
INSERT INTO `answertable` VALUES ('16', '11', '2016-04-24 19:26:23', '0000', 'hello');

-- ----------------------------
-- Table structure for fedback
-- ----------------------------
DROP TABLE IF EXISTS `fedback`;
CREATE TABLE `fedback` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_number` varchar(255) DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of fedback
-- ----------------------------
INSERT INTO `fedback` VALUES ('3', '0000', '2016-04-24 19:28:32', 'hello');
INSERT INTO `fedback` VALUES ('4', '0000', '2016-04-24 19:28:57', 'test');

-- ----------------------------
-- Table structure for ordertable
-- ----------------------------
DROP TABLE IF EXISTS `ordertable`;
CREATE TABLE `ordertable` (
  `order_id` int(11) NOT NULL AUTO_INCREMENT,
  `release_student_number` varchar(11) DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  `startLocation` varchar(255) DEFAULT NULL,
  `endLocation` varchar(255) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `lable` varchar(255) DEFAULT NULL,
  `tip` double DEFAULT NULL,
  `acceptance_student_number` varchar(11) DEFAULT NULL,
  `score` double DEFAULT '-1',
  `state` varchar(255) DEFAULT '0',
  `complaint_content` varchar(255) DEFAULT NULL,
  `complaint_time` datetime DEFAULT NULL,
  `complaint_student_number` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ordertable
-- ----------------------------
INSERT INTO `ordertable` VALUES ('22', '456', '2016-04-24 18:01:12', '寝室A', '寝室A', 'test1', '跑腿', '5', null, '-1', '0', null, null, null);
INSERT INTO `ordertable` VALUES ('23', '111', '2016-04-24 18:37:43', '寝室A', '教学楼A', 'test01', '跑腿', '12', null, '-1', '0', null, null, null);
INSERT INTO `ordertable` VALUES ('24', '111', '2016-04-24 18:38:13', '教学楼A', '寝室A', 'test02', '租赁', '13', '222', '5', '2', null, null, null);
INSERT INTO `ordertable` VALUES ('25', '222', '2016-04-24 18:39:25', '教学楼A', '寝室A', 'test03', '其他', '15', '0000', '5', '2', null, null, null);
INSERT INTO `ordertable` VALUES ('30', '0000', '2016-04-24 19:24:36', '寝室A', '教学楼A', 'test from 0000', '跑腿', '5', null, '-1', '0', null, null, null);

-- ----------------------------
-- Table structure for questiontable
-- ----------------------------
DROP TABLE IF EXISTS `questiontable`;
CREATE TABLE `questiontable` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_number` varchar(255) DEFAULT NULL,
  `question` varchar(255) DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of questiontable
-- ----------------------------
INSERT INTO `questiontable` VALUES ('11', '222', 'from test2', '2016-04-24 18:40:40');
INSERT INTO `questiontable` VALUES ('13', '0000', 'test from 0000', '2016-04-24 19:26:47');

-- ----------------------------
-- Table structure for schoollocation
-- ----------------------------
DROP TABLE IF EXISTS `schoollocation`;
CREATE TABLE `schoollocation` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `school` varchar(255) DEFAULT NULL,
  `location` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of schoollocation
-- ----------------------------
INSERT INTO `schoollocation` VALUES ('3', 'xxxx', '寝室A');
INSERT INTO `schoollocation` VALUES ('4', 'xxxx', '教学楼A');

-- ----------------------------
-- Table structure for usertable
-- ----------------------------
DROP TABLE IF EXISTS `usertable`;
CREATE TABLE `usertable` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `student_number` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `student_name` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `cell_phone` varchar(255) DEFAULT NULL,
  `school` varchar(255) DEFAULT NULL,
  `average_score` double DEFAULT '0',
  `amount` int(11) DEFAULT '0',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of usertable
-- ----------------------------
INSERT INTO `usertable` VALUES ('26', '31301398', '111', '沈涛', '男', '12345678901', '浙江大学城市学院', '0', '0');
INSERT INTO `usertable` VALUES ('27', '31301396', '222', 'st', '女', '36925814708', '浙江大学城市学院', '9', '1');
INSERT INTO `usertable` VALUES ('30', '31301395', '0000', 'shentao', '男', '14725836907', '浙江大学城市学院', '5', '1');

-- ----------------------------
-- Function structure for count_answer
-- ----------------------------
DROP FUNCTION IF EXISTS `count_answer`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` FUNCTION `count_answer`(q_id INT(11)) RETURNS int(11)
BEGIN
	DECLARE val int(11) default 0;
		SET  val = (SELECT COUNT(*) FROM answertable a WHERE question_id = q_id );
	RETURN  val;
END
;;
DELIMITER ;
