/*
该数据库是在navicat中的命令列中操作生成，然后通过navicat逆向导出的，具体操作请看两张图片。
 */
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for score
-- ----------------------------
DROP TABLE IF EXISTS `score`;
CREATE TABLE `score`  (
  `id` int(11) NOT NULL,
  `student_id` varchar(3) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `subject_id` int(4) NOT NULL,
  `score` double(4, 1) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of score
-- ----------------------------
INSERT INTO `score` VALUES (1, '001', 1001, 80.0);
INSERT INTO `score` VALUES (2, '002', 1002, 60.0);
INSERT INTO `score` VALUES (3, '001', 1001, 70.0);
INSERT INTO `score` VALUES (4, '002', 1002, 60.5);

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `id` varchar(3) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `age` int(3) NOT NULL,
  `sex` varchar(1) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('001', '张三', 18, '男');
INSERT INTO `student` VALUES ('002', '李四', 20, '女');

-- ----------------------------
-- Table structure for subject
-- ----------------------------
DROP TABLE IF EXISTS `subject`;
CREATE TABLE `subject`  (
  `id` int(4) NOT NULL,
  `subject` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `teacher` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of subject
-- ----------------------------
INSERT INTO `subject` VALUES (1001, '语文', '王老师', '本次考试比较简单');
INSERT INTO `subject` VALUES (1002, '数学', '刘老师', '本次考试比较难');

SET FOREIGN_KEY_CHECKS = 1;
