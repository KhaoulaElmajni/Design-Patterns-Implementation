import metier.MetierImpl;
import proxy.Proxy;

public class Test {

    public static void main(String[] args) {

        Presentation presentation = new Presentation();

        presentation.setMetier(new Proxy());

        presentation.traitement(45);

        presentation.traitement(15);

        presentation.traitement(15);

    }
}
