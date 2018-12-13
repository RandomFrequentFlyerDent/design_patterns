package decoratorPattern.weapon;

public class Sword extends Weapon {

    public Sword() {
        this.type = "Sword";
    }


    @Override
    public int damage() {
        return 10;
    }

    @Override
    public double weight() {
        return 1.5;
    }
}
