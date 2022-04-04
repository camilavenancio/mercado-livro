CREATE TABLE customer(
    id auto_increment primary key,
    name varchar(255) not null,
    email varchar(255) not null unique,
    status varchar(100)
);