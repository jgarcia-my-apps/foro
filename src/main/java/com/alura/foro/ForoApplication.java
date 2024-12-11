package com.alura.foro;  // Paquete raíz

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // Esta anotación habilita la configuración automática de Spring Boot
public class ForoApplication {
	public static void main(String[] args) {
		SpringApplication.run(ForoApplication.class, args);  // Inicia la aplicación
	}
}
