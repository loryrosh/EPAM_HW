package EPAM.lesson170714.enc3;

import EPAM.lesson170714.A;

public class HeirOfA extends A {
    @Override
    protected void m3() {
        super.m3();
    }

    @Override
    public void m4() {
        super.m4();
    }

    public static void main(String[] args) {
        A a = new A();

        //a.m1();
        //a.m2();
        //a.m3();
        a.m4();

        HeirOfA heir = new HeirOfA();

        //heir.m1();
        //heir.m2();
        heir.m3(); // protected-метод доступен
        heir.m4();


    }
}
