FROM openjdk:11-ea-9-jdk-slim
WORKDIR /Users/harshita/Documents/UTA/SecureProgramming/Assignment
ENV PORT 8080
EXPOSE 8080
COPY target/*.jar /Users/harshita/Documents/UTA/SecureProgramming/Assignment/app
ENTRYPOINT exec java $JAVA_OPTS -jar app.jar

