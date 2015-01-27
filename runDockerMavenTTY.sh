
docker run -t -i --name tomcat-maven -p 8080:8080 --link mongodb:mongodb --rm jeffdavisco/tomcat-maven:latest 

# once running you can identify the IP addr by using: boot2docker ip. Then, use that IP to access port 8080
