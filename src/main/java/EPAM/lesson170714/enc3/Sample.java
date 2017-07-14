package EPAM.lesson170714.enc3;

import EPAM.lesson170714.enc4.A;
import EPAM.lesson170714.enc4.B;
import EPAM.lesson170714.enc4.C;

public class Sample {
    public static void main(String[] args) {
        Class<A> c = A.class;

        C cl = new C();
        cl.m();

        A a;
        a = new A(); // расширение типа, восходящее преобразование - не вызывает проблем
        a = new C(); // сужение функционала
        a = new B();

        int x = (int) 10.56; // приведение типов
        double d = 10;
        x = (int) d;

        Object o = new A();
        a = (A) o; // нисходящее преобразование - вызывает проблемы
        
    }
}
