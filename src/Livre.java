public class Livre extends Documents {
    private String auteur;

    public Livre() {
    }

    public Livre(String t, String n, String a) {
        super(t, n);
        this.auteur = a;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        return super.toString() + "\nType de document = Livre\nAuteur = " + auteur;
    }

    public int getNombreJoursEmprunt(){
        return 10;
    }
}
