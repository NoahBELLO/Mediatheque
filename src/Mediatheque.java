import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Mediatheque {
    private ArrayList<Documents> listeDocument = new ArrayList<>();
    private ArrayList<Adherent> listeAdherent = new ArrayList<>();
    private ArrayList<Emprunt> listeEmprunt = new ArrayList<>();

    public void add(Documents d) {
        listeDocument.add(d);
    }

    public void supp(String numero) {
        for (Documents document : listeDocument) {
            if (document.getNumeroUnique() == numero) {
                listeDocument.remove(document);
                break;
            }
        }
    }

    public void afficherDocument() {
        for (Documents doc : listeDocument) {
            System.out.println("Titre : " + doc.getTitre());
        }
    }

    public void ajouterAdherent(Adherent a) {
        listeAdherent.add(a);
    }

    public void supprimerAdherent(String identifiant) {
        for (Adherent adherent : listeAdherent) {
            if (adherent.getIdentifiant() == identifiant) {
                listeAdherent.remove(adherent);
                break;
            }
        }
    }

    public void afficherAdherent() {
        for (Adherent adh : listeAdherent) {
            System.out.println("Nom : " + adh.getNom() + "\nPrenom : " + adh.getPrenom());
        }
    }

    public Documents recherche(String titre) {
        for (Documents document : listeDocument) {
            if (document.getTitre() == titre) {
                return document;
            }
        }
        return null;
    }

    public void gestionDesEmprunts(Documents doc, Adherent adh, String date) {
        if (documentDejaEmprunter(doc)) {
            System.out.println("Document deja emprunte");
        }

        else if (adherentQuiNePeutPlusEmprunter(adh)) {
            System.out.println("Cet adherent a deja 3 documents");
        }

        else {
            Emprunt emprunt = new Emprunt(doc, adh, date);
            listeEmprunt.add(emprunt);

            adh.addDocumentEmprunte(doc);
            System.out.println("L'emprunt du document '" + doc.getTitre() + "' par " + adh.getPrenom() + " "
                    + adh.getNom() + " a été effectué avec succès.");
        }
    }

    public void afficherEmprunt() {
        for (Emprunt emp : listeEmprunt) {
            System.out.println(emp);
        }
    }

    public boolean documentDejaEmprunter(Documents d) {
        for (Emprunt emprunt : listeEmprunt) {
            if (emprunt.getDocumentEmprunter().getNumeroUnique() == d.getNumeroUnique()) {
                return true;
            }
        }
        return false;
    }

    public boolean adherentQuiNePeutPlusEmprunter(Adherent a) {
        int compteurEmprunt = 0;
        for (Emprunt emprunt : listeEmprunt) {
            if (emprunt.getAdherent().getIdentifiant() == a.getIdentifiant()) {
                compteurEmprunt++;
            }
        }
        return compteurEmprunt >= 3;
    }

    public void retourEmprunt(Documents d) {
        for (Emprunt emprunt : listeEmprunt) {
            if (emprunt.getDocumentEmprunter().getNumeroUnique() == d.getNumeroUnique()) {
                listeEmprunt.remove(emprunt);
                break;
            }
        }

        for (Adherent adherent : listeAdherent) {
            adherent.suppDocumentEmprunte(d);
        }
    }

    public void documentEmprunterAdherent(Adherent adherent) {
        for (Emprunt emprunt : listeEmprunt) {
            if (emprunt.getAdherent().getIdentifiant() == adherent.getIdentifiant()) {
                System.out.println(emprunt.getDocumentEmprunter() + "\n");
            }
        }
    }

    public void afficherDocumentNonRetourner() {
        for (Emprunt emprunt : listeEmprunt) {
            LocalDate dateEmprunt = LocalDate.parse(emprunt.getDateEmprunt(),
                    DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            int nombreJoursEmprunt = emprunt.getDocumentEmprunter().getNombreJoursEmprunt();
            LocalDate dateRetourAttendue = dateEmprunt.plusDays(nombreJoursEmprunt);

            if (LocalDate.now().isAfter(dateRetourAttendue)) {
                System.out.println("Titre du document : " + emprunt.getDocumentEmprunter().getTitre());
                System.out.println("Date d'emprunt : " + emprunt.getDateEmprunt());
                System.out.println("Date de retour attendue : "
                        + dateRetourAttendue.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                System.out.println(
                        "Adhérent : " + emprunt.getAdherent().getPrenom() + " " + emprunt.getAdherent().getNom()
                                + "\nCoordonnées de l'adhérent : " + emprunt.getAdherent().getEmail() + "\n");
            }
        }
    }
}
