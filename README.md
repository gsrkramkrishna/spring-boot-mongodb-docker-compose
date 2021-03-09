# spring-boot-mongodb-docker-compose

mvn clean install
<br>
<br>
docker build -t employee-service:1.0 .
<br>
<br>
docker tag employee-service:1.0 gsrkramkrishna/employee-service:1.0
<br>
<br>
docker push gsrkramkrishna/employee-service:1.0
<br>
<br>
docker-compose up -d
<br>
<br>
docker run -p 80:80 --network employee-service_default --name emp-service-nginx-lb nginx
<br>
<br>
