package com.nicolas.demo.service;

import org.springframework.stereotype.Component;

import com.nicolas.demo.model.HelloWorld;

@Component
public class HelloWorldService {
  public HelloWorld getHelloWorld() {
    // On instancie et on retourne un HelloWorld
    return new HelloWorld();
  }
}
