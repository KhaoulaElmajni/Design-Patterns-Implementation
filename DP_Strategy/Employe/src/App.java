import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Employe employe = new Employe();
        employe.setCin("MC285849");
        employe.setSalaireBrutMensuel(130000);
        System.out.println("de quel pays vous etes ?");
        Scanner reader = new Scanner(System.in);
        String pays = reader.nextLine();
        if (pays.equals("Maroc")){
            ICalculerIGR calculerIGR = new ICalculerIGRMaroc();
            employe.setCalculerIGR(calculerIGR);
            employe.getSalaireNetMensuel();
        }else if (pays.equals("Algerie")){
            ICalculerIGR calculerIGR = new ICalculerIGRAlgerie();
            employe.setCalculerIGR(calculerIGR);
            employe.getSalaireNetMensuel();
        }else {
            System.out.println("le code d\'IGR n\'est pas encore implémenté !");
        }
        System.out.println("le salaire net mensuel de cet employe égale à = "+employe.getSalaireNetMensuel());

    }
}
