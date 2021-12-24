FROM openjdk:11
RUN  -v /root/build/build:/tmp maven bash
RUN /bin/bash -c "source /tmp.sh; mvn clean install" 
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
