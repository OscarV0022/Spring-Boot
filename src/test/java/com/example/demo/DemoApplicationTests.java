package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // Esto le dice a Spring que esta clase también maneja rutas web
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/") // Esta es la ruta raíz
    public String home() {
        return "<div style='text-align:center; margin-top:50px; font-family:sans-serif;'>" +
               "<h1>🚀 ¡SISTEMA DEVOPS ACTIVO!</h1>" +
               "<p style='font-size:1.2em;'>La aplicación de <b>Spring Boot</b> se desplegó correctamente.</p>" +
               "<hr style='width:50%;'>" +
               "<p>Infraestructura: <b>Terraform + AWS</b></p>" +
               "<p>CI/CD: <b>Jenkins + GitHub Actions</b></p>" +
               "<p>Contenedores: <b>Docker + Registry Privado</b></p>" +
               "<br>" +
               "<p><i>Estudiante: Oscar - 4to Año Ingeniería en Sistemas</i></p>" +
               "</div>";
    }
}