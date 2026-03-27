package com.example.hola_mundo_devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // Agregá esto
public class HolaMundoDevopsApplication {

    public static void main(String[] args) {
        SpringApplication.run(HolaMundoDevopsApplication.class, args);
    }

    @GetMapping("/") // Y agregá este método
    public String hola() {
        return "<h1>¡Hola Mundo! Desplegado por Oscar desde AWS</h1>";
    }
}