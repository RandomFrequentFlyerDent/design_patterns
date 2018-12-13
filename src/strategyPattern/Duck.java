package strategyPattern;

import strategyPattern.behaviour.FlyBehaviour;

public abstract class Duck {
    private FlyBehaviour flyBehaviour;

    public Duck() {
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void fly() {
        flyBehaviour.fly();
    }
}
