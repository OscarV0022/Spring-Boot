package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

    @GetMapping("/")
    public String home() {
        return "<h1>🚀 ¡Despliegue Exitoso!</h1>" +
               "<p>Esta aplicación de Spring Boot fue desplegada automáticamente usando:</p>" +
               "<ul>" +
               "  <li><b>Terraform:</b> Para la infraestructura en AWS.</li>" +
               "  <li><b>Jenkins:</b> Para el CI y subir al Registry.</li>" +
               "  <li><b>GitHub Actions:</b> Para el CD con Runner propio.</li>" +
               "</ul>" +
               "<p><b>Estudiante:</b> Oscar - 4to Año Ingeniería</p>";
    }
}