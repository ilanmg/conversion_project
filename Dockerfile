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
ENTRYPOINT java -cp selenium-docker.jar;selenium-docker-tests.jar;libs/* -DBROWSER=$BROWSER -DHUB_HOST=$HUB_HOST org.testng.TestNG $MODULE