#FROM tomcat:latest
#COPY restDemo.war /usr/local/tomcat/webapps/restDemo.war
#CMD ["catalina.sh", "run"]

FROM maven:3.3-jdk-8
EXPOSE 8080
ADD settings.xml /usr/local/tomcat/conf/
ADD tomcat-users.xml /usr/local/tomcat/conf/

ENV DOCKER_HOST http://172.17.42.1:4243

RUN mvn clean package docker:build

#ONBUILD CMD ["catalina.sh", "run"]
