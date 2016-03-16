# projectdatabase
Demo con docker, spring boot, integracion con spring cloud de netflix oss


gradle bootRun a todos los proyectos

Api gateway esta configurado con zuul como edge server, se levanta en 8080
http://localhost:8080/project
http://localhost:8080/project/employees
http://localhost:8080/employee

Eureka Server
http://localhost:8092/

Hystrix Dashboard
http://localhost:8094/hystrix/

Streams con turbine 
- gateway (automaticamente monitorea los endpoint zuul): 
http://localhost:8094/hystrix/monitor?stream=http%3A%2F%2Flocalhost%3A8094%2Fturbine.stream%3Fcluster%3DGATEWAY
	
- project (automaticamente monitore los hystrix command)
http://localhost:8094/hystrix/monitor?stream=http%3A%2F%2Flocalhost%3A8094%2Fturbine.stream%3Fcluster%3DPROJECT
