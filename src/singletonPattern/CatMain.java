package singletonPattern;

public class CatMain {

    public static void main(String[] args) {
        Cat cat = Cat.newInstance();
        cat.displayCalledTimes();
        Cat otherCat = Cat.newInstance();
        otherCat.displayCalledTimes();
    }
}
