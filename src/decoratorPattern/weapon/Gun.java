package decoratorPattern.weapon;

public class Gun implements Weapon {

    public int damage() {
        return 25;
    }

    @Override
    public String attack() {
        return "attack with " + damage() + " damage";
    }
}
