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

# Fix DNS resolution issues when nss is not installed
RUN echo 'hosts: files mdns4_minimal [NOTFOUND=return] dns mdns4' >> /etc/nsswitch.conf

# Set DNS cache to 10 seconds (Cache is permanent by default). Network hosts are volatile in Docker clusters.
RUN grep '^networkaddress.cache.ttl=' /opt/${JAVA_PACKAGE}/jre/lib/security/java.security || echo 'networkaddress.cache.ttl=10' >> /opt/${JAVA_PACKAGE}/jre/lib/security/java.security

# service port
EXPOSE 8092

# define default jar name
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/service.jar"]