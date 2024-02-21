public class Dvd extends Documents {
    public Dvd() {
    }

    public Dvd(String t, String n) {
        super(t, n);
    }

    @Override
    public String toString() {
        return super.toString() + "\nType de document = DVD";
    }

    public int getNombreJoursEmprunt(){
        return 20;
    }
}
