FROM maven:3.9.9-eclipse-temurin-21 AS build

RUN mkdir -p /usr/local/apps/notification-service
WORKDIR /usr/local/apps/notification-service

ADD target/notification-0.0.1.jar .
ENTRYPOINT ["java","-jar","notification-0.0.1.jar"]


# docker build -t notification-service .