FROM openjdk:11

ENV APP_HOME=/usr/app/

WORKDIR $APP_HOME

COPY target/*.jar app.jar

# VOLUME /tmp

# COPY target/tableauportal-0.0.1-SNAPSHOT.jar tableauportal-0.0.1-SNAPSHOT.jar

EXPOSE 8080

CMD ["java","-jar","app.jar"]