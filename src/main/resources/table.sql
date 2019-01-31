CREATE SCHEMA melt_security;
CREATE TABLE customer(
	id SERIAL NOT NULL PRIMARY KEY,
	name VARCHAR(255),
	email VARCHAR(255),
	age int
);
CREATE UNIQUE INDEX user_id_uindex ON customer (id);