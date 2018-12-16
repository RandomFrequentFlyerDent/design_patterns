package decoratorPattern;

import decoratorPattern.weapon.Gun;
import decoratorPattern.weapon.Weapon;
import decoratorPattern.weapon.addon.EnforcedHandle;
import decoratorPattern.weapon.addon.LargeClip;

public class Main {
    public static void main(String[] args){
        Weapon gun = new Gun();
        System.out.println(gun.attack());
        gun = new EnforcedHandle(gun);
        System.out.println(gun.attack());
        gun = new LargeClip(gun);
        System.out.println(gun.attack());
    }
}
