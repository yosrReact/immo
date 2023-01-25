public class immo {
    private String status;
    private String localisation;
    private boolean etatdubien;
    private int prixachat;
    private int loyermensuel;
    private int chargemensuel;

    public immo(String status, String localisation, boolean etatdubien, int prixachat, int loyermensuel,
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

    public boolean getEtatdubien() {
        return etatdubien;
    }

    public int getPrixachat() {
        return prixachat;
    }

    public int getLoyermensuel() {
        return loyermensuel;
    }

    public int getChargemensuel() {
        return chargemensuel;
    }

    public void setStatut(String statut) {
        this.status = statut;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public void setEtatdubien(boolean etatdubien) {
        this.etatdubien = etatdubien;
    }

    public void setPrixachat(int prixachat) {
        this.prixachat = prixachat;
    }

    public void setLoyermensuel(int loyermensuel) {
        this.loyermensuel = loyermensuel;
    }

    public void setChargemensuel(int chargemensuel) {
        this.chargemensuel = chargemensuel;
    }

}