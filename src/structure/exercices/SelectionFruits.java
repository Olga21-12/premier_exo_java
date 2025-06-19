package structure.exercices;

import java.util.Scanner;

public class SelectionFruits {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // utilisez bloc de String)
        System.out.println("""
                Fruits disponibles :
                    🍎 pomme
                    🍌 banane
                    🍊 orange
                    🍓 fraise
                    🥝 kiwi
                """);


        System.out.print("Quel est votre fruit préféré ? ");
        String fruit = in.nextLine().toLowerCase();

        System.out.println("===== VERSION IF-ELSE =====");

        if (fruit.equals("pomme")) {
            System.out.println("Excellent choix ! La pomme est riche en fibres 🍎");
        } else if (fruit.equals("banane")) {
            System.out.println("Parfait ! La banane donne de l'énergie 🍌");
        } else if (fruit.equals("orange")) {
            System.out.println("Super ! L'orange est pleine de vitamine C 🍊");
        } else if (fruit.equals("fraise")) {
            System.out.println("Délicieux ! La fraise est sucrée et parfumée 🍓");
        } else if (fruit.equals("kiwi")) {
            System.out.println("Génial ! Le kiwi est exotique et vitaminé 🥝");
        } else {
            System.out.println("Désolé, nous n'avons pas " + fruit + " dans notre sélection 😒");
        }

        System.out.println("===== VERSION SWITCH =====");

        switch (fruit) {
            case "pomme" -> System.out.println("Excellent choix ! La pomme est riche en fibres 🍎");
            case "fraise" -> System.out.println("Délicieux ! La fraise est sucrée et parfumée 🍓");
            case "kiwi", "banane", "orange" -> System.out.println("🥝 Fruit exotique délicieux ! 🍊🍌");
            default -> System.out.println("Désolé, nous n'avons pas " + fruit + " dans notre sélection 😒");
        }

        String[] fruitsDispo = new String[]{"pomme🍎", "banane🍌", "orange🍊", "fraise🍓", "kiwi🥝"};
        System.out.println("\nTableau de fruits :");
        for (String fr : fruitsDispo) {
            System.out.println("- " + fr);
        }
    }
}

