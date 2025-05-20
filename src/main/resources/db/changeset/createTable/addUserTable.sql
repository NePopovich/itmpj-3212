--liquibase formatted sql
--changeset AlekseyLarkov:1

CREATE TABLE IF NOT EXISTS users
(
    id SERIAL PRIMARY KEY,
    name VARCHAR,
    last_name VARCHAR,
    email VARCHAR
);