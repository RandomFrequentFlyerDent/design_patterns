package templateMethodPattern;

public class Kathleen extends K3Lid {

    public Kathleen() {
        this.naam = "Kathleen";
    }

    @Override
    protected void doeMakeUpOp() {
        System.out.println(naam + " doet blauwe oogschaduw op");
    }

    @Override
    protected void doeHaar() {
        System.out.println(naam + " maakt staartjes");
    }
}
