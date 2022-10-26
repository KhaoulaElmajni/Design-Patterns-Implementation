public class ICalculerIGRAlgerie implements ICalculerIGR {
    @Override
    public float calculerIGR(float salaireBrutMensuel) {
        System.out.println("IGR d'ALGERIE...");
        float salaireBrutAnuel=salaireBrutMensuel*12;
        float taux=35;
        return salaireBrutAnuel*taux/100;
    }
}
