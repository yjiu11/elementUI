/*
 Navicat Premium Data Transfer

 Source Server         : MySQL_3306
 Source Server Type    : MySQL
 Source Server Version : 50610
 Source Host           : localhost:3306
 Source Schema         : mfs_element

 Target Server Type    : MySQL
 Target Server Version : 50610
 File Encoding         : 65001

 Date: 30/10/2019 14:32:44
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sys_perm
-- ----------------------------
DROP TABLE IF EXISTS `sys_perm`;
CREATE TABLE `sys_perm`  (
  `pval` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '权限值，shiro的权限控制表达式',
  `parent` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '父权限id',
  `pname` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '权限名称',
  `ptype` int(3) NULL DEFAULT NULL COMMENT '权限类型：1.菜单 2.按钮 3.接口 4.特殊',
  `leaf` tinyint(1) NULL DEFAULT NULL COMMENT '是否叶子节点',
  `created` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间',
  `updated` timestamp(0) NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`pval`) USING BTREE,
  UNIQUE INDEX `pval`(`pval`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '权限' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_perm
-- ----------------------------
INSERT INTO `sys_perm` VALUES ('*', NULL, '所有权限', 0, NULL, '2018-04-19 18:14:12', NULL);
INSERT INTO `sys_perm` VALUES ('a:activiti', NULL, 'ActivitiController', 3, 1, NULL, NULL);
INSERT INTO `sys_perm` VALUES ('a:auth', NULL, '登录模块', 3, 1, NULL, NULL);
INSERT INTO `sys_perm` VALUES ('a:contract', NULL, 'ContractController', 3, 1, NULL, NULL);
INSERT INTO `sys_perm` VALUES ('a:dict', NULL, 'SysDataDictController', 3, 1, NULL, NULL);
INSERT INTO `sys_perm` VALUES ('a:fmsBizAccountInfo', NULL, 'FmsBizAccountInfoController', 3, 1, NULL, NULL);
INSERT INTO `sys_perm` VALUES ('a:fmsBizApprInfo', NULL, 'FmsBizApprInfoController', 3, 1, NULL, NULL);
INSERT INTO `sys_perm` VALUES ('a:fmsBizBankInfo', NULL, 'FmsBizBankInfoController', 3, 1, NULL, NULL);
INSERT INTO `sys_perm` VALUES ('a:fmsBizCaseInfo', NULL, 'FmsBizCaseInfoController', 3, 1, NULL, NULL);
INSERT INTO `sys_perm` VALUES ('a:fmsBizCustInfo', NULL, 'FmsBizCustInfoController', 3, 1, NULL, NULL);
INSERT INTO `sys_perm` VALUES ('a:fmsBizGuardInfo', NULL, 'FmsBizGuardInfoController', 3, 1, NULL, NULL);
INSERT INTO `sys_perm` VALUES ('a:fmsBizImageInfo', NULL, 'FmsBizImageInfoController', 3, 1, NULL, NULL);
INSERT INTO `sys_perm` VALUES ('a:gradleBuild', 'a:test', '构建gradle', 3, 1, NULL, NULL);
INSERT INTO `sys_perm` VALUES ('a:mvn:install', 'a:test', 'mvnInstall', 3, 1, NULL, NULL);
INSERT INTO `sys_perm` VALUES ('a:option', NULL, '选项模块', 3, 1, NULL, NULL);
INSERT INTO `sys_perm` VALUES ('a:sys:perm', NULL, '系统权限模块', 3, 1, NULL, NULL);
INSERT INTO `sys_perm` VALUES ('a:sys:role', NULL, '系统角色模块', 3, 1, NULL, NULL);
INSERT INTO `sys_perm` VALUES ('a:sys:user:add', 'a:sys:接口', '添加系统用户', 3, 1, NULL, NULL);
INSERT INTO `sys_perm` VALUES ('a:sys:user:del', 'a:sys:接口', '删除系统用户', 3, 1, NULL, NULL);
INSERT INTO `sys_perm` VALUES ('a:sys:user:info', 'a:sys:接口', '查询系统用户信息', 3, 1, NULL, NULL);
INSERT INTO `sys_perm` VALUES ('a:sys:user:info:update', 'a:sys:接口', '更新系统用户的信息', 3, 1, NULL, NULL);
INSERT INTO `sys_perm` VALUES ('a:sys:user:list', 'a:sys:接口', '查询所有系统用户', 3, 1, NULL, NULL);
INSERT INTO `sys_perm` VALUES ('a:sys:user:role:find', 'a:sys:接口', '查找系统用户的角色', 3, 1, NULL, NULL);
INSERT INTO `sys_perm` VALUES ('a:sys:user:role:update', 'a:sys:接口', '更新系统用户的角色', 3, 1, NULL, NULL);
INSERT INTO `sys_perm` VALUES ('a:sys:接口', NULL, '系统用户模块', 3, 0, NULL, '2019-06-10 14:31:36');
INSERT INTO `sys_perm` VALUES ('a:test', NULL, '测试模块模块', 3, 0, NULL, NULL);
INSERT INTO `sys_perm` VALUES ('b:2', 'm:sys:role', '1', 2, NULL, '2019-06-16 11:32:18', NULL);
INSERT INTO `sys_perm` VALUES ('b:user:add', 'm:sys:user', '添加用户', 2, NULL, '2018-06-02 11:00:37', NULL);
INSERT INTO `sys_perm` VALUES ('b:user:delete', 'm:sys:user', '删除用户', 2, NULL, '2018-06-02 11:00:56', NULL);
INSERT INTO `sys_perm` VALUES ('m:financ', NULL, '查询融资需求', 1, 1, NULL, NULL);
INSERT INTO `sys_perm` VALUES ('m:financappr', NULL, '融资申请审批', 1, 1, NULL, NULL);
INSERT INTO `sys_perm` VALUES ('m:hist', NULL, '查询融资记录', 1, 1, NULL, NULL);
INSERT INTO `sys_perm` VALUES ('m:sys', NULL, '系统', 1, 0, NULL, NULL);
INSERT INTO `sys_perm` VALUES ('m:sys:branch', 'm:sys', '机构管理', 1, 1, NULL, NULL);
INSERT INTO `sys_perm` VALUES ('m:sys:perm', 'm:sys', '权限管理', 1, 1, NULL, NULL);
INSERT INTO `sys_perm` VALUES ('m:sys:role', 'm:sys', '角色管理', 1, 1, NULL, NULL);
INSERT INTO `sys_perm` VALUES ('m:sys:user', 'm:sys', '用户管理', 1, 1, NULL, NULL);
INSERT INTO `sys_perm` VALUES ('m:test', 'm:sys', '测试_密码', 1, 1, NULL, NULL);
INSERT INTO `sys_perm` VALUES ('m:ukey', NULL, '修改ukey密码', 1, 1, NULL, NULL);

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role`  (
  `rid` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色id',
  `rname` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色名，用于显示',
  `rdesc` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色描述',
  `rval` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色值，用于权限判断',
  `created` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间',
  `updated` timestamp(0) NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`rid`) USING BTREE,
  UNIQUE INDEX `rval`(`rval`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('1002748319131680769', '业务员', '具有一般的权限，不具备系统菜单权限1', 'common', '2018-06-02 11:06:44', '2019-06-07 18:13:37');
INSERT INTO `sys_role` VALUES ('1002806178141937666', '财务', '拥有财务相关权限', 'finance', '2018-06-02 14:56:39', NULL);
INSERT INTO `sys_role` VALUES ('1002806220860923906', '仓管', '拥有财务相关权限', 'stock', '2018-06-02 14:56:49', NULL);
INSERT INTO `sys_role` VALUES ('1002806266750803970', '风控专员', '查看资料信息', 'risk', '2018-06-02 14:57:00', '2019-06-27 16:46:40');
INSERT INTO `sys_role` VALUES ('1002807171923550210', '审核专员', '拥有审核相关的权限', 'stuff', '2018-06-02 15:00:36', '2019-06-28 13:40:57');
INSERT INTO `sys_role` VALUES ('1151760761379459074', '手机登录', '手机登录', 'phoneNum', '2019-07-18 15:48:59', '2019-07-18 15:49:06');
INSERT INTO `sys_role` VALUES ('999999888888777777', '超级管理员', '具有本系统中最高权限', 'root', '2018-04-19 17:34:33', NULL);

-- ----------------------------
-- Table structure for sys_role_perm
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_perm`;
CREATE TABLE `sys_role_perm`  (
  `role_id` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `perm_val` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `perm_type` int(5) NULL DEFAULT NULL,
  PRIMARY KEY (`role_id`, `perm_val`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_role_perm
-- ----------------------------
INSERT INTO `sys_role_perm` VALUES ('1002748319131680769', 'a:sys:perm', 3);
INSERT INTO `sys_role_perm` VALUES ('1002748319131680769', 'a:sys:user:add', 3);
INSERT INTO `sys_role_perm` VALUES ('1002748319131680769', 'a:sys:user:del', 3);
INSERT INTO `sys_role_perm` VALUES ('1002748319131680769', 'a:sys:user:info', 3);
INSERT INTO `sys_role_perm` VALUES ('1002748319131680769', 'a:sys:user:info:update', 3);
INSERT INTO `sys_role_perm` VALUES ('1002748319131680769', 'a:sys:user:list', 3);
INSERT INTO `sys_role_perm` VALUES ('1002748319131680769', 'a:sys:user:role:find', 3);
INSERT INTO `sys_role_perm` VALUES ('1002748319131680769', 'a:sys:user:role:update', 3);
INSERT INTO `sys_role_perm` VALUES ('1002748319131680769', 'a:sys:接口', 3);
INSERT INTO `sys_role_perm` VALUES ('1002748319131680769', 'm:financ', 1);
INSERT INTO `sys_role_perm` VALUES ('1002748319131680769', 'm:hist', 1);
INSERT INTO `sys_role_perm` VALUES ('1002807171923550210', 'm:financappr', 1);
INSERT INTO `sys_role_perm` VALUES ('1002807171923550210', 'm:hist', 1);
INSERT INTO `sys_role_perm` VALUES ('1002807171923550210', 'm:ukey', 1);
INSERT INTO `sys_role_perm` VALUES ('999999888888777777', '*', NULL);

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`  (
  `uid` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户id',
  `uname` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '登录名，不可改',
  `nick` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户昵称，可改',
  `pwd` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '已加密的登录密码',
  `salt` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '加密盐值',
  `lock` tinyint(1) NULL DEFAULT NULL COMMENT '是否锁定',
  `created` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间',
  `updated` timestamp(0) NULL DEFAULT NULL COMMENT '修改时间',
  `branch_no` varchar(6) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`uid`) USING BTREE,
  UNIQUE INDEX `uname`(`uname`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1002748102537822209', 'zhangfei', '张飞', 'g+aRBmgVTTPkNLNwJfM64D8rwH94WEgDgckQ4fuQp6w=', 'Sqhvxsnc0HZSQEFKjBB9zQ==', NULL, '2018-06-02 11:05:52', NULL, NULL);
INSERT INTO `sys_user` VALUES ('1130661074740187137', 'test', 'test', 'c2VD9gI1RPPmkrsOuy4T28hFK0xfqUvzoIXBXFSs0DY=', 'QzhKq+viWnPmNJ463CklWg==', NULL, '2019-05-21 10:26:21', NULL, NULL);
INSERT INTO `sys_user` VALUES ('1131069446819323906', '1332', '13112', 'lDOLUG7sh+hOLW8vrIrdfJT4mxySkQaGRaRzdewgtrU=', 'o/tQwAx16TP62HCOTJMKhg==', NULL, '2019-05-22 13:28:55', NULL, NULL);
INSERT INTO `sys_user` VALUES ('1131069632064954370', '11111111', '11111111', '3+hp7JGDZ6IlfvSvFp/4s4XAiYHXHFkkU0lUkl1XtTE=', 'hsVMri0n0uroRadwCj6jhA==', NULL, '2019-05-22 13:29:49', NULL, NULL);
INSERT INTO `sys_user` VALUES ('1134495009870045185', '12', '31213', '10tur5qa4u68lDHU+vovS4iDo8sBo0QM5IyetzY1e+U=', 'SaT1Xwq+GN2JgnWc/BWx5A==', NULL, '2019-06-01 00:20:58', NULL, NULL);
INSERT INTO `sys_user` VALUES ('1136468769833807874', '平安操作员', 'uther', 'NHC5wh/CBGP5m0jOgPmWQbwrTUc/vMHMDa+wXy9bmSc=', 'NNkDRqDIuBh5xDgCtHjbrw==', NULL, '2019-06-06 11:04:03', NULL, NULL);
INSERT INTO `sys_user` VALUES ('1136522200636293121', '吉利操作员', '吉利', 'x05D6UPbk9zwib6AfNGMW003i/6k7B66c9TR9S3IkZ4=', 'vx7KgBUqCqsjrZNCRQ/U5Q==', NULL, '2019-06-06 14:36:23', NULL, NULL);
INSERT INTO `sys_user` VALUES ('1137015153206886402', 'user008', '测试用户008', '+mIkmiRzzzyPkn8982yCn17HqBeqhkpbzb05T0XXiAY=', 'yxzWYaKTW2G/5QeSXGsOAg==', NULL, '2019-06-07 23:15:12', NULL, NULL);
INSERT INTO `sys_user` VALUES ('1138119679714549762', '平安银行2', '平2', 'JIRuTb5+T2JQcClhITlAbm4o1S5hEtI6saOPtkHyoJI=', '6N4I4IY8QkLDBJ4X65ASXQ==', NULL, '2019-06-11 00:24:12', NULL, NULL);
INSERT INTO `sys_user` VALUES ('1138124599289274369', '平安银行3', '平3', '1YSJwY2vhdV+pzLR6YBTBKqouFuPWwpBSi12XFuev+4=', 'bI4EHyd5XS65OSkqqRkUAg==', NULL, '2019-06-11 00:43:44', NULL, '300001');
INSERT INTO `sys_user` VALUES ('1140563812601061378', '18986193667', '周亚超', 'X4D7Q8iy4NXMYKqTzOOUz3Er30fNqMWXlGdoUZXLHcs=', 'p0Kw1Xzx9VGWbfQ33FUOew==', NULL, '2019-06-17 18:16:18', NULL, '200001');
INSERT INTO `sys_user` VALUES ('1140791880112508929', 'xiaohuifen', '肖慧芬', 'gPPgPOUaO+rCPqkY8kVWRMfwXhMzDTF+tBQk9VMe7AA=', 'YPDKqO3UeruY0Sv9WzVF6w==', NULL, '2019-06-18 09:22:33', NULL, '900001');
INSERT INTO `sys_user` VALUES ('1140792683007152129', 'xiaowen', '肖文', 'hBUwC0t4x/BpidjnJMp0PuNWaqafMq53/7ms3Y66+PA=', 'nzr5qi81JwzFieRTNoyR8g==', NULL, '2019-06-18 09:25:45', NULL, '300001');
INSERT INTO `sys_user` VALUES ('1140797911857205249', 'huangjin', '黄巾', 'oRFX9VEuQ9O6cytjGVSIcc2Dmt5/SN08hJG2C5XVIsY=', 'RpthNMoRDdzTYBBnfB6j/Q==', NULL, '2019-06-18 09:46:32', NULL, '300001');
INSERT INTO `sys_user` VALUES ('1141030902072082434', 'gujia', '顾嘉', 'RK2Z5/tu6lbxYtiS0Qd33ycOGPGqcLP6KB2GZrcTIPk=', 'KqWpkrFuTo85f/3q3y29xg==', NULL, '2019-06-19 01:12:21', '2019-06-24 15:00:35', '300001');
INSERT INTO `sys_user` VALUES ('1143052458478571521', 'liuchuanlong', '刘传龙', 'iRTEuuEH7QiHk0UzV+/3w2Kxk9AWNoBiRRpk+WBhOLw=', '+kA1bbsl08wUCJTQBX7TUg==', NULL, '2019-06-24 15:05:18', NULL, '900001');
INSERT INTO `sys_user` VALUES ('1143052984498819074', 'xuqing', '许庆', '7UsZoUApqod4VcLt/Za6cXlL7/wruvcahMiG5WtvoCo=', 'wh+Ktt0yQqoYzKgo9lbZAA==', NULL, '2019-06-24 15:07:23', NULL, '900001');
INSERT INTO `sys_user` VALUES ('1143080449124425730', 'huangrui', '黄锐', 'zkz2A78NTrsBzZumXuGImQrM0KfatGNNAVM6qfe3nao=', 'elcBL4ybyEn+7vrw0IIF9Q==', NULL, '2019-06-24 16:56:31', NULL, '900001');
INSERT INTO `sys_user` VALUES ('1151708125447876610', '13517217808', 'momo', 'LNs+4M7QKs4a53W3n0zfuYwxYIgxZQdiDaKE0n8bAJ0=', 'FmKtnk+tLKGh5DznVJt0JQ==', NULL, '2019-07-18 12:19:49', '2019-07-19 08:52:48', '300001');
INSERT INTO `sys_user` VALUES ('1152097861706485762', '13797042675', '2675', '+7OCdf645+ihp4FbfnupSvKGymNRCAvKGpRnluBBrCM=', 'TF0WQH47Tltqi12kYTrg2g==', NULL, '2019-07-19 14:08:30', NULL, '500100');
INSERT INTO `sys_user` VALUES ('1152098097988407297', '13917744721', '4721', 'bE5hSvqPX9x0mknQNcnIUDVxHTC7G7qhw/TTf31Ah04=', 'Nm+4rtHfUctVjODBdDElJg==', NULL, '2019-07-19 14:09:26', '2019-07-30 18:06:03', '300001');
INSERT INTO `sys_user` VALUES ('1152123092303118337', '15377093667', '3667', 'K/FT1Rl+M7WNDyVWITb2QDFms+IitpJ4yQab6ollL2M=', 'MWrNJB1rQjJJlR7hGiJ4pw==', NULL, '2019-07-19 15:48:45', NULL, '200001');
INSERT INTO `sys_user` VALUES ('1153127565129416705', '18710168853', '18710168853', 'l8Pm882gYb3V+LyWV3jzcCoYd9dtuwpREsFXD6F+1kw=', 'PZhRLGglfxikVbg3gJLNZQ==', NULL, '2019-07-22 10:20:10', NULL, '300001');
INSERT INTO `sys_user` VALUES ('1154426934582976513', 'qwer', 'qwer', 'UO5ae9P5ACoBdKbaopM92iqOFa7oVlUZ2D56NdeTg5c=', 'EKuc7a39YezTI5yjXDt6yQ==', NULL, '2019-07-26 00:23:24', NULL, NULL);
INSERT INTO `sys_user` VALUES ('1154577906618368001', '萧小默默', '萧小默默', 'sDpJD7icEl+oPKntqZZy+b8auaKuCQKZ7wEyWxb1Mwg=', 'DGfOdezagnZs2wwqJ5WjcA==', NULL, '2019-07-26 10:23:18', NULL, NULL);
INSERT INTO `sys_user` VALUES ('1154583190552215554', '用户名', '用户名', 'Wbn7kV2OxtLBqX4bss56fwM2GX0Rc3UcQwfwcc1IpM0=', '+WweCHiEqRRDutNTMUH/eg==', NULL, '2019-07-26 10:44:18', NULL, NULL);
INSERT INTO `sys_user` VALUES ('1154588166586400769', '3344258', '3344258', '4E7sXkHcR7LsM5UOcrGcRYf0RwNP8d7P87HyeRXItko=', 'x3F2OBV7qC2FvPSScbJdOQ==', NULL, '2019-07-26 11:04:05', NULL, NULL);
INSERT INTO `sys_user` VALUES ('1154671391279185922', '晚安故事出版社', '晚安故事出版社', 'VmHLuIwFAKWefcUkVcxOfkcq8OuIUUU3JYkvKKhMK48=', '1rw9QsdrEBAYJ61dpCCchg==', NULL, '2019-07-26 16:34:47', NULL, NULL);
INSERT INTO `sys_user` VALUES ('1154672460772179969', '新华书店', '新华书店', 'CEW+19kTuz63FP/PM7v5vAvw4jVHjMeiZIkDlWbdtSU=', 'uks4VB7owF8ZyVUJvLcL5g==', NULL, '2019-07-26 16:39:02', NULL, NULL);
INSERT INTO `sys_user` VALUES ('1155646933012893698', 'zhouyachao', 'zhouyachao', 'PkloFlrCpy8YmrvdMvLQZ7gm7/gzmT8LiAjtKYUAXBY=', 'ykeqSs5GiGj51oeI48aURQ==', NULL, '2019-07-29 09:11:14', NULL, NULL);
INSERT INTO `sys_user` VALUES ('1155745046038155266', 'test001', 'test001', '4V7DZxtOyA6pt6ZJK4+mvgqZzdjwOzflhR9sbCy1OJs=', 'pixi0G5WMnVpIQNH5pV+CQ==', NULL, '2019-07-29 15:41:06', NULL, NULL);
INSERT INTO `sys_user` VALUES ('1155748547237351425', '特仑苏', '特仑苏', 'X6drvvr7ilw5adEhbNvsNuHilafalAQi3JYwD5rEpbU=', 'D7AjVurwFf2+wx68/PSvEQ==', NULL, '2019-07-29 15:55:01', NULL, NULL);
INSERT INTO `sys_user` VALUES ('1155749321522647041', '沃尔玛', '沃尔玛', 'ipZFwb6OmDNF3xiHVtCo+meDMWWDMg38xrh1ne+vuCs=', 'E7C2Tu2CrHu8qlA+zoqfXA==', NULL, '2019-07-29 15:58:06', NULL, NULL);
INSERT INTO `sys_user` VALUES ('1156030432106573826', '我看看', '我看看', 'vXV9OH1yYba92NgkSc9r63CZZxsmo1IYe3TFVr++efw=', 'ikMaqDiwSrpKWgPG39fRRQ==', NULL, '2019-07-30 10:35:08', NULL, NULL);
INSERT INTO `sys_user` VALUES ('1156038856932388865', '万象万象', '万象万象', '+lpfz9Vij+RfGVthWCfZwubuc7V3NgpVcgm7+jTQ8oE=', 'cDcuuWwnhEhg9frPlu9leQ==', NULL, '2019-07-30 11:08:36', NULL, NULL);
INSERT INTO `sys_user` VALUES ('1156053288521625602', '15997429991', '15997429991', 'hGX8YS4hKZ8RAAm2k5WQq6J6m3S7FXE+nsgkpSGvh84=', 'qW3vpN/rqlsYTmt/8Sy40Q==', NULL, '2019-07-30 12:05:57', '2019-07-30 14:22:58', '600100');
INSERT INTO `sys_user` VALUES ('1156127895257673730', 'gaogaolili', 'gaogaolili', 'sC0FqH0uMJbHfUb4bF1jPhhalUDJReEDJ8noaW9SPMU=', 'nJJOzYbh5/rRuh4ZPZeWmg==', NULL, '2019-07-30 17:02:25', NULL, NULL);
INSERT INTO `sys_user` VALUES ('1156129053443420162', 'lulu', 'lulu', 'wQPgaPky4Akh900QPyewdK6BojuglKs3gTWPofo8ysE=', 'B7fnglOkP0ueXTPXx/y2wg==', NULL, '2019-07-30 17:07:01', NULL, NULL);
INSERT INTO `sys_user` VALUES ('1156387868038524929', '水葡萄', '水葡萄', 'JTf3I5bHCwZBm2XSm15yFYYrhOZsceEaluzkVTXZcBQ=', '0qZX69av4eB/GCJKgQ7w2A==', NULL, '2019-07-31 10:15:27', NULL, NULL);
INSERT INTO `sys_user` VALUES ('1156455023178252290', '三叶草', '三叶草', 'pULDxpjj2zXpnWKfYiKxwZDuTJ0TzpFefeHF0qYyo08=', 'Xu3N9bGlWC4HXVHeQ8VPyw==', NULL, '2019-07-31 14:42:18', NULL, NULL);
INSERT INTO `sys_user` VALUES ('1156741351891533825', '徐瑛', '徐瑛', 'qCyCGkck1AC6CBFnDVPi4Bq5UA17qovKw1a4hKBxBSs=', 'qR8ae9s+xhu5eTtEAnHozA==', NULL, '2019-08-01 09:40:04', NULL, NULL);
INSERT INTO `sys_user` VALUES ('1156858677681045505', '门户111', '门户111', 'ndnre8q89U5GSij+UW35ZpvIVHpd4WoqYapE27jaHWU=', 'zvED8/lrgcz6d3X8EvP79w==', NULL, '2019-08-01 17:26:17', NULL, NULL);
INSERT INTO `sys_user` VALUES ('1156892595172003842', '融资企业111', '融资企业111', 'xs3Vm9Wc/ybdvj668AzVdeHjV08Z4MEWvZAuVOeIJBU=', 'd2S5D8rGfpkxKu13y5L8zQ==', NULL, '2019-08-01 19:41:03', NULL, NULL);
INSERT INTO `sys_user` VALUES ('1156892951608152066', '核心企业1', '核心企业1', '7fFBLANwgVnbclFMbPxKpZu26VFbIC9n7bP787wjgG0=', '/WO0DCdBVsFs9IIYch4zpQ==', NULL, '2019-08-01 19:42:28', NULL, NULL);
INSERT INTO `sys_user` VALUES ('1157103743968268290', '周黑鸭', '周黑鸭', '+2lQEPRyB55QWJ0pHcBVecf8+AnCGCiSEHRG11EnIKg=', 'wu2Fn8P6poMTZ3JJaf81Gg==', NULL, '2019-08-02 09:40:05', NULL, NULL);
INSERT INTO `sys_user` VALUES ('1157104160986943489', '福达坊', '福达坊', '6Mt2DgEbQiO4cSlJSaPtmfaC0OSw8Vd3/W1w71Z94wg=', 'ThaK+/KAuFJaTck0P7ABqQ==', NULL, '2019-08-02 09:41:45', NULL, NULL);
INSERT INTO `sys_user` VALUES ('1157106374417633282', '武商量贩', '武商量贩', 'xc8WoFzbkRPK53T8r2p015FD3g5Jo4xxqw9D9xSbSeY=', 'nh6+RaGPPXM7HVgxADZZ7w==', NULL, '2019-08-02 09:50:32', NULL, NULL);
INSERT INTO `sys_user` VALUES ('1158607351746457601', '众申劳务', '众申劳务', 'PK8jV0bcZ2W2sZM3c0TojevHGeXn05yzvhSg6HaaJ8w=', 'Gdwp4nJ6kih24kvo8zK/qg==', NULL, '2019-08-06 13:14:53', NULL, NULL);
INSERT INTO `sys_user` VALUES ('1158609198582394882', '凝熙', '凝熙', 'E4TqdA3Jo7LmQj/KJ7faRKB3BYgZUXGxXGBo4VQs+uk=', '/cn7f2BQGyVKlAKjrrXVSg==', NULL, '2019-08-06 13:22:14', NULL, NULL);
INSERT INTO `sys_user` VALUES ('1158662490964365314', 'GL', 'GL', 'WZcnmUVTcQDWXQyPVsyG6vlrPwHQ3uGJx84W1/rYqbY=', 'Qtteu6adgATUGRc1XGni+A==', NULL, '2019-08-06 16:53:59', NULL, NULL);
INSERT INTO `sys_user` VALUES ('1159018382188728322', '肖战', '肖战', 'QkSOGf5rnaWbY47gQfijoJ5uiN82f7i52H9Darjdjsg=', 'p2EO02h2R0fyqtlrGYv5+g==', NULL, '2019-08-07 16:28:10', NULL, NULL);
INSERT INTO `sys_user` VALUES ('1159310844409008129', '王一博', '王一博', 'P8AIpicaAs+m2hlEt1gHAr/L3UC66JHNvE6wyEDEe8A=', 'p17hM6eggu515iwKE8XobQ==', NULL, '2019-08-08 11:50:19', NULL, NULL);
INSERT INTO `sys_user` VALUES ('1160189430972071938', '1111', '1111', 'ZgxI9lR7kqJ6M2CYQqjlQ35nV3WliYYDzvWgw9hULKY=', 'PxNUeqj74/tHVFNKFWa6xw==', NULL, '2019-08-10 22:01:29', NULL, '500100');
INSERT INTO `sys_user` VALUES ('1160201648736354305', 'Liudebin', NULL, '1mVxtcjYWcZOwAKS/MJoMz5ajyU/bRdD8z0HBJBEWto=', 'DeJWOenRk8Sc4PF9oNdnXQ==', NULL, '2019-08-10 22:50:03', NULL, NULL);
INSERT INTO `sys_user` VALUES ('1160493766595207169', 'ls-test', 'ls-test', 'vLk/DJkT/tSIITYBQrqEGhy6/hJ7EF/EanAPpw1Jj4c=', 'wJOaU/oCZm84cQRg7jUXWg==', NULL, '2019-08-11 18:10:40', NULL, NULL);
INSERT INTO `sys_user` VALUES ('1160493836690415618', 'ls-test2', 'ls-test', 'zwn7YdmJ/lpouhu+QBdna1XtUjSwwgrcqjpiL52Sylw=', 'L/aadJNyPntGIIhK7SDw/A==', NULL, '2019-08-11 18:11:06', NULL, NULL);
INSERT INTO `sys_user` VALUES ('1160538831779319809', 'buy1', NULL, 'A2EUKr3Mi+ZLWH4Yi+SgNqBcNxPt7PihL4TfyGV1Oks=', 'YLaT7jnafbrKkv5AZQdcWA==', NULL, '2019-08-11 21:09:54', NULL, NULL);
INSERT INTO `sys_user` VALUES ('18301156159', '18301156159', 'Tom', 'UxUcaBZLdUZSEN7sWQwDzhvxrslGxuJtnTGV+9CrVtc=', 'Luq05mSGZsEswW7oTQTN6g==', 0, '2018-04-17 17:41:53', '2019-07-19 00:01:24', NULL);
INSERT INTO `sys_user` VALUES ('986177923098808322', 'admin', '刘备', 'g+aRBmgVTTPkNLNwJfM64D8rwH94WEgDgckQ4fuQp6w=', 'Sqhvxsnc0HZSQEFKjBB9zQ==', 0, '2018-04-17 17:41:53', '2019-08-01 17:31:02', '300001');

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role`  (
  `user_id` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `role_id` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`user_id`, `role_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
INSERT INTO `sys_user_role` VALUES ('1002748102537822209', '1002748319131680769');
INSERT INTO `sys_user_role` VALUES ('1136468769833807874', '1002748319131680769');
INSERT INTO `sys_user_role` VALUES ('1136524301504446466', '1002748319131680769');
INSERT INTO `sys_user_role` VALUES ('1138124599289274369', '1002748319131680769');
INSERT INTO `sys_user_role` VALUES ('1140563812601061378', '1002748319131680769');
INSERT INTO `sys_user_role` VALUES ('1140791880112508929', '1002806178141937666');
INSERT INTO `sys_user_role` VALUES ('1140792683007152129', '1002748319131680769');
INSERT INTO `sys_user_role` VALUES ('1140797911857205249', '1002748319131680769');
INSERT INTO `sys_user_role` VALUES ('1141030902072082434', '1002807171923550210');
INSERT INTO `sys_user_role` VALUES ('1151708125447876610', '1002748319131680769');
INSERT INTO `sys_user_role` VALUES ('1152097861706485762', '1002748319131680769');
INSERT INTO `sys_user_role` VALUES ('1152098097988407297', '1002807171923550210');
INSERT INTO `sys_user_role` VALUES ('1152123092303118337', '1002807171923550210');
INSERT INTO `sys_user_role` VALUES ('1153127565129416705', '1002748319131680769');
INSERT INTO `sys_user_role` VALUES ('1153127565129416705', '1002806178141937666');
INSERT INTO `sys_user_role` VALUES ('1153127565129416705', '1002806220860923906');
INSERT INTO `sys_user_role` VALUES ('1153127565129416705', '1002806266750803970');
INSERT INTO `sys_user_role` VALUES ('1153127565129416705', '1002807171923550210');
INSERT INTO `sys_user_role` VALUES ('1153127565129416705', '1151760761379459074');
INSERT INTO `sys_user_role` VALUES ('1154672460772179969', '1002748319131680769');
INSERT INTO `sys_user_role` VALUES ('1155745046038155266', '1002748319131680769');
INSERT INTO `sys_user_role` VALUES ('1155748547237351425', '1002748319131680769');
INSERT INTO `sys_user_role` VALUES ('1155749321522647041', '1002748319131680769');
INSERT INTO `sys_user_role` VALUES ('1156030432106573826', '1002748319131680769');
INSERT INTO `sys_user_role` VALUES ('1156038856932388865', '1002748319131680769');
INSERT INTO `sys_user_role` VALUES ('1156053288521625602', '1002807171923550210');
INSERT INTO `sys_user_role` VALUES ('1156127895257673730', '1002748319131680769');
INSERT INTO `sys_user_role` VALUES ('1156129053443420162', '1002748319131680769');
INSERT INTO `sys_user_role` VALUES ('1156387868038524929', '1002748319131680769');
INSERT INTO `sys_user_role` VALUES ('1156455023178252290', '1002748319131680769');
INSERT INTO `sys_user_role` VALUES ('1156741351891533825', '1002748319131680769');
INSERT INTO `sys_user_role` VALUES ('1156858677681045505', '1002748319131680769');
INSERT INTO `sys_user_role` VALUES ('1156892595172003842', '1002748319131680769');
INSERT INTO `sys_user_role` VALUES ('1156892951608152066', '1002748319131680769');
INSERT INTO `sys_user_role` VALUES ('1157103743968268290', '1002748319131680769');
INSERT INTO `sys_user_role` VALUES ('1157104160986943489', '1002748319131680769');
INSERT INTO `sys_user_role` VALUES ('1157106374417633282', '1002748319131680769');
INSERT INTO `sys_user_role` VALUES ('1158607351746457601', '1002748319131680769');
INSERT INTO `sys_user_role` VALUES ('1158609198582394882', '1002748319131680769');
INSERT INTO `sys_user_role` VALUES ('1158662490964365314', '1002748319131680769');
INSERT INTO `sys_user_role` VALUES ('1159018382188728322', '1002748319131680769');
INSERT INTO `sys_user_role` VALUES ('1159310844409008129', '1002748319131680769');
INSERT INTO `sys_user_role` VALUES ('18301156159', '999999888888777777');
INSERT INTO `sys_user_role` VALUES ('986177923098808322', '999999888888777777');

-- ----------------------------
-- Table structure for test_vue
-- ----------------------------
DROP TABLE IF EXISTS `test_vue`;
CREATE TABLE `test_vue`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `type` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `age` int(10) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of test_vue
-- ----------------------------
INSERT INTO `test_vue` VALUES (1, 'yjiu', '石家庄', '1', 18);
INSERT INTO `test_vue` VALUES (2, 'sfgn', '大兴区', '2', 18);
INSERT INTO `test_vue` VALUES (3, 'yj', 'sf', '1', 13);
INSERT INTO `test_vue` VALUES (4, 'djdjd', 'dfadf', '1', 19);
INSERT INTO `test_vue` VALUES (5, 'kkk', 'kdkdd', '1', 30);
INSERT INTO `test_vue` VALUES (7, '111', '222', '2', 1);
INSERT INTO `test_vue` VALUES (8, 'qw2222', 'sadd', '1', 15);

SET FOREIGN_KEY_CHECKS = 1;
