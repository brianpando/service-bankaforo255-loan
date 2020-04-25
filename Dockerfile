FROM openjdk:13
VOLUME /tmp
EXPOSE 8084
ADD ./target/services-bankaforo255-loan-0.0.1-SNAPSHOT.jar service-loan.jar
# ENTRYPOINT ["java","-jar","/service-loan.jar"]
# ENTRYPOINT ["java","-jar","-Dspring.profiles.active=prod","-Dspring.cloud.config.uri=http://52.7.173.239:8888","/service-seguridad.jar"]
ENTRYPOINT ["java","-jar","-Dspring.cloud.config.uri=http://52.12.189.218:8084","/service-loan.jar"]