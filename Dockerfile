FROM maven:3.6.0-jdk-11-slim AS build
COPY src /usr/src/app/src
COPY pom.xml /usr/src/app/
RUN mvn dependency:go-offline
RUN mvn -f /usr/src/app/pom.xml clean package


FROM eclipse-temurin:17-jre-alpine
COPY --from=build /usr/src/app/target/test_backend*.jar /opt/test_backend.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar", "/opt/test_backend.jar"]
