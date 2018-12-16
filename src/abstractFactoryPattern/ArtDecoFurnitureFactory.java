package abstractFactoryPattern;

public class ArtDecoFurnitureFactory implements FurnitureFactory {

    @Override
    public Table createTable() {
        return new ArtDecoTable();
    }

    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }
}
