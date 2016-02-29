drop database if exists sampledb;

create database sampledb default character set utf8;

use sampledb;

--创建用户表
create table t_user(
	user_id int auto_increment primary key,
	user_name varchar(30),
	credits int,
	password varchar(32),
	last_visit datetime,
	last_ip varchar(23)
)ENGINE=InnoDB;

--创建用户登录日志表
create table t_login_log(
	login_log_id int auto_increment primary key,
	user_id int,
	ip varchar(23),
	login_datetime datetime
)ENGINE=InnoDB;
