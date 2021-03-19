**Create Volume and Cliams**
<br><br>
kubectl apply -f mongo-pv.yaml
<br><br>
kubectl apply -f mongo-pv-cliam.yaml
<br><br>
kubectl get pv
<br><br>
kubectl get pvc
<br><br>
**Create ConfigMap for Mongo**
<br><br>
kubectl apply -f mongo-config.yaml
<br><br>
kubectl get configMap
<br><br>

**Create Secret for Mongo**
**Note: Use only if required username and password. I have not used it.**
<br><br>.
kubectl apply -f mongo-secret.yaml
<br><br>
kubectl get secret
<br><br>

**Create Mongo deployment and service**
**Note: I have not used username and password for mongo db and removed username and password. Use mongo-deployment.yaml file if you required username and password.**
<br><br>
kubectl apply -f mongo-without-env-deployment.yaml
<br><br>
kubectl apply -f mongo-service.yaml
<br><br>
kubectl get deployment
<br><br>
kubectl get service
<br><br>
**Create Sring Boot Employee app and service**
**Note: I have not used username and password for mongo db and commented username and password in application.yaml. Use employee-deployment.yaml file if you required username and password and also un comment the username and password in applicaiton.yaml file.**
<br><br>
kubectl apply -f emplyee-without-env-deployment.yaml
<br><br>
**Note: the below service creates the load balancer. In local machine host name is localhost.**
kubectl apply -f employee-service.yaml
<br><br>
kubectl get deployment
<br><br>
kubectl get service
<br><br>
