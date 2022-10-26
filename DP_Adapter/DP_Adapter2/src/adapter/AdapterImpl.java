package adapter;

import ancienne.AncienneImpl;

public class AdapterImpl extends AncienneImpl implements Standard{

    @Override
    public void operation(double nb1, double nb2) {
        double p = produit(nb1,nb2);
        afficher(p);
    }
}
