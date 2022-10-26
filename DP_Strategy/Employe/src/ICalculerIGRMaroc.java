public class ICalculerIGRMaroc implements ICalculerIGR {
    @Override
    public float calculerIGR(float salaireBrutMensuel) {
        System.out.println("IGR du MAROC...");
        float salaireBrutAnuel=salaireBrutMensuel*12;
        if (salaireBrutAnuel<40000){
            float taux=5;
            return salaireBrutAnuel*taux/100;
        } else if (salaireBrutAnuel > 40000 && salaireBrutAnuel <120000) {
            float taux=20;
            return salaireBrutAnuel*taux/100;
        }else {
            float taux=42;
            return salaireBrutAnuel*taux/100;
        }
    }
}
