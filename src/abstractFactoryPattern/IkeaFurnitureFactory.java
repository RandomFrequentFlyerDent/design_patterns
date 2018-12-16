package abstractFactoryPattern;

public class IkeaFurnitureFactory implements FurnitureFactory {

    @Override
    public Table createTable() {
        return new IkeaTable();
    }

    @Override
    public Chair createChair() {
        return new IkeaChair();
    }
}
