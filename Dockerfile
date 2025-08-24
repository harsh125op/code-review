# Step 1: Use a lightweight JDK image
FROM openjdk:17-jdk-slim

# Step 2: Set working directory
WORKDIR /app

# Step 3: Copy JAR file (make sure your JAR builds in target/)
COPY target/*.jar app.jar

# Step 4: Expose port (Spring Boot runs on 8080)
EXPOSE 8080

# Step 5: Run the JAR
ENTRYPOINT ["java", "-jar", "app.jar"]
