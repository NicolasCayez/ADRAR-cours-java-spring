package com.nicolas.demo.model;

import org.springframework.beans.factory.annotation.Autowired;

import com.nicolas.demo.service.LivreService;

public class HelloWorld {
    /*
   * ATTRIBUTS
   */
  private String value = "Hello World !"; // Valeur par défaut
  @Autowired
  private LivreService livreService = new LivreService();
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
  // livreService
  public LivreService getLivreService() {
    return this.livreService;
  }
  public void setLivreService(LivreService livreService) {
    this.livreService = livreService;
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
