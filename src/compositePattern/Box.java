package compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Box implements Unpackable {
    private static int numberOfBoxes = 0;
    private int boxNumber;
    private List<Unpackable> contents;

    public Box() {
        contents = new ArrayList<>();
        numberOfBoxes++;
        this.boxNumber = numberOfBoxes;
    }

    public void add(Unpackable unpackable) {
        contents.add(unpackable);
    }

    private double getTotal() {
        double total = 0.00;
        for (Unpackable unpackable : contents) {
            if (unpackable instanceof Product) {
                total = total + ((Product) unpackable).getPrice();
            } else if (unpackable instanceof Box) {
                total = total + ((Box) unpackable).getTotal();
            }
        }
        return total;
    }

    @Override
    public void unpack(String spaces) {
        System.out.println(spaces + "Box #" + boxNumber + "\t" + getTotal());
        spaces = spaces + "  ";
        for (Unpackable unpackable : contents) {
            unpackable.unpack(spaces);
        }
    }
}
