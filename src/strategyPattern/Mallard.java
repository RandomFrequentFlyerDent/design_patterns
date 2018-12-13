package strategyPattern;

import strategyPattern.behaviour.FlyWithWings;

public class Mallard extends Duck {

    public Mallard() {
        setFlyBehaviour(new FlyWithWings());
    }
}
