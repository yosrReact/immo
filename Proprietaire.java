public class Proprietaire {
    private int id;
    private String nom;
    private String prenom;
    private String num_telephone;

    public Proprietaire(String nom, String prenom, String num_telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.num_telephone = num_telephone;
    }

    public String getNom() {
        return nom;
    }

    public void setNom (String nom) {
        this.nom = nom;
    }

      public String getPrenom() {
        return prenom;
    }

    public void setPrenom (String prenom) {
        this.prenom = prenom;
    }

      public String getNum_telephone() {
        return num_telephone;
    }

    public void setNum_telephone (String num_telephone) {
        this.num_telephone = num_telephone;
    }


}