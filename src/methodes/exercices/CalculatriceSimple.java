package methodes.exercices;

import java.util.Scanner;

public class CalculatriceSimple {

    public static void main(String[] args) {

        Scanner cal = new Scanner(System.in);

        afficherTitre();

        int resultat = CalculatriceSimple.additionner(5,3);
        System.out.println(resultat);

        System.out.print("Ecrivez nombre 1 : ");
        int nombre1 = cal.nextInt();

        System.out.print("Ecrivez nombre 2 : ");
        int nombre2 = cal.nextInt();

        System.out.println("Le résultat de "+nombre1+" + " + nombre2+" = "+additionner(nombre1, nombre2));

    }

        public static int additionner(int a, int b){
             return (a + b);
    }

        public static  void afficherTitre(){
            System.out.println("=== Calculatrice Simple ===");
    }
}

