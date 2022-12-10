FROM openjdk:8
# FROM<image>
VOLUME /tmp

# Temporary location to run
EXPOSE 8081
# Provide port number
ADD target/parcinfo-0.0.1-SNAPSHOT.jar parcinfo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/parcinfo-0.0.1-SNAPSHOT.jar"]              # command to execute jar