FROM openjdk:8

#passed while building image, not a proper way
ARG mongo_username
ARG mongo_password

WORKDIR /apps

COPY ./MovieServiceApp/build/libs/MovieServiceApp-1.0-SNAPSHOT.jar .

ENV MONGO_USERNAME=$mongo_username
ENV MONGO_PASSWORD=$mongo_password

EXPOSE 9090

CMD ["java", "-jar", "MovieServiceApp-1.0-SNAPSHOT.jar"]