FROM maven:3.3-jdk-8
WORKDIR /
#ENV DOCKER_HOST http://172.17.42.1:4243
#ENV DOCKER_HOST tcp://192.168.59.103:2375  -- use boot2docker shellinit instead
#RUN boot2docker shellinit
# Prepare by downloading dependencies
ADD pom.xml /pom.xml
RUN pwd
ADD src/main/docker/Dockerfile /src/main/docker/Dockerfile
RUN mvn clean package docker:build

