#!/bin/bash
set -e

export POSTGRES_USER=$(cat /run/secrets/postgres-user)
export POSTGRES_PASSWORD=$(cat /run/secrets/postgres-password)

psql <<- EOSQL
  CREATE USER '${POSTGRES_USER}';
  CREATE ROLE '${POSTGRES_USER}' USER SUPERUSER;
  CREATE DATABASE platform-repo;
  CREATE SCHEMA wdata;
  SET search_path TO wdata, public;
  GRANT ALL PRIVILEGES ON DATABASE platform-repo TO '${POSTGRES_USER}';
  ALTER USER '${POSTGRES_USER}' WITH PASSWORD '${POSTGRES_PASSWORD}';
EOSQL
