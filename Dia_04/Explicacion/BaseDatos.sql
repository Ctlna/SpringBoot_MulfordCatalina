create database explicacion_JPA;
use explicacion_JPA;

-- API CRUD de personas basadas en Spring Data
create table person(
	id int primary key auto_increment,
    name varchar(255) null,
    age int not null
);

select * from person;