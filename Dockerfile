#
# Java 1.7 & Maven Dockerfile
#

# Build using
# docker build -t="jeffdavisco/tomcat-maven:latest" .

# pull base image.
FROM dockerfile/java:oracle-java7

# maintainer details
MAINTAINER Jeff Davis "jeffdavisco@gmail.com"

# update packages and install maven
RUN  \
  export DEBIAN_FRONTEND=noninteractive && \
  sed -i 's/# \(.*multiverse$\)/\1/g' /etc/apt/sources.list && \
  apt-get update && \
  apt-get -y upgrade && \
  apt-get install -y vim wget curl git maven

# attach volumes
VOLUME /volume/git

# create working directory
RUN mkdir -p /local/git && git clone https://github.com/dajevu/docker-maven-tomcat && chmod +x /usr/local/bin/run.sh
WORKDIR /local/git/docker-maven-tomcat

# run terminal
#CMD "/bin/bash" "mvn jetty:run"

CMD ["run.sh"]
