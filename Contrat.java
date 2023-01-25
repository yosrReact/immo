public class Contrat {
  private int numClient;
  private String nom;
  private String telephone;

  public Contrat(int numClient, String nom, String telephone) {
    this.numClient = numClient;
    this.nom = nom;
    this.telephone = telephone;
  }

  public int getNumClient() {
    return numClient;
  }

  public void setNumClient(int numClient) {
    this.numClient = numClient;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }
}
