FROM maven:3.3-jdk-8
#COPY . /usr/src/myapp
WORKDIR /usr/src/myapp

#RUN apt update
#RUN apt install maven -y

#ENTRYPOINT ["mvn"]
#CMD ["test"]

ENTRYPOINT ["./src/test/java/Drivers/chromedriver"]
#CMD [""]

#RUN mvn test
#CMD ["java", "Main"]