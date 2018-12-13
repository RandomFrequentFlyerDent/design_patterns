package templateMethodPattern;

public abstract class K3Lid {
    protected String naam;

    final void bereidVoor() {
        doeMakeUpOp();
        doeHaar();
        trekKleedjeAan();
        trekSchoenenAan();
    }

    protected abstract void doeMakeUpOp();

    protected abstract void doeHaar();

    protected void trekSchoenenAan() {
        System.out.println(naam + " trekt roze schoenen aan");
    }

    protected void trekKleedjeAan() {
        System.out.println(naam + " trekt roze kleedje aan");
    }
    
}
