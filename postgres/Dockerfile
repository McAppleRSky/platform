FROM postgres:16.8-alpine3.21 AS postgres_with_script
COPY schema.sql /docker-entrypoint-initdb.d
#COPY .db_username /var
#COPY .db_password /var
#RUN export POSTGRES_USER=$(cat /var/.db_username) && \
#    export POSTGRES_PASSWORD=$(cat /var/.db_password) #&& \
