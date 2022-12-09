FROM openjdk:17
ADD target/parcinfo.jar parcinfo.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "parcinfo.jar"]