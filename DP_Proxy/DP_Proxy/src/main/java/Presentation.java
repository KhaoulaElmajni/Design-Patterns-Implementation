import metier.IMetier;

public class Presentation {

    private IMetier metier;

    public void setMetier(IMetier metier) {
        this.metier = metier;
    }

    public void traitement(int n){
        double res = metier.Calcul(n);
        System.out.println("#############");
        System.out.println("Pour "+n+" => "+res);
        System.out.println("****************");
    }

}
