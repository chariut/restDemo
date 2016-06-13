FROM maven:3.3-jdk-8
EXPOSE 8080
ADD settings.xml /usr/local/tomcat/conf/
ADD tomcat-users.xml /usr/local/tomcat/conf/

RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app
ADD . /usr/src/app
ENV DOCKER_HOST unix:///private/var/tmp/docker.sock
RUN mvn clean package docker:build


