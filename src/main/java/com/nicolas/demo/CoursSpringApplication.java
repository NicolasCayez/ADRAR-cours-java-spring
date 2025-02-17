package com.nicolas.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nicolas.demo.service.HelloWorldService;
import com.nicolas.demo.service.LivreService;

@SpringBootApplication
public class CoursSpringApplication implements CommandLineRunner{

	@Autowired
	LivreService livreService;

	public static void main(String[] args) {
		SpringApplication.run(CoursSpringApplication.class, args);
	}

	@Override
	public void run(String... args) {
	/*
   * EXERCICE 1 - Hello World
   */
    // On instancie un HelloWOrldService
		HelloWorldService helloWorldService = new HelloWorldService();
		// getHelloWorld retourne l'objet et la méthode toString est appelée par défaut dans le print
		System.out.println(helloWorldService.getHelloWorld());
    /*
   * EXERCICE 2 - Livre
   */
		livreService.add();
	}

}
