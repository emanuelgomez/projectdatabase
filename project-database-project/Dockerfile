FROM java:7
MAINTAINER Ema <emanuel.gomez@redb.ee>

# install updates
RUN apt-get update && \
    apt-get clean && \
    rm -rf /var/lib/apt/*

# default log directory
#VOLUME ["/data/log"]

# copy spring boot jar as 'service.jar'
COPY build/libs/project-database-*.jar /service.jar

# service port
EXPOSE 8091

# define default jar name
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/service.jar"]