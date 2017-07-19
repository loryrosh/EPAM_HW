package EPAM.lesson170719.interfaces1;

public class Use {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        X x;
        Y y;
        Z z;

        z = c;
        y = b;
        y = c;
        x = a;
        x = b;
        x = c;
    }
}
