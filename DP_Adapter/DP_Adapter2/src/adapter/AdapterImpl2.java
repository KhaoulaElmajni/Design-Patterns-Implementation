package adapter;

import ancienne.AncienneImpl;

public class AdapterImpl2  implements Standard{

    private AncienneImpl ancienne = new AncienneImpl();
    @Override
    public void operation(double nb1, double nb2) {
        double p = ancienne.produit(nb1,nb2);
        ancienne.afficher(p);
    }
}
