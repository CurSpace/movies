FROM openjdk:17 as buildstage

WORKDIR /app

COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .
COPY src src
RUN ./mvnw package
COPY target/*.jar app.jar

FROM openjdk:17
COPY --from=buildstage /app/app.jar .
ENV PORT=8080

EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]






