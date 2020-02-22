# spring-boot-crud-rest-api
spring boot crud rest api with mysql


# create a database and create table
create database crudapi;

use crudaip;

create table tbl_employee(
	id int not null primary key AUTO_INCREMENT,
    name varchar(255),
    gender varchar(255),
    department varchar(255),
    dob date
)
