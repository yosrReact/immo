public class immo {
    private String status;
    private String localisation;
    private Boolean etatdubien;
    private Integer prixachat;
    private Integer loyermensuel;
    private Integer chargemensuel;

    public immo(String status, String localisation, Boolean etatdubien, Integer prixachat, Integer loyermensuel,
            Integer chargemensuel) {

        this.status = status;
        this.localisation = localisation;
        this.etatdubien = etatdubien;
        this.prixachat = prixachat;
        this.loyermensuel = loyermensuel;
        this.chargemensuel = chargemensuel;

    }

    public String getStatut() {
        return status;
    }

    public String getLocalisation() {
        return localisation;
    }

    public Boolean getEtatdubien() {
        return etatdubien;
    }

    public Integer getPrixachat() {
        return prixachat;
    }

    public Integer getLoyermensuel() {
        return loyermensuel;
    }

    public Integer getChargemensuel() {
        return chargemensuel;
    }

    public void setStatut(String statut) {
        this.status = statut;
    }

    public void setLocalisation(String localisation) {
        this.status = localisation;
    }

    public void setEtatdubien(String etatdubien) {
        this.status = etatdubien;
    }

    public void setPrixachat(String prixachat) {
        this.status = prixachat;
    }

    public void setLoyermensuel(String loyermensuel) {
        this.status = loyermensuel;
    }

    public void setChargemensuel(String chargemensuel) {
        this.status = chargemensuel;
    }

}