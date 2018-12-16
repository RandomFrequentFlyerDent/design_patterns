package builderPattern;

public interface ConstructionBuilder {
    void reset();
    void setModel(String model);
    void setNumberOfWindows(int x);
    void setNumberOfDoors(int x);
    void setHasPool(boolean pool);
    void setHasCentralHeating(boolean centralHeating);
}
