FROM maven AS build
ADD . /snakeyaml
WORKDIR /snakeyaml
RUN mvn clean compile assembly:single

FROM gcr.io/distroless/java:11
COPY --from=build /snakeyaml/target/snakeyaml-1.0-SNAPSHOT-jar-with-dependencies.jar /snakeyaml.jar

ENV PWN="CVE-2022-1471"

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/snakeyaml.jar"]
