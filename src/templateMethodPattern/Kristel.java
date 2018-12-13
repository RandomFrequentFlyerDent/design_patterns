package templateMethodPattern;

public abstract class Kristel extends K3Lid {

    public Kristel() {
        this.naam = "Kristel";
    }

    @Override
    protected void doeMakeUpOp() {
        System.out.println(naam + " doet roze lippenstift op");
    }

    @Override
    protected void doeHaar() {
        System.out.println(naam + " steilt haar");
    }
}
