package exercices.basiques;

public class ExerciceCasting {

    public static void main(String[] args) {
        // Variables de départ
        byte petit = 10;
        int moyen = 1000;
        long grand = 50000L;
        float decimal = 3.14F;
        double precis = 2.718281828;
        // TODO: Corrigez ces lignes (ajoutez les cast si nécessaire)
        // 1. Élargissements (normalement automatiques)
        int resultat1 = petit; // byte → int : pas besoins de cast
        long resultat2 = moyen; // int → long : pas besoins de cast
        double resultat3 = decimal; // float → double : pas besoins de cast
        // 2. Rétrécissements (cast explicite requis)
        int resultat4 = (int)grand; // long → int : cast nécessaire !!!
        float resultat5 = (float)precis; // double → float : cast nécessaire !!!
        byte resultat6 = (byte)moyen; // int → byte : cast nécessaire !!!
        // 3. Cas mixtes
        int resultat7 = (int)decimal; // float → int : cast nécessaire !!!
        byte resultat8 = (byte)decimal; // float → byte : cast nécessaire !!!
        // Affichez tous les résultats
        System.out.println("1. byte → int: " + resultat1);
        System.out.println("2. int → long: " + resultat2);
        System.out.println("3. float → double: " + resultat3);
        System.out.println("4. long → int: " + resultat4 + " (attention au   débordement!)");
        System.out.println("5. double → float: " + resultat5);
        System.out.println("6. int → byte: " + resultat6);
        System.out.println("7. float → int: " + resultat7 + " (partie décimale perdue!)");
        System.out.println("8. float → byte: " + resultat8);    }
}
