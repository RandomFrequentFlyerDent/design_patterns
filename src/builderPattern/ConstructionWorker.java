package builderPattern;

public class ConstructionWorker {
    private ConstructionBuilder plans;

    public void setPlans(ConstructionBuilder plans) {
        this.plans = plans;
    }

    public void buildStandardHouse() {
        plans.setModel("house");
        plans.setNumberOfDoors(2);
        plans.setNumberOfWindows(6);
        plans.setHasCentralHeating(true);
    }

    public void buildShack() {
        plans.setModel("shack");
        plans.setNumberOfDoors(1);
    }

    public void buildMansion() {
        plans.setModel("mansion");
        plans.setNumberOfDoors(5);
        plans.setNumberOfWindows(16);
        plans.setHasPool(true);
        plans.setHasCentralHeating(true);
    }
}
