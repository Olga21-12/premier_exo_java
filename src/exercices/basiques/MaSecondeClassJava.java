package exercices.basiques;

public class MaSecondeClassJava {

    public static void main(String[] args) {

        System.out.println("=== Informations sur l'environnement Java ===");
        System.out.println("Version Java :"+System.getProperty("java.version"));
        System.out.println("Fournisseur JDK :"+System.getProperty("java.vendor"));
        System.out.println("Répertoire d'installation Java :"+System.getProperty("java.home"));
        System.out.println("\n=== Informations sur le système ===");
        System.out.println("Système d'explotation :"+System.getProperty("os.name"));
        System.out.println("Nom d'utilisateur :"+System.getProperty("user.name"));
    }
}
