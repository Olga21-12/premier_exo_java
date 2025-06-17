package exercices.basiques;

public class TableauxBase {

    public static void main(String[] args) {

        // TODO: Créez un tableau avec 3 âges : 25, 30, 28
        int[] ages = {25,30,28};

        // TODO: Affichez le premier âge
        System.out.println("Premier âge: " + ages[0]);

        // TODO: Affichez le dernier âge
        System.out.println("Dernier âge: " + ages[ages.length - 1]);

        // TODO: Changez le deuxième âge à 35
        ages[1] = 35;

        // TODO: Affichez la taille du tableau
        System.out.println("Nombre d'âges: " + ages.length);

        // TODO: Affichez tous les âges

        int index = 1;
        for (int age : ages){
            System.out.println("Age "+ index++ + ": " + age);
        }

        System.out.println("------------------------");
        System.out.println("Âge 1: " + ages[0]);
        System.out.println("Âge 2: " + ages[1]);
        System.out.println("Âge 3: " + ages[2]);
    }

}

