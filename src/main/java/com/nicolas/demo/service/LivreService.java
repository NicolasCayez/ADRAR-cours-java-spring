package com.nicolas.demo.service;

import java.util.Scanner;

import org.springframework.stereotype.Component;

import com.nicolas.demo.model.Livre;

@Component
public class LivreService {
      /*
   * Add
   */
  public void add() {
    // Initialisation
    Scanner scanner = new Scanner(System.in);
    Livre livre = new Livre();
    System.out.println("Titre du livre ?");
    livre.setTitre(scanner.nextLine());
    System.out.println("Description du livre ?");
    livre.setDescription(scanner.nextLine());
    System.out.println("Date de publication du livre ? (JJ/MM/AAAA)");
    livre.setDatePublication(scanner.nextLine());
    // On affiche le livre saisi
    System.out.println("Livre saisi :");
    System.out.println(livre.toString());
  }
    /*
   * getLivre
   */
  public Livre getLivre(Livre livre) {
    return livre;
  }
}
