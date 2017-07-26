package EPAM.lesson170726.interfaces.clean;

public class Furniture implements Cleanable {
    @Override
    public void takeApart() {

    }

    @Override
    public void combine() {

    }
}

interface Cleanable {
    default void clean() { // дефолтная реализация
        takeApart();
        System.out.println("cleaning parts");
        combine();
    }

    // а эти 2 метода уже будут реализовывать конкретные классы
    void takeApart();

    void combine();
}

class Table extends Furniture {

}

class Chair extends Furniture {

}
