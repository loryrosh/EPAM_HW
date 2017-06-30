package EPAM.lesson170629.theory.classtructure;

public class A {
    // class ini
    static final int MAX = 10;
    static final String WORD = "Hello";

    static int instanceCounter = 0;

    static {
    }

    public static int compare(A first, A second) {
        return first.x - second.x;
    }

    // instance ini
    int x = 0;
    int y = 0;

    {
        instanceCounter++;
    }

    public A() {

    }

    public void move(int shiftX, int shiftY) {
        x += shiftX;
        y += shiftY;
    }

    public int compare(A other) {
        return compare(this, other);
    }

    public void say() {
        System.out.println("hello");
    }
}
