#FROM tomcat:latest
#COPY restDemo.war /usr/local/tomcat/webapps/restDemo.war
#CMD ["catalina.sh", "run"]

FROM maven:3.3-jdk-8
EXPOSE 8080
ADD settings.xml /usr/local/tomcat/conf/
ADD tomcat-users.xml /usr/local/tomcat/conf/


RUN mvn clean package docker:build
ENV DOCKER_HOST unix:///var/run/docker.sock

ONBUILD CMD ["catalina.sh", "run"]
