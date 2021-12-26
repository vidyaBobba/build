#
#Build Stage
#
FROM maven:3.6.0-jdk-11-slim AS buildd
COPY src /tmp/src
COPY pom.xml /tmp/
WORKDIR /tmp/
RUN mvn clean install

#
# Package stage
#
FROM openjdk:11-jre-slim
COPY --from=buildd /tmp/target/build.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]