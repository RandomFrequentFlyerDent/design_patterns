package decoratorPattern.weapon;

public class Gun extends Weapon {

    public Gun() {
        this.type = "Gun";
    }

    @Override
    public int damage() {
        return 25;
    }

    @Override
    public double weight() {
        return 3.0;
    }
}
