package singletonPattern;

public class Cat {
    private static Cat instance = null;
    private static int counter = 0;

    private Cat() {
    }

    public static Cat newInstance() {
        if (instance == null) {
            synchronized (Cat.class) {
                if (instance == null) {
                    instance = new Cat();
                }
            }
        }
        counter++;
        return instance;
    }

    public void displayCalledTimes() {
        System.out.println("Called " + counter + " times!");
    }
}
