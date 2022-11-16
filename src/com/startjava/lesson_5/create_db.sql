CREATE DATABASE jaegers;
\c jaegers
CREATE TABLE jaegers (
    id SERIAL PRIMARY KEY,
    modelName TEXT,
    mark TEXT,
    height FLOAT,
    weight FLOAT,
    status BOOLEAN,
    origin TEXT,
    launch DATE,
    kaijuKill INTEGER);
