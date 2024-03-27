package com.CrudChallenge.challengeGlobant3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ChallengeGlobant3Application {

	public static void main(String[] args) {
		SpringApplication.run(ChallengeGlobant3Application.class, args);
	}
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/api/tasks") // Configura la ruta de tu API aquí
						.allowedOrigins("http://localhost:5173/") // Permite solicitudes desde este origen
						.allowedMethods("GET", "POST", "PUT", "DELETE"); // Permite estos métodos HTTP
			}
		};
	}
}


