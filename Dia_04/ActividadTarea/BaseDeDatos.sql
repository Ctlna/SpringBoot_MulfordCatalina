create database restaurant_management;
use restaurant_management;

create table platos(
	id int primary key auto_increment not null,
	nombre VARCHAR(100) not null not null,
	precio decimal not null,
	disponibilidad boolean
);

create table mesas(
	id int primary key auto_increment,
	numero_mesa int unique not null,
	ocupada boolean
);

