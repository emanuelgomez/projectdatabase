# projectdatabase
Demo con docker, spring boot, integracion con spring cloud de netflix oss


#Correr
agregar a /etc/hosts 
192.168.99.100  projectdatabase.com

en la raiz hacer
gradle build
docker-compose up

projectdatabase.com/project-app
projectdatabase.com/employee-app

monitoring
http://projectdatabase.com:8083/
No mantiene el estado ya que no logro que vea las url de los otros proyectos, si bien se registran por el link que hay entre containers el container del monitor no puede ver las app de employee ni project



deberian funcionar
