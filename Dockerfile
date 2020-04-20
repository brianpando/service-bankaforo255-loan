FROM openjdk:13
VOLUME /tmp
EXPOSE 8084
ADD ./target/services-bankaforo255-loan-0.0.1-SNAPSHOT.jar service-loan.jar
ENTRYPOINT ["java","-jar","/service-loan.jar"]