CREATE TABLE PERSON (
	id INTEGER GENERATED BY DEFAULT AS IDENTITY,
	first_name varchar(255) not null,
	last_name varchar(255) not null
);

insert into PERSON (first_name, last_name) values ('Dave', 'Syer');
insert into PERSON (first_name, last_name) values ('Jarek', 'Zyzak');
insert into PERSON (first_name, last_name) values ('Abcd', 'Zzzz');