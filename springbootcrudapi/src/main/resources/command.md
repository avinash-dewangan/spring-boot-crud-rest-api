#use in command line in linux
curl http://localhost:8080/countries/1/2

# build war file
mvn clean install -Dmaven.test.skip=true

#run spring boot
$ mvn -q spring-boot:run

#H2
http://localhost:8080/h2-console