package abstractFactoryPattern;

public class DeliveryMan {
    private FurnitureFactory furnitureFactory;
    private Chair chair;
    private Table table;

    public DeliveryMan(FurnitureFactory furnitureFactory) {
        this.furnitureFactory = furnitureFactory;
    }

    public Chair deliverChair() {
        return furnitureFactory.createChair();
    }

    public Table deliverTable() {
        return furnitureFactory.createTable();
    }
}
