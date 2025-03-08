FROM postgres:16.8-alpine3.21 AS postgres_with_script
COPY schema.sql /docker-entrypoint-initdb.d
