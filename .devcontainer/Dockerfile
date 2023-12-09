FROM openjdk:17
RUN mkdir /opt/app
COPY app/target/app-1.0-SNAPSHOT.jar /opt/app
CMD ["java", "-jar", "/opt/app/app-1.0-SNAPSHOT.jar"]