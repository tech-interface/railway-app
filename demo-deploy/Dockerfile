FROM openjdk:11
VOLUME /tmp
COPY build/libs/*.jar demo-deploy.jar
ENTRYPOINT ["java","-jar","/demo-deploy.jar"]
EXPOSE 8080