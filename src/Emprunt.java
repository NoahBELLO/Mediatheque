public class Emprunt {
    private Documents documentEmprunter;
    private Adherent adherent;
    private String dateEmprunt;

    public Emprunt() {
    }

    public Emprunt(Documents documentEmprunter, Adherent adherent, String dateEmprunt) {
        this.documentEmprunter = documentEmprunter;
        this.adherent = adherent;
        this.dateEmprunt = dateEmprunt;
    }

    public String getDateEmprunt() {
        return dateEmprunt;
    }

    public void setDateEmprunt(String dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

    public Documents getDocumentEmprunter() {
        return documentEmprunter;
    }

    public void setDocumentEmprunter(Documents documentEmprunter) {
        this.documentEmprunter = documentEmprunter;
    }

    public Adherent getAdherent() {
        return adherent;
    }

    public void setAdherent(Adherent adherent) {
        this.adherent = adherent;
    }

    @Override
    public String toString() {
        return "Emprunt [documentEmprunter=" + documentEmprunter + "\nadherent=" + adherent + "\ndateEmprunt="
                + dateEmprunt + "]\n";
    }
}
