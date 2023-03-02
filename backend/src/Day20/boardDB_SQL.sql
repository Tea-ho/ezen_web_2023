# DB 데이터베이스
drop database if exists boardDB;
create database boardDB;
use boardDB;

drop table if exists member;
create table member(
	mno int auto_increment primary key,
    mid varchar(15) not null unique,
    mpw	varchar(15) not null,
    mname varchar(15) not null,
    mphone varchar(13)
);

drop table if exists category;
create table category(
	cno int auto_increment primary key,
    cname varchar(20) not null
);

drop table if exists board;
create table board(
	bno int auto_increment primary key,
    btitle varchar(1000) not null,
    bcon longtext not null,
    bdate datetime default now(),
    bview int default 0,
	mno int,
	cno int,
    foreign key ( mno ) references member ( mno ) on delete set null,
    foreign key ( cno ) references category ( cno ) on delete cascade
);

drop table if exists reply;
create table reply(
	rno int auto_increment primary key,
    ccon text not null,
    cdate datetime default now(),
    rindex int,
    mno int,
    bno int,
    foreign key ( mno ) references member ( mno ) on delete set null,
    foreign key ( bno ) references board ( bno ) on delete cascade
);
