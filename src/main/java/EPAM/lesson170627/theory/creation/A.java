package EPAM.lesson170627.theory.creation;

public class A {
    int i;
    long timestamp;

    {
        System.out.println("init");
    }

    public A() {
        super();
        System.out.println("constructor A");
        i = 10;
        timestamp = System.currentTimeMillis();
    }

    {
        System.out.println("init - 2");
    }
}
