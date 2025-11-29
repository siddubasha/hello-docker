FROM eclipse-temurin:17-jdk
COPY /target/hello-docker.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]