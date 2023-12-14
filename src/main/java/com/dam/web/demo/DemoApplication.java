package com.dam.web.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

    @SpringBootApplication
    public static class MiPrimerProyectoApplication {

        public static void main(String[] args) {
            SpringApplication.run(MiPrimerProyectoApplication.class, args);
        }

    }
}
