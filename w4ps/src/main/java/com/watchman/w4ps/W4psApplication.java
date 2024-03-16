package com.watchman.w4ps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@RestController
public class W4psApplication extends SpringBootServletInitializer {
	//
	// Builds package for a server
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(W4psApplication.class);
	}

	// springboot applications
	public static void main(String[] args) {
		SpringApplication.run(W4psApplication.class, args);
	}

	// All component class files are automatically registered with Spring Beans.
	/*
	 * Spring beans are just instance objects that are managed by the Spring
	 * container,
	 * namely, they are created and wired by the framework and put into a
	 * "bag of objects"
	 * (the container) from where you can get them later.
	 * 
	 * The "wiring" part there is what dependency injection is all about, what it
	 * means is that
	 * you can just say "I will need this thing" and the framework will
	 * follow some rules to get you the proper instance.
	 */
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/products").allowedOrigins("http://localhost:8080");
			}
		};
	}

}
