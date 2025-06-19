package structure.exercices;

import java.util.Scanner;

public class DessinsBoucles {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // TODO 2 : Ligne d'étoiles simple
    System.out.println("=== Ligne d'étoiles ===");

        for (int i = 0; i < 10; i++) {
            System.out.print("*");
        }
    System.out.println(); // pour aller à la ligne


        // TODO 3 : Un triangle qui grandit ligne par ligne

        System.out.println("=== Un triangle qui grandit ligne par ligne ===");

        for (int ligne = 1; ligne <= 5; ligne++) {
            for (int etoile = 1; etoile <= ligne; etoile++) {
                System.out.print("*");
            }
            System.out.println(); // Nouvelle ligne
        }

        // TODO 4 : Un triangle ligne par ligne

        System.out.println("=== Un triangle ligne par ligne ===");

        for (int ligne = 1; ligne <= 5; ligne++) {
            for (int etoile = 6 - ligne; etoile > 0; etoile--) {
                System.out.print("*");
            }
            System.out.println(); // Nouvelle ligne
        }

        // TODO 5 : Carré d'étoiles 5x5
        System.out.println("=== Carré 5x5 d'étoiles ===");
        for (int ligne = 0; ligne < 5; ligne++) {
            for (int col = 0; col < 5; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // TODO 6 : Le contour d'un carré

        System.out.println("=== Le contour d'un carré ===");




    }
}
