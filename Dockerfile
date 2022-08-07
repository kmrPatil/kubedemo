FROM openjdk:8-jdk-alpine
EXPOSE 8080
COPY target/kubedemo-0.1.0.jar kubedemo-3.0.0.jar
ENTRYPOINT ["java","-jar","/kubedemo-3.0.0.jar"]