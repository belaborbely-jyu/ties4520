FROM tomcat:9.0.71-jdk11

WORKDIR /usr/src/

COPY SSWAP_example/ ./SSWAP_example/
COPY SW_project/ ./SW_project/
COPY pom.xml .

RUN apt-get update -y 
RUN apt-get install maven -y
RUN mvn install -q
RUN cp SW_project/target/SW_project.war /usr/local/tomcat/webapps/client.war
RUN cp SSWAP_example/SSWAP_Client/target/SSWAP_Client.war /usr/local/tomcat/webapps/mediator.war
RUN cp SSWAP_example/SSWAP_Service/target/SSWAP_Service.war /usr/local/tomcat/webapps/service.war
RUN rm -rf SW_Project
RUN rm -rf SSWAP_example
RUN rm -f pom.xml
