import adapter.AdapterImpl;
import adapter.AdapterImpl2;
import adapter.StandardImpl;
import ancienne.AncienneImpl;

public class App {


    public static void main(String[] args) {

        Client c = new Client();
        c.setStandard(new AdapterImpl2());
        c.traitement(9,9);

    }
}
