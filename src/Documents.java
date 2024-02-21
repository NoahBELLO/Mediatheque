public abstract class Documents {
    private String titre;
    private String numeroUnique;

    public Documents() {
    }

    public Documents(String titre, String numeroUnique) {
        this.titre = titre;
        this.numeroUnique = numeroUnique;
    }

    public String getTitre() {
        return titre;
    }

    public String getNumeroUnique() {
        return numeroUnique;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setNumeroUnique(String numeroUnique) {
        this.numeroUnique = numeroUnique;
    }

    @Override
    public String toString() {
        return "Document :\nTitre = " + titre + "\nNumero Unique = " + numeroUnique;
    }

    public abstract int getNombreJoursEmprunt();
}
