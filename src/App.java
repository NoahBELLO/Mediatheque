public class App {
    public static void main(String[] args) throws Exception {
        /* Test des documents */
        Livre livre = new Livre("Percy Jackson", "1A", "Inconnu");
        CdAudio cd = new CdAudio("TNT", "1B", "Inconnu", "Inconnu");
        Dvd dvd = new Dvd("Le Voleur de foudre", "1C");
        JeuVideo jeu = new JeuVideo("La mer des monstres", "1D");
        BandeDessinee bande = new BandeDessinee("Le choc des titans", "1E");

        /* Test des adhérents */
        Adherent adherent = new Adherent("15A", "Noah", "Bello", "noah");
        Adherent adherent2 = new Adherent("15B", "Axel", "Bello", "axel");
        Adherent adherent3 = new Adherent("15C", "David", "Bello", "david");

        /* Test Mediatheque */
        Mediatheque mediatheque = new Mediatheque();
        mediatheque.add(livre);
        mediatheque.add(cd);
        mediatheque.add(dvd);
        mediatheque.add(jeu);
        mediatheque.add(bande);

        mediatheque.ajouterAdherent(adherent);
        mediatheque.ajouterAdherent(adherent2);
        mediatheque.ajouterAdherent(adherent3);

        mediatheque.gestionDesEmprunts(livre, adherent, "01/02/2024");
        mediatheque.gestionDesEmprunts(cd, adherent, "01/02/2024");
        mediatheque.gestionDesEmprunts(dvd, adherent, "01/02/2024");
        mediatheque.gestionDesEmprunts(livre, adherent, null);
        mediatheque.gestionDesEmprunts(bande, adherent, null);

        mediatheque.retourEmprunt(livre);

        mediatheque.documentEmprunterAdherent(adherent);

        mediatheque.afficherDocumentNonRetourner();
    }
}
