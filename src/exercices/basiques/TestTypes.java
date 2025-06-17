package exercices.basiques;

public class TestTypes {

   public static void main(String[] args) {
// TODO: Choisissez le bon type pour chaque variable
// 1. L'âge d'une personne (0 à 120)
           byte age = 25;
// 2. Le prix d'un produit avec centimes
           double prix = 199.99;
// 3. Si une lampe est allumée ou éteinte
           boolean estAllumee = true;
// 4. La note d'un examen (A, B, C, D, F)
           char note = 'B';
// 5. La distance de la Terre à la Lune (384 400 km)
            int distanceLune = 384400;
// 6. La population mondiale (8 milliards)
            long populationMondiale = 8000000000L; // Quelle lettre à la fin ?
// 7. La température précise d'un four __
            float temperatureFour = 220.5F; // Quelle lettre à la fin ?
// Affichez tout avec System.out.println

       System.out.println("Âge : " + age);
       System.out.println("Prix : " + prix);
       System.out.println("Lampe allumée : " + estAllumee);
       System.out.println("Note : " + note);
       System.out.println("Distance de la Terre à la Lune : " + distanceLune + " km");
       System.out.println("Population mondiale : " + populationMondiale);
       System.out.println("Température du four : " + temperatureFour + " °C");
        }
}
