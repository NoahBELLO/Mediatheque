public class CdAudio extends Documents {
    private String compositeur;
    private String interprete;

    public CdAudio() {
    }

    public CdAudio(String t, String n, String c, String i) {
        super(t, n);
        this.compositeur = c;
        this.interprete = i;
    }

    public String getCompositeur() {
        return compositeur;
    }

    public void setCompositeur(String compositeur) {
        this.compositeur = compositeur;
    }

    public String getInterprete() {
        return interprete;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    @Override
    public String toString() {
        return super.toString() + "\nType de document = CD audio\nCompositeur = " + compositeur + "\nInterprete = "
                + interprete;
    }

    public int getNombreJoursEmprunt(){
        return 15;
    }
}
