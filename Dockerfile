FROM adoptopenjdk/openjdk11:alpine-jre
ADD target/employee-service-0.0.1-SNAPSHOT.jar employee-service.jar
ENTRYPOINT ["java", "-jar", "employee-service.jar"]