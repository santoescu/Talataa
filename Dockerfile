FROM adoptopenjdk/openjdk11:latest
ARG JAR_FILE=*.jar
COPY applications/app-service/build/libs/app-service.jar app-service.jar
ENTRYPOINT ["java","-jar","/app-service.jar"]