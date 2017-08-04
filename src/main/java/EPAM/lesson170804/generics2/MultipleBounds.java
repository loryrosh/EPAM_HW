package EPAM.lesson170804.generics2;

public class MultipleBounds {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        process(a);
        process(b);
    }

    // подходит любой объект, который реализует оба интерфейса (X, Y),
    // и можно использовать методы обоих интерфейсов
    private static <T extends X & Y> void process(T thing) {
        thing.x();
        thing.y();
    }
}

interface X {
    void x();
}

interface Y {
    void y();
}

class A implements X, Y {
    @Override
    public void x() {

    }

    @Override
    public void y() {

    }
}

class B implements X, Y {
    @Override
    public void x() {

    }

    @Override
    public void y() {

    }
}
