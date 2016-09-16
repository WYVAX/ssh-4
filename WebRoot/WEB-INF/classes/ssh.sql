create database ssh;

use ssh;

create table test (id int primary key auto_increment, name varchar(20));
create table user (id int primary key auto_increment, name varchar(20), password varchar(20));
