package structure.exercices;

import java.util.Scanner;

public class ControleAcces {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("===Control d'accès Discothèque===");

        System.out.print("Votre nom complet : ");
        String nom = in.nextLine();

        System.out.print("Votre âge : ");
        String ageT = in.nextLine();
        int age = Integer.parseInt(ageT);

        if (age >= 18) {
            System.out.println("Accès autorisé ! Bonne soirée " + nom);
        }else {
            System.out.println("Accès refusé ! Revenez dans quelques années " + nom);
        }


    }
}
