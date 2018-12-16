package builderPattern;

public class House {
    private String model;
    private int numberOfWindows;
    private int numberOfDoors;
    private boolean pool;
    private boolean centralHeating;

    public House() {
        numberOfDoors = 0;
        numberOfWindows = 0;
        pool = false;
        centralHeating = false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("This " + model + " has\n\t");
        sb.append(String.format("%d door(s)\n\t%d window(s)", numberOfDoors, numberOfWindows));
        if (pool) {
            sb.append("\n\ta pool");
        }
        if (centralHeating) {
            sb.append("\n\tcentral heating");
        }
        sb.append("\n");
        return sb.toString();
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void setPool(boolean pool) {
        this.pool = pool;
    }

    public void setCentralHeating(boolean centralHeating) {
        this.centralHeating = centralHeating;
    }
}
