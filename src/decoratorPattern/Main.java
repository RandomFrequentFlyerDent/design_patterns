package decoratorPattern;

import decoratorPattern.weapon.Gun;
import decoratorPattern.weapon.Sword;
import decoratorPattern.weapon.Weapon;
import decoratorPattern.weapon.addon.EnforcedHandle;
import decoratorPattern.weapon.addon.LargeClip;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        Weapon gun = new Gun();
        Weapon sword = new Sword();
        gun = new EnforcedHandle(gun);
        gun = new LargeClip(gun);
        List<Weapon> weapons = Stream.of(gun, sword).collect(Collectors.toList());
        weapons.forEach(weapon -> System.out.println(weapon.getDescription()));
    }
}
