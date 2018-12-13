package strategyPattern.behaviour;

public class NoFly implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("Wahwah, I can't fly..");
    }
}
