FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar Hospital-management-system.jar
ENTRYPOINT ["java", "-jar", "Hospital-management-system.jar"]
EXPOSE 8080