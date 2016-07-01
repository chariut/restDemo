#FROM frolvlad/alpine-oraclejdk8:slim
#VOLUME /tmp
#ENV DOCKER_HOST="http://172.17.42.1:4243"
#ADD restDemo.jar app.jar
#RUN sh -c 'touch /app.jar'
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

FROM tomcat:latest

COPY restDemo.war /usr/local/tomcat/webapps/restDemo.war
ADD settings.xml /usr/local/tomcat/conf/
ADD tomcat-users.xml /usr/local/tomcat/conf/

CMD ["catalina.sh", "run"]