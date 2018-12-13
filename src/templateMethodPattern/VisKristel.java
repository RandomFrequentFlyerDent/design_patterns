package templateMethodPattern;

public class VisKristel extends Kristel {

    protected void trekKleedjeAan() {
        System.out.println(naam + " trekt vissen kleedje aan");
    }

    @Override
    protected void doeMakeUpOp() {
        System.out.println(naam + " doet blauw lippenstift op");
    }
}
