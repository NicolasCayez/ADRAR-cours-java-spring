package com.nicolas.demo.service;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.stereotype.Component;

import com.nicolas.demo.model.Livre;

@Component
public class LivreService {
  /*
   * ATTRIBUTS
   */
  ArrayList<Livre> collection = new ArrayList<>();
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
    /*
   * Add
   */
  public void addToCollection() {
    // Initialisation
    Scanner scanner = new Scanner(System.in);
    // Menu
    boolean fini = false;
    while (!fini) {
      Livre livre = new Livre();
      System.out.println("Titre du livre ?");
      livre.setTitre(scanner.next());
      System.out.println("Description du livre ?");
      livre.setDescription(scanner.next());
      System.out.println("Date de publication du livre ? (JJ/MM/AAAA)");
      livre.setDatePublication(scanner.next());
      // Enregistrement
      collection.add(livre);
      System.out.println("Nouvelle saisie ? 1: Oui - 0: Non");
      switch (scanner.next()) {
        case "0":
          fini = true;
          break;
        case "1":
          System.out.println("Nouvelle saisie");
          break;
        default:
          break;
      }
    }
    // Affichage
    System.out.println("Collection actuelle :");
    for(Livre unLivre : collection){
      System.out.println(unLivre);
    }
  }
}
