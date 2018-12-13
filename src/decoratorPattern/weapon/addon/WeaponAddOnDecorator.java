package decoratorPattern.weapon.addon;

import decoratorPattern.weapon.Weapon;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class WeaponAddOnDecorator extends Weapon {
    final String ADD_ON_DEFAULT_TEXT = "\tadd-ons:\n";

    public abstract int damage();

    public abstract double weight();

    public abstract String getDescription();

    public String formatDescription(String typeText, Weapon weapon) {
        String originalDescription = weapon.getDescription();
        originalDescription = updateDamageDescription(originalDescription);
        originalDescription = updateWeightDescription(originalDescription);
        StringBuilder description = new StringBuilder(originalDescription);
        if (originalDescription.contains(ADD_ON_DEFAULT_TEXT)) {
            description.append(typeText);
        } else {
            description.append(ADD_ON_DEFAULT_TEXT);
            description.append(typeText);
        }
        return description.toString();
    }

    private String updateDamageDescription(String originalDescription) {
        StringBuilder newDescription = new StringBuilder();
        Pattern pattern = Pattern.compile("^(.*damage: )\\d+(.*)$", Pattern.DOTALL);
        Matcher matcher = pattern.matcher(originalDescription);
        if (matcher.find()) {
            newDescription.append(matcher.group(1));
            newDescription.append(damage());
            newDescription.append(matcher.group(2));
        } else {
            newDescription.append(originalDescription);
        }
        return newDescription.toString();
    }

    private String updateWeightDescription(String originalDescription) {
        StringBuilder newDescription = new StringBuilder();
        Pattern pattern = Pattern.compile("^(.*weight: )\\d+\\.\\d+(.*)$", Pattern.DOTALL);
        Matcher matcher = pattern.matcher(originalDescription);
        if (matcher.find()) {
            newDescription.append(matcher.group(1));
            newDescription.append(weight());
            newDescription.append(matcher.group(2));
        } else {
            newDescription.append(originalDescription);
        }
        return newDescription.toString();
    }
}
