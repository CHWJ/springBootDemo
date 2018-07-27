CREATE DATABASE workorder
CHARACTER SET utf8
COLLATE utf8_general_ci;

CREATE TABLE workorder.sys_organ (
  Oid int(11) NOT NULL,
  Name varchar(50) DEFAULT NULL,
  ParentId int(11) DEFAULT NULL,
  Code varchar(50) DEFAULT NULL,
  Ancestors varchar(50) DEFAULT NULL,
  Operater varchar(50) DEFAULT NULL,
  OperateDate datetime DEFAULT NULL,
  State int(11) DEFAULT NULL,
  Lat varchar(50) DEFAULT NULL,
  Lon varchar(50) DEFAULT NULL,
  OrganType int(11) DEFAULT NULL,
  OrganOrder int(11) DEFAULT NULL,
  PRIMARY KEY (Oid)
)
ENGINE = INNODB
AVG_ROW_LENGTH = 1170
CHARACTER SET utf8
COLLATE utf8_general_ci;