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
docker build -f DockerfileNginx .
<br>
<br>
docker network ls
<br>
<br>
docker run -p 80:80 --network "use the network name using the above command" --name emp-service-nginx-lb nginx
<br>
<br>
