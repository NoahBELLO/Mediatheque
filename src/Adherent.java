import java.util.ArrayList;

public class Adherent {
    private String identifiant;
    private String prenom;
    private String nom;
    private String email;
    private ArrayList<Documents> listeDocumentEmprunter = new ArrayList<>();

    public Adherent() {
    }

    public Adherent(String identifiant, String prenom, String nom, String email) {
        this.identifiant = identifiant;
        this.prenom = prenom;
        this.nom = nom;
        this.email = email;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setListeDocumentEmprunter(ArrayList<Documents> listeDocumentEmprunter) {
        this.listeDocumentEmprunter = listeDocumentEmprunter;
    }

    public void addDocumentEmprunte(Documents document) {
        listeDocumentEmprunter.add(document);
    }

    public void suppDocumentEmprunte(Documents document) {
        listeDocumentEmprunter.remove(document);
    }

    public ArrayList<Documents> getDocumentsEmpruntes() {
        return listeDocumentEmprunter;
    }

    @Override
    public String toString() {
        return "Adherent [identifiant=" + identifiant + ", prenom=" + prenom + ", nom=" + nom + ", email=" + email
                + "]";
    }
}
