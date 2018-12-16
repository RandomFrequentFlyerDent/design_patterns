package decoratorPattern.weapon.addon;

import decoratorPattern.weapon.Weapon;

public abstract class WeaponAddOnDecorator implements Weapon {
    private Weapon weapon;

    public WeaponAddOnDecorator(Weapon weapon) {
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }
}
