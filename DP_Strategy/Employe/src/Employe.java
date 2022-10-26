public class Employe {
    private String cin;
    private float salaireBrutMensuel;
    private ICalculerIGR calculerIGR;
    public Employe(String cin, float salaireBrutMensuel,ICalculerIGR calculerIGR) {
        this.cin = cin;
        this.salaireBrutMensuel = salaireBrutMensuel;
        this.calculerIGR = calculerIGR;
    }

    public Employe() {
    }

    /*public float calculerIGR(){
        float salaireBrutAnuel=salaireBrutMensuel*12;
        float taux=42;
        return salaireBrutAnuel*taux/100;
    }*/
    public float getSalaireNetMensuel(){
        float igr=calculerIGR.calculerIGR(salaireBrutMensuel);
        float salaireNetAnuel=salaireBrutMensuel*12-igr;
        return salaireNetAnuel/12;
    }
// Getters et Setters


    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public float getSalaireBrutMensuel() {
        return salaireBrutMensuel;
    }

    public ICalculerIGR getCalculerIGR() {
        return calculerIGR;
    }

    public void setCalculerIGR(ICalculerIGR calculerIGR) {
        this.calculerIGR = calculerIGR;
    }

    public void setSalaireBrutMensuel(float salaireBrutMensuel) {
        this.salaireBrutMensuel = salaireBrutMensuel;
    }

}
