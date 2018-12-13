package decoratorPattern.weapon.addon;

import decoratorPattern.weapon.Weapon;

public class LargeClip extends WeaponAddOnDecorator {
    Weapon weapon;

    public LargeClip(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public int damage() {
        return weapon.damage() + 5;
    }

    @Override
    public double weight() {
        return weapon.weight() + 0.5;
    }

    @Override
    public String getDescription() {
        return formatDescription("\t\tlarge clip\n", weapon);
    }
}
