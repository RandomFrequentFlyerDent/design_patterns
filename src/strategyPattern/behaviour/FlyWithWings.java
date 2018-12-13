package strategyPattern.behaviour;

public class FlyWithWings implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("I'm flying, I'm flying!");
    }
}
