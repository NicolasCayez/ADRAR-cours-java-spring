package com.nicolas.demo.model;

public class Livre {
      /*
   * ATTRIBUTS
   */
  private String titre;
  private String description;
  private String datePublication;
      /*
   * CONSTRUCTEUR
   */
  // Constructeur vide
  public Livre() {
  }
  // Constructeur complet
  public Livre(String titre, String description, String datePublication) {
    this.titre = titre;
    this.description = description;
    this.datePublication = datePublication;
  }
    /*
   * GET / SET
   */
  // titre
  public String getTitre() {
    return this.titre;
  }
  public void setTitre(String titre) {
    this.titre = titre;
  }
  // description
  public String getDescription() {
    return this.description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  // datePublication
  public String getDatePublication() {
    return this.datePublication;
  }
  public void setDatePublication(String datePublication) {
    this.datePublication = datePublication;
  }
      /*
   * ToString
   */
  @Override
  public String toString() {
    return "{" +
      " titre='" + getTitre() + "'" +
      ", description='" + getDescription() + "'" +
      ", datePublication='" + getDatePublication() + "'" +
      "}";
  }
}
