package decoratorPattern.weapon.addon;

import decoratorPattern.weapon.Weapon;

public class LargeClip extends WeaponAddOnDecorator {

    public LargeClip(Weapon weapon) {
        super(weapon);
    }

    @Override
    public int damage() {
        return getWeapon().damage() + 5;
    }

    @Override
    public String attack() {
        return "attack with " + damage() + " damage";
    }
}
