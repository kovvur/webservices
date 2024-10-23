# Use a base image with Java
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /home/ec2-user/app

# Copy the JAR file into the container
#COPY /home/ec2-user/webservices/webProject/target/webProject-0.0.1-SNAPSHOT.jar /home/ec2-user/app/webProject-0.0.1-SNAPSHOT.jar
COPY target/webProject-0.0.1-SNAPSHOT.jar /home/ec2-user/app/webProject-0.0.1-SNAPSHOT.jar

# Expose the port your app runs on (default for Spring Boot is 8080)
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "webProject-0.0.1-SNAPSHOT.jar"]
