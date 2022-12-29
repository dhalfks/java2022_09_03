-- 2022-11-30
 create table member2(
email varchar(100) not null,
pwd varchar(100) not null,
nick_name varchar(100) not null,
reg_at datetime default current_timestamp,
last_login datetime,
primary key(email));

create table board(
bno int not null auto_increment,
title varchar(100) not null,
writer varchar(100) not null,
content text,
reg_date datetime default current_timestamp,
read_count int,
primary key(bno));

--2022-12-02
create table comment(
cno int not null auto_increment,
bno int default -1,
writer varchar(100) default "unknown",
content varchar(1000) not null,
reg_at datetime default current_timestamp, 
primary key(cno));