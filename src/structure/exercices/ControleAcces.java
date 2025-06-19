package structure.exercices;

import java.util.Scanner;

public class ControleAcces {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("===Contrôle d'accès Discothèque===");

        System.out.print("Votre nom complet : "); //println = в конце строчки переходит на другую строку; print - курсор остается на той же строке
        String nom = in.nextLine();

        System.out.print("Votre âge : ");

        int age = Integer.parseInt(in.nextLine().trim());

        if (age >= 18) {
            System.out.println("Accès autorisé ! Bonne soirée " + nom); // System.out.printf("Accès autorisé ! Bonne soirée %s !", nom);
        }else {
            System.out.println("Accès refusé ! Revenez dans quelques années " + nom);
        }

        String message = (age >= 18) ? "Vous êtes majeur" : "Vous êtes mineur";
        System.out.println(message);
    }
}
