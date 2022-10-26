public abstract class Personnage {
    ComportementArme arme;

    public void setComportementArme(ComportementArme a) {
        this.arme = a;
    }

    public void combattre(){
        System.out.println("Combattre...");
        arme.utiliserArme();
    }
}
