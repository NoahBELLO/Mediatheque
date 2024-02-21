public class JeuVideo extends Documents {
    public JeuVideo(){
    }

    public JeuVideo(String t, String n){
        super(t, n);
    }

    @Override
    public String toString() {
        return super.toString() +"\nType de document = Jeu video";
    }

    public int getNombreJoursEmprunt(){
        return 25;
    }
}
