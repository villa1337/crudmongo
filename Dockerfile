FROM openjdk:17-jdk

WORKDIR /Crud

COPY ./target/crud-0.0.1-SNAPSHOT.jar /Crud/crud.jar

ENTRYPOINT ["java", "-jar", "crud.jar"]