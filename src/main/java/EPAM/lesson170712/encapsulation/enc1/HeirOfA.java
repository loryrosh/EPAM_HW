package EPAM.lesson170712.encapsulation.enc1;

import EPAM.lesson170712.encapsulation.A;

public class HeirOfA extends A {
    public static void main(String[] args) {
        A a = new A();

        //a.i = 0; private - forbidden
        //a.j = 0; package - forbidden
        //a.k = 0; protected - forbidden????
        a.m = 0;

        HeirOfA heir = new HeirOfA();

        //heir.i = 0;
        //heir.j = 0;
        heir.k = 0; // РЕАЛЬНО используем только сам _экземпляр наследника_
        heir.m = 0;
    }
}
