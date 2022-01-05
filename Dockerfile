FROM openjdk:8-jdk-alpine
MAINTAINER zfan
ADD target/web-deploy.jar app.jar
EXPOSE 10010
ENTRYPOINT ["java", "-jar", "/app.jar"]