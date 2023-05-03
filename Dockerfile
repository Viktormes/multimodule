FROM maven:3.8.7-eclipse-temurin-19 as build
WORKDIR /app
COPY . .
RUN mvn clean package

FROM eclipse-temurin:19-jre-jammy
WORKDIR /app
COPY --from=build /app/consumer/target/consumer-1.0-SNAPSHOT.jar /app/consumer.jar
COPY --from=build /app/service/target/service-1.0-SNAPSHOT.jar /app/service.jar
COPY --from=build /app/provider/target/provider-1.0-SNAPSHOT.jar /app/provider.jar
EXPOSE 8080
ENTRYPOINT ["java", "--module-path", "/app", "-m", "org.example.consumer/org.example.consumer.Consumer"]
