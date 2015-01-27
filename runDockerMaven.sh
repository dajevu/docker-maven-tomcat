
docker run -d --name tomcat-maven -p 8080:8080 --link mongodb:mongodb jeffdavisco/tomcat-maven:latest /local/git/docker-maven-tomcat/run.sh

# once running you can identify the IP addr by using: boot2docker ip. Then, use that IP to access port 8080
