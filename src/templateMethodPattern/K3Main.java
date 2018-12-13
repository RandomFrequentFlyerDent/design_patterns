package templateMethodPattern;

import jdk.nashorn.internal.ir.IfNode;

public class K3Main {

    public static void main(String[] args) {
        K3Lid kathleen = new Kathleen();
        K3Lid kristel = new VisKristel();
        kathleen.bereidVoor();
        kristel.bereidVoor();

        String liedje = new String();

        K3Lid karen;
        if (liedje.equals("MaMaSe")) {
            karen = new MaMaSeKaren();
        } else {
            karen = new RegenBoogKaren();
        }
        karen.bereidVoor();

    }

}
