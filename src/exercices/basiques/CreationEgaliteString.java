package exercices.basiques;

public class CreationEgaliteString {
    public static void main(String[] args) {

        // TODO: Créez trois String avec la valeur "Belgique"
        String pays1 = "Belgique";     // Méthode normale
        String pays2 = "Belgique";     // Méthode normale
        String pays3 = new String("Belgique");     // Avec new (force nouvel objet)

        // TODO: Testez les égalités avec ==
        System.out.println("pays1 == pays2: " + (pays1 == pays2)); //true
        System.out.println("pays1 == pays3: " + (pays1 == pays3)); //false

        // TODO: Testez les égalités avec .equals()
        System.out.println("pays1.equals(pays2): " + (pays1.equals(pays2))); //true
        System.out.println("pays1.equals(pays3): " + (pays1.equals(pays3))); // true

        // TODO: Créez une String avec le nom de votre centre de formation
        String formation = "Cfitech";

        // TODO: Vérifiez si le nom contient "tech"
        boolean contientTech = formation.contains("tech"); // для проверки содержимого
        System.out.println("Le centre contient 'tech': " + contientTech);

        // TODO: Créez une String vide de deux façons différentes
        String vide1 = "";
        String vide2 = new String("");

        // TODO: Vérifiez si elles sont vides
        System.out.println("vide1 est vide: " + vide1 == "");
        System.out.println("vide2 est vide: " + vide2 == "");
    }
}
