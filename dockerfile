# Use official OpenJDK image as the base image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container
COPY build/libs/service.jar /app/service.jar

# Expose the port the app will run on
EXPOSE 8080

# Run the application when the container starts
ENTRYPOINT ["java", "-jar", "/app/service.jar"]
