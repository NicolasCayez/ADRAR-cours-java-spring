package com.nicolas.demo.model;

import org.springframework.beans.factory.annotation.Autowired;

import com.nicolas.demo.service.LivreService;

public class HelloWorld {
    /*
   * ATTRIBUTS
   */
  private String value = "Hello World !"; // Valeur par défaut
    /*
   * CONSTRUCTEUR VIDE
   */
  public HelloWorld() {
  }
  /*
   * GET/SET
   */
  // value
  public String getValue() {
    return this.value;
  }
  public void setValue(String value) {
    this.value = value;
  }
    /*
   * ToString
   */
  @Override
  public String toString() {
    return "{" +
      " value='" + getValue() + "'" +
      "}";
  }
}
