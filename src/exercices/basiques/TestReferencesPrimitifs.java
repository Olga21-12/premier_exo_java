package exercices.basiques;

public class TestReferencesPrimitifs {

        public static void main(String[] args) {
            // Types primitifs
            int nombre1 = 100;
            int nombre2 = nombre1;  // Copie la VALEUR
            nombre1 = 200;

            System.out.println("nombre1: " + nombre1);  // 200
            System.out.println("nombre2: " + nombre2);  // 100 (inchangé)

            // Types références (String)
            String texte1 = "Hello";
            String texte2 = texte1;  // Copie l'ADRESSE
            texte1 = texte1 + " World"; // On verra ça dans l'immutabilité

            System.out.println("texte1: " + texte1);   // Hello World
            System.out.println("texte2: " + texte2);   // Hello
            System.out.println("Même objet ? " + (texte1 == texte2)); // true
        }
}
