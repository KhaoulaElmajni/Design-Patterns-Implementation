import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Donne moi le nom du personnage souhaité :");
            String personnageClassName = scanner.nextLine();
            Personnage personnage = (Personnage) Class.forName(personnageClassName).newInstance();
            System.out.println("le personnage souhaité  est : "+personnage);
            System.out.println("Donne moi le type du comortement d'arme :");
            String armeClassName = scanner.nextLine();
            ComportementArme comportementArme = (ComportementArme) Class.forName(armeClassName).newInstance();
            personnage.setComportementArme(comportementArme);
            personnage.combattre();
        }
    }
}
