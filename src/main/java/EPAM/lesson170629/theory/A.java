package EPAM.lesson170629.theory;

public class A {
    static final int MAX = 10;

    // class field (поле класса)
    static String s = init();

    // instance field (поле экземпляра)
    int x;

    public static String init() {
        System.out.println("init");
        return "Hello";
    }

    static {
        System.out.println("init2");
    }
}
