package com.danielalonso.examen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Clase que contiene el método main para ejecutar Spring Boot
 * @author Daniel Alonso Lopez
 *
 */
@ComponentScan(basePackages = {"com.danielalonso.examen"})
@SpringBootApplication
public class ExamenApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamenApplication.class, args);
	}

}
