package EPAM.lesson170627.theory.creation;

public class Z {

    // расположены в порядке отрабатывания

    // static-и будут отрабатывать только при _первом_ обращении к классу
    static int s = 99;

    // статический блок инициализации класса
    static {
        System.out.println("Static block");

    }


    long timestamp = System.currentTimeMillis();

    // блок инициализации экземпляров
    {
        System.out.println("init");
    }

    // конструктор
    Z() {
        System.out.println("constructor");
    }
}
