package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

    @GetMapping("/")
    public String index() {
        return "<h1>🚀 Servidor Spring Boot Activo</h1>" +
               "<p>Desplegado automáticamente con <b>Jenkins, Docker y Terraform</b>.</p>" +
               "<p>Parcial de Oscar - 4to Año Ingeniería en Sistemas</p>";
    }
}
