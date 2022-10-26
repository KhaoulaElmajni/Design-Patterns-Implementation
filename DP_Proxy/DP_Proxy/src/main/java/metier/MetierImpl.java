package metier;

public class MetierImpl implements IMetier{
    @Override
    public double Calcul(int x) {
        double res = 50*x*x/3;
        return res;
    }
}
