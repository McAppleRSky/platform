-- file: 10-create-user-and-db.sql
-- CREATE ROLE program WITH PASSWORD 'test';
-- ALTER ROLE program WITH LOGIN;
-- CREATE DATABASE homework3;
-- GRANT ALL PRIVILEGES ON DATABASE homework3 TO program;
CREATE SCHEMA wdata;
SET search_path TO wdata, public;
