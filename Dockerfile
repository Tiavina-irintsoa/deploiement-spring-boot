FROM openjdk:17
ADD target/back-0.0.1-SNAPSHOT.jar back-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar","back-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080