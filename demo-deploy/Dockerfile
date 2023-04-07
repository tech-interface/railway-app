FROM openjdk:11
COPY build/libs/*.jar demo-deploy.jar
ENTRYPOINT ["java","-jar","/demo-deploy.jar"]
EXPOSE 8080