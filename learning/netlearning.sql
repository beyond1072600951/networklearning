/*
SQLyog Ultimate v12.5.0 (64 bit)
MySQL - 5.7.20-log : Database - netlearning
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`netlearning` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `netlearning`;

/*Table structure for table `course_base` */

DROP TABLE IF EXISTS `course_base`;

CREATE TABLE `course_base` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) NOT NULL,
  `description` text COMMENT '课程介绍',
  `studymodel` varchar(32) DEFAULT NULL COMMENT '学习模式',
  `status` int(11) NOT NULL DEFAULT '0' COMMENT '课程状态',
  `picpath` varchar(256) DEFAULT NULL COMMENT '课程图片',
  `user_id` int(11) DEFAULT NULL COMMENT '创建用户',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Table structure for table `course_plan` */

DROP TABLE IF EXISTS `course_plan`;

CREATE TABLE `course_plan` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `courseid` int(11) NOT NULL COMMENT '课程id',
  `name` varchar(30) NOT NULL COMMENT '父节点name',
  `parentid` int(11) DEFAULT NULL COMMENT '父节点id',
  `level` int(11) NOT NULL COMMENT '层级',
  `ptype` int(11) NOT NULL COMMENT '课程类型：1视频，2文档',
  `description` varchar(100) DEFAULT NULL COMMENT '课程介绍',
  `timelength` double(5,2) DEFAULT NULL COMMENT '时长  分钟',
  `orderby` varchar(30) DEFAULT NULL COMMENT '排序字段',
  `status` int(11) NOT NULL DEFAULT '0' COMMENT '状态：未发布，已发布',
  `url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Table structure for table `course_record` */

DROP TABLE IF EXISTS `course_record`;

CREATE TABLE `course_record` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `course_base_id` int(11) NOT NULL,
  `course_plan_id` int(11) NOT NULL,
  `record_time` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Table structure for table `course_resourse` */

DROP TABLE IF EXISTS `course_resourse`;

CREATE TABLE `course_resourse` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `courseplan_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Table structure for table `news` */

DROP TABLE IF EXISTS `news`;

CREATE TABLE `news` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) NOT NULL,
  `content` varchar(256) NOT NULL COMMENT '发布新闻内容',
  `user_id` int(11) NOT NULL COMMENT '发布用户',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Table structure for table `post` */

DROP TABLE IF EXISTS `post`;

CREATE TABLE `post` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(32) NOT NULL COMMENT '帖子标题',
  `content` varchar(256) NOT NULL COMMENT '帖子内容',
  `user_id` int(11) NOT NULL COMMENT '发布用户',
  `time` datetime DEFAULT NULL COMMENT '发布时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Table structure for table `reply` */

DROP TABLE IF EXISTS `reply`;

CREATE TABLE `reply` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `post_id` int(11) NOT NULL COMMENT '主贴id',
  `user_id` int(11) NOT NULL COMMENT '回复用户id',
  `content` varchar(256) NOT NULL COMMENT '回复内容',
  `time` datetime DEFAULT NULL COMMENT '回复时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(32) NOT NULL COMMENT '角色类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Table structure for table `statistics` */

DROP TABLE IF EXISTS `statistics`;

CREATE TABLE `statistics` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `courseplan_id` int(11) NOT NULL COMMENT '课程章节id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(32) NOT NULL,
  `password` varchar(32) NOT NULL,
  `nickname` varchar(32) DEFAULT NULL COMMENT '昵称',
  `name` varchar(32) DEFAULT NULL,
  `phone` varchar(32) DEFAULT NULL,
  `picture` varchar(32) DEFAULT NULL COMMENT '头像路径',
  `education` varchar(32) DEFAULT NULL COMMENT '学历',
  `registime` datetime DEFAULT NULL COMMENT '注册时间',
  `learningage` varchar(32) DEFAULT NULL COMMENT '学习时长',
  `ispost` varchar(32) DEFAULT NULL COMMENT '发帖权限',
  `isreply` varchar(32) DEFAULT NULL COMMENT '评论权限',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Table structure for table `user_role` */

DROP TABLE IF EXISTS `user_role`;

CREATE TABLE `user_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `role_id` int(11) NOT NULL COMMENT '角色类型id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
