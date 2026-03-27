# Usamos una imagen de Java liviana
FROM eclipse-temurin:17-jdk-alpine

# Creamos una carpeta para la app
WORKDIR /app

# Copiamos el archivo JAR que genera Maven (lo crearemos en el siguiente paso)
COPY target/*.jar app.jar

# Exponemos el puerto de Spring Boot
EXPOSE 8080

# Comando para arrancar
ENTRYPOINT ["java", "-jar", "app.jar"]