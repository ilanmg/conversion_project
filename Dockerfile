FROM ubuntu 

RUN apk add curl jq

# Workspace ilan
#WORKDIR /usr/share/

# ADD .jar under target from host
# into this image
#ADD target/selenium-docker.jar 			selenium-docker.jar
#ADD target/selenium-docker-tests.jar 	selenium-docker-tests.jar
#ADD target/libs							libs


# ADD suite files
ADD Sanity.xml			            	Sanity.xml


# BROWSER
# HUB_HOST
# MODULE
#sh healthcheck.sh
ENTRYPOINT mvn test -DsuiteXmlFile=Sanity.xml -Dremote=true