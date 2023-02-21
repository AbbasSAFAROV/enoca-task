FROM adoptopenjdk/openjdk8
WORKDIR /app
COPY ./target/task-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
CMD ["java","-jar","app.jar"]