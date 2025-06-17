package exercices.basiques;

public class LimitesTypes {

    public static void main(String[] args) {
        // Test 1 : Que se passe-t-il si on dépasse un byte ?
            int petit = 128;
        // Maximum d'un byte

            System.out.println("Byte max: " + petit);

        // TODO: Essayez byte tropGrand = 128; - Que dit IntelliJ ?

        // Test 2 : Précision des float vs double
            float precisonFloat = 1.123456789F;
            double precisionDouble = 1.123456789;

            System.out.println("Float: " + precisonFloat);
            System.out.println("Double: " + precisionDouble);

        // Que remarquez-vous sur la précision ?

        // Test 3 : Les char sont des nombres !
            char lettre = 'A';

            System.out.println("Lettre: " + lettre);
            System.out.println("Code Unicode: " + (int)lettre);
        // TODO: Que donne (char)66 ?

        char queDonne = 68;

        System.out.println("Que donne (char)68 : " + queDonne);


        // Rétrécissement - potentiellement dangereux
        double prix = 299.99;
        int prixEntier = (int) prix; // Cast explicite requis
        System.out.println(prixEntier); // 299 (partie décimale perdue !)
// Attention aux débordements !
        long tresgrand = 3000000000L;
        int tropPetit = (int) tresgrand; // ⚠️ Débordement possible !
        System.out.println(tropPetit); // Résultat imprévisible !


        }
    }
