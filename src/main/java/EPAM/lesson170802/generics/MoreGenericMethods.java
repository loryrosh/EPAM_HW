package EPAM.lesson170802.generics;

public class MoreGenericMethods {
    public static void main(String[] args) {
        Example.staticMethod("one");
        Example.staticMethod(1);
        Example.staticMethod(new Object());

        Example<String> ex = new Example<>();
        Example<String> ex2 = new Example<>();
        ex.instanceMethod("one");
        ex.instanceMethod(1); // приоритет у типа метода
        ex.instanceMethod(MoreGenericMethods.class); // объект, описывающий класс MoreGenericMethods (типа Class)

        Example.staticMethod(ex);
        Example.staticMethod(ex2);
    }
}

class Example<T> {
    // static T x; // параметр можно ипользовать только для экземпляров класса

    public static <M> void staticMethod(M m) {
        System.out.println(m);
    }

    public <N> void instanceMethod(N n) {
        System.out.println(n);
    }
}
