package exercices.basiques;

import java.util.Scanner;

public class InscriptionCfitech {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("=== INSCRIPTION CFITECH ===");

        System.out.print("Votre âge : ");
        //age = in.nextInt();
        String ageTxt = in.nextLine();
        int age = Integer.parseInt(ageTxt);

        //in.nextLine();

        System.out.print("Votre nom complet : ");
        String nom = in.nextLine();

        //in.nextLine();

        System.out.print("Votre ville : ");
        String ville = in.nextLine();

        //in.nextLine();

        System.out.println("\n=== CONFIRMATION ===");
        System.out.println("Nom : " + nom);
        System.out.println("Âge : " + age + " ans");
        System.out.println("Ville : " + ville);
        System.out.println("Bienvenue à Cfitech !");

// TODO : Exécutez ce programme :  Entrez votre âge (ex: 25)
// TODO : Observez attentivement ce qui se passe après
// TODO : Que remarquez-vous d'étrange avec le nom et la ville ?

    }
}
