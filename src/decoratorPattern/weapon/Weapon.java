package decoratorPattern.weapon;

public abstract class Weapon {
    String type;

    public abstract int damage();

    public abstract double weight();

    public String getDescription() {
        return "type: " + type +
                "\n\tdamage: " + damage() +
                "\n\tweight: " + weight() +
                "\n";
    }
}
