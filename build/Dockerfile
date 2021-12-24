FROM openjdk:11
RUN -itd -v  /root/build/build:/tmp maven bash
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
