package compositePattern;

public class Product implements Unpackable {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void unpack(String spaces) {
        System.out.println(spaces + " - " + name + ":\t" + price );
    }
}
