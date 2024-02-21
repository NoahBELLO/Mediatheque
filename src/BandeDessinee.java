public class BandeDessinee extends Documents {
    public BandeDessinee() {

    }

    public BandeDessinee(String t, String n) {
        super(t, n);
    }

    @Override
    public String toString() {
        return super.toString() + "\nType de document = Bande dessinee";
    }

    public int getNombreJoursEmprunt(){
        return 30;
    }
}
