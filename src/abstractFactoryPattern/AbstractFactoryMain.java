package abstractFactoryPattern;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        DeliveryMan ikeaDeliveryMan = new DeliveryMan(new IkeaFurnitureFactory());
        DeliveryMan artDecoDeliveryMan = new DeliveryMan(new ArtDecoFurnitureFactory());

        Chair chair = ikeaDeliveryMan.deliverChair();
        Table table = artDecoDeliveryMan.deliverTable();

        chair.sitOn();
        table.setTable();
    }
}
