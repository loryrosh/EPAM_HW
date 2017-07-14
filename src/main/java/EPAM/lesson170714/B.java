package EPAM.lesson170714;

public class B {
    public static void main(String[] args) {
        // SuperSuperExample.m1(); non-static - нужен экземпляр класса

        A a = new A();
        //a.m1(); private
        a.m2();
        a.m3();
        a.m4();
    }
}
