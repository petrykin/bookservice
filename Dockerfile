#
# Build stage
#
FROM maven:3-openjdk-17-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package -DskipTests

#
# Execute stage
#
FROM openjdk:17-slim
WORKDIR /usr/local/run
COPY --from=build /home/app/target/bookservice-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 5000 80
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=local-docker","app.jar"]
