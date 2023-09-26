FROM openjdk:17
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/SAFEPARKING-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} safe-parking.jar
ENTRYPOINT ["java","-jar","/safe-parking.jar"]