package EPAM.lesson170629.theory.varscope;

public class VariableScope {
    // создается в куче при первом обращении к классу и существует до момента выгрузки класса ClassLoader-ом
    static int x = 0;

    static class A {
        // находится в куче до тех пор, пока жив экземпляр класса SuperSuperExample
        int x;
    }

    public static void main(String[] args) {
        A a = new A();

        m();
    }

    private static void m() {
        // существует в пределах метода
        int x = 0; // произошел hiding
        // (мы сейчас работаем с локальной переменной, а не статическим полем x класса VariableScope)

        if (x > 0) {
            // существует только внутри цикла
            int y = 10;
            // int x = 20; ERROR!
        }
    }
}
