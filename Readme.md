#test locally
mvn spring-boot:run  
#package
mvn clean package
docker build -t yomiping/hello-azure-service .
docker push yomiping/hello-azure-service 
