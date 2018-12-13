package strategyPattern;

import strategyPattern.Decoy;
import strategyPattern.Duck;
import strategyPattern.Mallard;
import strategyPattern.behaviour.FlyWithWings;

public class DuckMain {

    public static void main(String[] args) {
        Duck mallard = new Mallard();
        Duck decoy = new Decoy();
        mallard.fly();
        decoy.fly();
        decoy.setFlyBehaviour(new FlyWithWings());
        decoy.fly();
    }

}
