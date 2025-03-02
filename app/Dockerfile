#FROM eclipse-temurin:8-jre-alpine
FROM eclipse-temurin:8-jdk as build

ARG JAR_FILE
WORKDIR /build

ADD $JAR_FILE builded.jar
RUN java -Djarmode=layertools -jar builded.jar extract --destination extracted

FROM eclipse-temurin:8-jdk

RUN addgroup spring-usr-group && adduser --ingroup spring-usr-group spring-usr
USER spring-usr:spring-usr-group
VOLUME /tmp
WORKDIR /app

COPY --from=build /build/extracted/dependaencies .
COPY --from=build /build/extracted/spring-boot-loader .
COPY --from=build /build/extracted/snapshot-dependaencies .
COPY --from=build /build/extracted/application .

ENTRYPOINT exec java ${JAVA_OPTS} org.springframework.boot.loadder.launch.JarLauncher ${0} ${@}
