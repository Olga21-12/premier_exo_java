package exercices.basiques;

import java.util.Scanner;

public class FicheInscription {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("=== INSCRIPTION CFITECH ===");

        // TODO: Demandez le nom complet (String)

        System.out.print("Votre nom complet : ");
        String nom = in.nextLine();

        // TODO: Demandez l'âge (comme String puis convertir)

        System.out.print("Votre âge : ");
        String texteAge = in.nextLine().trim();
        int age = Integer.parseInt(texteAge); // String → int

        // TODO: Demandez la taille en mètres (comme String puis convertir)
        System.out.print("Votre taille (en mètres, ex: 1.75) : ");
        String texteTaille = in.nextLine();
        double taille = Double.parseDouble(texteTaille); // String → double

        // TODO: Convertissez la taille en centimètres * 100
        double tailleCm = taille * 100;

        // Affichage de la fiche
        System.out.println("\n=== VOTRE FICHE ===");
        System.out.println("Nom: " + nom);
        System.out.println("Âge actuel: " + age + " ans");
        System.out.printf("Taille: %.0f cm%n", tailleCm); // %.0f cm%n" 0 = сколько цифр оставляет после запятой

        System.out.println("Je m'appelle "+nom+", j'ai "+age+" ans je fait "+tailleCm+" cm.");

        System.out.printf("Je m'appelle %s, j'ai %d ans je fait %.3f cm.",nom,age,tailleCm);

        // TODO: Testez avec "vingt-cinq" comme âge. Que se passe-t￾il ?
    }
}
