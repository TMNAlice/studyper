drop database Devices;

CREATE database Devices;

USE Devices;

CREATE TABLE devtab (
	device_id INTEGER unsigned not null auto_increment,
	number INTEGER unsigned not null,
	name VARCHAR (120),
	primary key (device_id)
);

CREATE TABLE  (
	device_id INTEGER unsigned not null auto_increment,
	number INTEGER unsigned not null,
	name VARCHAR (120),
	primary key (device_id)
);

Insert into devtab (number, name) values (1, "qwerty");
Insert into devtab (number, name) values (2, "b2");
