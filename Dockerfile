# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jre-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the jar file into the container at /app
COPY target/Spring-Boot-Hello-Azure-0.0.1-SNAPSHOT.jar /app/hello-azure.jar

# Run the jar file
CMD ["java", "-jar", "hello-azure.jar"]

# Expose port 8080
EXPOSE 8080
