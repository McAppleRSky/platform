#FROM eclipse-temurin:8-jre-alpine as platform_with_jar
FROM eclipse-temurin:8-jdk as platform_with_jar
#FROM openjdk:8-jdk-alpine AS postgres_with_script
WORKDIR /opt/platform
COPY ./*.jar /opt/platform/platform.jar
RUN java -Djarmode=layertools -jar ./platform.jar extract --destination extracted

#FROM eclipse-temurin:8-jre-alpine
#FROM eclipse-temurin:8-jdk
#ENV PORT=8080
#RUN addgroup -S springs && adduser spring --groups springs && chown -R spring:springs /opt/platform && chown -R spring:springs /var/log/platform
#USER spring:springs
#WORKDIR /var/log/platform
#WORKDIR /opt/platform
#RUN mkdir -p /opt/log
#COPY --from=platform_with_jar /opt/platform/extracted/spring-boot-loader .
#COPY --from=platform_with_jar /opt/platform/extracted/dependencies .
#COPY --from=platform_with_jar /opt/platform/extracted/snapshot-dependencies .
#COPY --from=platform_with_jar /opt/platform/extracted/application .
#ENTRYPOINT ["java", "-jar", "./platform.jar", "-Dserver.port=${PORT}", "-Xmx512m", "-Xms512m", "org.springframework.boot.loader.JarLauncher"]
ENTRYPOINT ["java", "-jar", "./platform.jar", "org.springframework.boot.loader.JarLauncher"]
#ENTRYPOINT ["java", "-version", "2>./spring.log"]
#ENTRYPOINT ["java", "-version"]
#CMD ["java", "-version"]
