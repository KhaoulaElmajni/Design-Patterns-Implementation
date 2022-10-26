import standard.HdmiImpl;
import standard.Ordinateur;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Ordinateur ordinateur = new Ordinateur();
        ordinateur.setHdmi(new HdmiImpl());
        String str  = "khaoula";
        ordinateur.afficher(str.getBytes(str));
    }
}