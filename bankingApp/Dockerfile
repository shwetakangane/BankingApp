FROM openjdk:17

COPY /target/banking-app.jar /usr/target/

WORKDIR /usr/target/

ENTRYPOINT [ "java","-jar","banking-app.jar" ]