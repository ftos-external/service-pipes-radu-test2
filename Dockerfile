FROM bellsoft/liberica-openjdk-alpine:21
ARG JAR_FILE
COPY ${JAR_FILE} /home/site/wwwroot/app.jar

RUN sed -i 's/https/http/' /etc/apk/repositories
RUN apk add openssh-server

# Copy the sshd_config file to the /etc/ssh/ directory
COPY sshd_config /etc/ssh/

# Open port 2222 for SSH access
EXPOSE 2222 80

# Copy and configure the ssh_setup file
RUN mkdir -p /tmp
COPY ssh_setup.sh /tmp
RUN chmod +x /tmp/ssh_setup.sh \
    && (sleep 1;/tmp/ssh_setup.sh 2>&1 > /dev/null)

RUN apk add openrc
RUN rc-update add sshd
ENTRYPOINT ["java","-jar","/home/site/wwwroot/app.jar"]
