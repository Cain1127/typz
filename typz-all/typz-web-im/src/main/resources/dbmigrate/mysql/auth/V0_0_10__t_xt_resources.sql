CREATE TABLE `t_xt_resources` (
  RESOURCE_ID     VARCHAR(32) not null,  
  RESOURCE_NAME   VARCHAR(100),  
  RESOURCE_DESC   VARCHAR(100),  
  RESOURCE_TYPE   VARCHAR(40),  
  RESOURCE_STRING VARCHAR(200),  
  PRIORITY        int(11),  
  ENABLED         int(11),  
  ISSYS           int(11),  
  MODULE          VARCHAR(4),  
  APP_ID          VARCHAR(40),  
  PRIMARY KEY (`RESOURCE_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;