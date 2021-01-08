DROP TABLE IF EXISTS account;
create table account (
  id         INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  nick       varchar(16),
  password   varchar(32),
  created_at datetime,
  updated_at datetime
) DEFAULT CHARSET UTF8MB4;