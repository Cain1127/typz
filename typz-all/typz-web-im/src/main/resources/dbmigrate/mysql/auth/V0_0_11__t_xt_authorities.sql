CREATE TABLE `t_xt_authorities` (
  AUTHORITY_ID   VARCHAR(32) not null,  
  AUTHORITY_NAME VARCHAR(40),  
  AUTHORITY_DESC VARCHAR(100),  
  ENABLED        int(1),  
  ISSYS          int(1),  
  MODULE         VARCHAR(4),  
  APP_ID         VARCHAR(40),  
  PRIMARY KEY (`AUTHORITY_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;