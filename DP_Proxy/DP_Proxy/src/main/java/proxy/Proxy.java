package proxy;

import metier.IMetier;
import metier.MetierImpl;

import java.util.HashMap;
import java.util.Map;

public class Proxy  implements IMetier {

    private Map<Integer,Double> cache = new HashMap<>();
    private MetierImpl metier = new MetierImpl();
    @Override
    public double Calcul(int x) {
        Double data = cache.get(x);
        if(data!=null) return data;
        else {

            double res = metier.Calcul(x);
            cache.put(x,res);
            System.out.println("From Metier");
            return res;
        }
    }
}
