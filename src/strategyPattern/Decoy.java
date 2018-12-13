package strategyPattern;

import strategyPattern.behaviour.NoFly;

public class Decoy extends Duck {

    public Decoy() {
        setFlyBehaviour(new NoFly());
    }
}
