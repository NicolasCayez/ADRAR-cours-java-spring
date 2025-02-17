package com.nicolas.demo.service;

import org.springframework.stereotype.Component;

import com.nicolas.demo.model.HelloWorld;

@Component
public class HelloWorldService {
  public HelloWorld getHelloWorld() {
    // On instancie un HelloWorld
    HelloWorld helloWorld = new HelloWorld();
    // On retourne le HelloWorld
    return helloWorld;
  }
}
