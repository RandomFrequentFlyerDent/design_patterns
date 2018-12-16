package builderPattern;

public class HouseBuilder implements ConstructionBuilder {
    private House house;

    public HouseBuilder() {
        reset();
    }

    public House getHouse() {
        return house;
    }


    @Override
    public void reset() {
        this.house = new House();
    }

    @Override
    public void setModel(String model) {
        house.setModel(model);
    }

    @Override
    public void setNumberOfWindows(int x) {
        house.setNumberOfWindows(x);
    }

    @Override
    public void setNumberOfDoors(int x) {
        house.setNumberOfDoors(x);
    }

    @Override
    public void setHasPool(boolean pool) {
        house.setPool(pool);
    }

    @Override
    public void setHasCentralHeating(boolean centralHeating) {
        house.setCentralHeating(centralHeating);
    }
}
