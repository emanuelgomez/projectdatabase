# projectdatabase
Demo con docker, spring boot, integracion con spring cloud de netflix oss


gradle bootRun a todos los proyectos

Api gateway esta configurado con zuul como edge server, se levanta en 8080
http://localhost:8080/project
http://localhost:8080/project/employees
http://localhost:8080/employee

Eureka Server
http://localhost:8092/
http://localhost:8092/eureka/apps

Hystrix Dashboard
http://localhost:8094/hystrix/

Streams con turbine 
- gateway (automaticamente monitorea los endpoint zuul): 
http://localhost:8094/hystrix/monitor?stream=http%3A%2F%2Flocalhost%3A8094%2Fturbine.stream%3Fcluster%3DGATEWAY
	
- project (automaticamente monitore los hystrix command)
http://localhost:8094/hystrix/monitor?stream=http%3A%2F%2Flocalhost%3A8094%2Fturbine.stream%3Fcluster%3DPROJECT



----
DOCKER COMPOSE

docker-compose up

En el caso de mac que uso una vm la reemplazar las url de arriba con la ip de la vm que da docker.

Eureka
http://192.168.99.100:8092/

Gateway turbine stream
http://192.168.99.100:8094/hystrix/monitor?stream=http%3A%2F%2F192.168.99.100%3A8094%2Fturbine.stream%3Fcluster%3DGATEWAY

Project turbine stream
http://192.168.99.100:8094/hystrix/monitor?stream=http%3A%2F%2F192.168.99.100%3A8094%2Fturbine.stream%3Fcluster%3DPROJECT

Url 
http://192.168.99.100:8080/project
http://192.168.99.100:8080/employee

Ejemplo url con feign
http://192.168.99.100:8080/project/employees



Eureka lanza -> Caused by: java.net.UnknownHostException: eureka: Name or service not known.
