FROM tomcat:9.0.71-jdk11

WORKDIR /usr/src/

COPY Service/ ./Service/

RUN apt-get update -y 
RUN apt-get install maven -y
RUN mvn -f Service/pom.xml package -Pproduction
RUN cp Service/target/service.war /usr/local/tomcat/webapps/service.war
RUN rm -rf Service
