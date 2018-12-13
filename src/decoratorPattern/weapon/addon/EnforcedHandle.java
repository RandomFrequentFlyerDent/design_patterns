package decoratorPattern.weapon.addon;

import decoratorPattern.weapon.Weapon;

public class EnforcedHandle extends WeaponAddOnDecorator {
    Weapon weapon;

    public EnforcedHandle(Weapon weapon) {
        this.weapon = weapon;
    }


    @Override
    public int damage() {
        return weapon.damage() + 2;
    }

    @Override
    public double weight() {
        return weapon.damage() + 1.5;
    }

    @Override
    public String getDescription() {
        return formatDescription("\t\tenforced handle\n", weapon);
    }
}
