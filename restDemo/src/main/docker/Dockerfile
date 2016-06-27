FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ENV DOCKER_HOST="tcp://172.17.42.1:4243"
ADD restDemo.jar app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]