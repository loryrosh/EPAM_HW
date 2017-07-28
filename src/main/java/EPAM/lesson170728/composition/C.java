package EPAM.lesson170728.composition;

public class C {
    public static void main(String[] args) {
        A a = new B();

        a.change();
        a.change();
    }
}
