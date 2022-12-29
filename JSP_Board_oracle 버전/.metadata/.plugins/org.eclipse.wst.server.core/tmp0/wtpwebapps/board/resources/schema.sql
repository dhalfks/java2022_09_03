-- mysql VER.
use javadb;

-- 2022-11-25 생성
create table board(
bno int not null auto_increment,
title varchar(100) not null,
writer varchar(100) not null,
content text,
reg_date datetime default current_timestamp,
primary key(bno));

-- 2022-12-01 oracle db로 변경 (oracle VER.)
create sequence seq_board;

create table board(
bno number not null primary key,
title varchar2(100) not null,
writer varchar2(100) not null,
content long,
reg_date date default current_timestamp);