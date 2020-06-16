/*
 Navicat Premium Data Transfer

 Source Server         : Custumer
 Source Server Type    : MySQL
 Source Server Version : 50540
 Source Host           : localhost:3306
 Source Schema         : jiaowu

 Target Server Type    : MySQL
 Target Server Version : 50540
 File Encoding         : 65001

 Date: 15/06/2020 16:49:25
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1, 'zhangsan', '123456', 20);
INSERT INTO `student` VALUES (5, 'cc', '111', 11);
INSERT INTO `student` VALUES (6, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for tbl_course_type
-- ----------------------------
DROP TABLE IF EXISTS `tbl_course_type`;
CREATE TABLE `tbl_course_type`  (
  `type_id` int(11) NOT NULL AUTO_INCREMENT,
  `type_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`type_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tbl_course_type
-- ----------------------------
INSERT INTO `tbl_course_type` VALUES (2, '专业任选');
INSERT INTO `tbl_course_type` VALUES (3, '校选课');
INSERT INTO `tbl_course_type` VALUES (4, '专家讲座');
INSERT INTO `tbl_course_type` VALUES (6, '业务层开发');
INSERT INTO `tbl_course_type` VALUES (7, 'SSM');

-- ----------------------------
-- Table structure for tbl_users
-- ----------------------------
DROP TABLE IF EXISTS `tbl_users`;
CREATE TABLE `tbl_users`  (
  `user_no` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_pwd` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`user_no`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tbl_users
-- ----------------------------
INSERT INTO `tbl_users` VALUES ('000101', '123456', '王海涛');
INSERT INTO `tbl_users` VALUES ('000102', '123456', '张明');

SET FOREIGN_KEY_CHECKS = 1;
