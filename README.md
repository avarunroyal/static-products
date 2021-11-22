# static-products
Simple products microservice which does GET operation with static products list

# Create docker image of products microservice and push to docker repository
$ mvn clean install
<br />$ docker push devopsvarun/products:0.0.1-SNAPSHOT

# RUN products microservice as docker container
$ docker run -p 8080:8080 devopsvarun/products:0.0.1-SNAPSHOT

# EXECUTE GET operations on postman
http://localhost:8080/products (GET)
