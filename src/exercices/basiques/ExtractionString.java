package exercices.basiques;

public class ExtractionString {
    public static void main(String[] args) {
        String email = "ahmed.hassan@cfitech.be";
        String adresse = "Rue de Bruxelles 15, 1000 Bruxelles";


        // TODO: Extrayez le nom d'utilisateur de l'email (avant le @)
        int indexArobase = email.indexOf('@'); // 12

        System.out.println(indexArobase);

        String utilisateur = email.substring(0, indexArobase);
        System.out.println("Utilisateur: " + utilisateur);

        // TODO: Extrayez le domaine de l'email (après le @)
        String domaine = email.substring(indexArobase + 1);
        System.out.println("Domaine: " + domaine);

//                // TODO: Vérifiez si l'email se termine par ".be"
        boolean estBelge = email.endsWith(".be");
        System.out.println("Email belge: " + estBelge);

//                // TODO: Extrayez le nom de la rue de l'adresse (avant le numéro)
        int indexEspace = adresse.indexOf(" ");
        int numeroDeRue = adresse.indexOf("15");

        String nomRue = adresse.substring(0, numeroDeRue);
        System.out.println("Nom de rue: " + nomRue);


        String nomComplet = "Fatima-Zahra Benali";

//                // TODO: Extrayez le prénom du nom complet (avant le tiret)
        int indexTiret = nomComplet.indexOf(" ");
        String prenom = nomComplet.substring(0, indexTiret);
        System.out.println("Prénom: " + prenom);
//
        String nomSansEspace = nomComplet.replaceAll("\\s", ""); // retirer tous les espaces dans un String
        System.out.println(nomSansEspace);
//                // TODO: Affichez la longueur du nom complet

        System.out.println("Longueur du nom: " + nomComplet.length());
//
//                // TODO: Convertissez le nom complet en majuscules
        String nomMajuscules = nomComplet.toUpperCase();
        System.out.println("Nom en majuscules: " + nomMajuscules);
    }
}
