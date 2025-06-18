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

        // TODO 3 : Carré d'étoiles 5x5
    System.out.println("\n=== Carré 5x5 d'étoiles ===");
        for (int ligne = 0; ligne < 5; ligne++) {
            for (int col = 0; col < 5; col++) {
                System.out.print("*");
            }
    System.out.println();
        }

        




    }
}
