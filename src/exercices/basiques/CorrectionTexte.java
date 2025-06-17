package exercices.basiques;

public class CorrectionTexte {
    public static void main(String[] args) {
        // Texte avec des erreurs à corriger
        String texteOriginal = "Java Best in the WHOLE WORLD ! error";

// TODO: Créez un StringBuilder avec le texte original ET une capacité de minimum 64 caractères
        StringBuilder texte = new StringBuilder(64);
        texte.append(texteOriginal);


        System.out.println("Texte original: " + texte);
        System.out.println("Capacité initiale: " + texte.capacity());


// TODO: Supprimez " error" à la fin
        // Indice: utilisez .delete(debut, fin)

        //Solution 1
        int indexOfExclamation = texte.indexOf("!");
        System.out.println(indexOfExclamation);
        texte.delete(indexOfExclamation + 1, texte.length());
        System.out.println("Après suppression error: " + texte);

        //  Solution 2 lastIndexOf() qui vas chercher la première occurence mais cette fois ci en commencant par la fin du tableau

        int indexOfSpace = texte.lastIndexOf(" "); // on vas parcourir le tableau par la fin et chercher le premier espace

// TODO: Remplacez "WHOLE WORLD" par "whole world" (en minuscules)

        // Indice: utilisez .replace(debut, fin, nouveauTexte)

        //      Solution plus robuste  Mike
        String searchString = "WHOLE WORLD";
        int indexOfSearch = texte.indexOf(searchString);
        texte.replace(indexOfSearch, indexOfSearch + searchString.length(), searchString.toLowerCase());

        // Solution rapide. mais problematique si il y'a d'autres W ou D. un solution encore plus rapide c'est de compter a la main les index et de les placer directement
        //        int startString = texte.indexOf("W");
        //        int endString = texte.indexOf("D");
        //        texte.replace(startString, endString + 1, "whole world");


        System.out.println("Après passage en minuscules: " + texte);

// TODO: Ajoutez "language " entre "Best " et "in"
        // Indice: utilisez .insert(position, texte)

        int indexBest = texte.indexOf("Best");

        texte.insert(indexBest + "Best ".length(), "language"); // idéalement on stock Best dans une variable comme plus haut

        System.out.println("Après ajout de 'language': " + texte);

// TODO: Convertissez le StringBuilder en String finale
        String texteFinal = texte.toString();
//
        System.out.println("Texte final: " + texteFinal);

//        // TODO: Affichez les informations finales sur le StringBuilder
        System.out.println("Longueur finale: " + texte.length() + " caractères");
        System.out.println("Capacité finale: " + texte.capacity() + " caractères");

    }
}
