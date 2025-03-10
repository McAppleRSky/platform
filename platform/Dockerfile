#FROM eclipse-temurin:8-jre-alpine
FROM eclipse-temurin:8-jdk as platform_with_jar
#FROM openjdk:8-jdk-alpine AS postgres_with_script
COPY ./*.jar /opt
ENTRYPOINT ["java", "-jar", "/opt/app.jar"]
