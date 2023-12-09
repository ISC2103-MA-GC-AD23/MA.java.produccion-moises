FROM openjdk:17
RUN mkdir /opt/calculadora
COPY calculadora/target/calculadora-1.0-SNAPSHOT.jar /opt/calculadora
CMD ["java", "-jar", "/opt/calculadora/calculadora-1.0-SNAPSHOT.jar"]