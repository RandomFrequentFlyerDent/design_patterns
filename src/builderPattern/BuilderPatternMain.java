package builderPattern;

public class BuilderPatternMain {
    public static void main(String[] args) {
        ConstructionWorker constructionWorker = new ConstructionWorker();
        HouseBuilder plans = new HouseBuilder();
        constructionWorker.setPlans(plans);
        constructionWorker.buildMansion();
        printHouse(plans);

        plans.reset();
        constructionWorker.buildShack();
        printHouse(plans);

        plans.reset();
        constructionWorker.buildStandardHouse();
        printHouse(plans);
    }

    private static void printHouse(HouseBuilder plans) {
        System.out.println(plans.getHouse());
    }
}
