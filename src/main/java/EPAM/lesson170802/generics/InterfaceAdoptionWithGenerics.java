package EPAM.lesson170802.generics;

public class InterfaceAdoptionWithGenerics {
    public static void main(String[] args) {
        Q q = new Q();
        q.makeSomethingTo("one");

        Z z = new Z();
        z.makeSomethingTo(new D());
    }
}

class D {
}

class E {
}

class Z implements Makeable<D> {
    @Override
    public void makeSomethingTo(D a) {

    }
}

// классы реализуют единый интерфейс Makeable, но каждый в отношении объектов своего собственного типа (E и String)
class W implements Makeable<E> {
    @Override
    public void makeSomethingTo(E a) {

    }
}

class Q implements Makeable<String> {
    @Override
    public void makeSomethingTo(String a) {

    }
}

interface Makeable<T> {
    void makeSomethingTo(T a);
}
