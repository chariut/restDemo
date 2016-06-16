#--FROM tomcat:8-jre8

FROM maven:3.3-jdk-8
WORKDIR /
#ENV DOCKER_HOST http://172.17.42.1:4243
#ENV DOCKER_HOST tcp://192.168.59.103:2375  -- use boot2docker shellinit instead
RUN boot2docker shellinit
# Prepare by downloading dependencies
ADD pom.xml /pom.xml
RUN mvn clean package docker:build
COPY restDemo.war /usr/local/tomcat/webapps/restDemo.war
ADD settings.xml /usr/local/tomcat/conf/
ADD tomcat-users.xml /usr/local/tomcat/conf/

EXPOSE 8080
RUN pwd
CMD ["catalina.sh", "run"]



# Install maven
#--RUN apt-get update  
#--RUN apt-get install -y maven

#WORKDIR /code

# Prepare by downloading dependencies
#--ADD pom.xml /code/pom.xml  
#--RUN ["mvn", "dependency:resolve"]  
#--RUN ["mvn", "verify"]

# Adding source, compile and package into a fat jar
#--ADD src /code/src  
#--RUN ["mvn", "package"]

#RUN mvn clean package docker:build
#COPY target/restDemo.war /usr/local/tomcat/webapps/restDemo.war
#CMD ["catalina.sh", "run"]


#RUN mvn clean package docker:build

#ONBUILD CMD ["catalina.sh", "run"]	
