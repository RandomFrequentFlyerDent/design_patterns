package decoratorPattern.weapon.addon;

import decoratorPattern.weapon.Weapon;

public class EnforcedHandle extends WeaponAddOnDecorator {

    public EnforcedHandle(Weapon weapon) {
        super(weapon);
    }

    @Override
    public int damage() {
        return getWeapon().damage() + 2;
    }

    @Override
    public String attack() {
        return "attack with " + damage() + " damage";
    }
}
