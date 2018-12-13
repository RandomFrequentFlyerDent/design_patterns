package compositePattern;

public class CompositeMain {
    public static void main(String[] args){
        Box mainBox = new Box();
        Box secondBox = new Box();
        Box thirdBox = new Box();
        Box fourthBox = new Box();
        Product hammer = new Product("hammer", 12.75);
        Product charger = new Product("charger", 5.35);
        Product bucket = new Product("bucket", 2.00);
        Product lawnmower = new Product("lawnmower", 120.00);
        Product spade = new Product("spade", 7.40);

        fourthBox.add(lawnmower);
        thirdBox.add(charger);
        thirdBox.add(hammer);
        secondBox.add(bucket);
        secondBox.add(spade);
        secondBox.add(thirdBox);
        mainBox.add(secondBox);
        mainBox.add(fourthBox);

        mainBox.unpack("");

    }
}
