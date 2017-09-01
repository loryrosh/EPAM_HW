package EPAM.lesson170901.reflection;

import EPAM.lesson170828.concurrency.Utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionExamples {
    static {
        System.out.println("static init");
    }

    public static void main(String[] args) {
        System.out.println("start");
        Utils.pause(3000);
        System.out.println("reflection");

        Class<Sample> clazz = Sample.class;

        // список ПУБЛИЧНЫХ конструкторов класса
        for (Constructor<?> con : clazz.getConstructors()) {
            System.out.println(con);
        }

        // список всех конструкторов класса
        for (Constructor<?> con : clazz.getDeclaredConstructors()) {
            System.out.println(con);
        }

        // обращение к константе - это еще не "обращение к классу"
        System.out.println(Sample.MAX);

        // а вот теперь обращаемся к полю, которое может меняться
        System.out.println(Sample.MIN);

        // список ПУБЛИЧНЫХ методов класса + унаследованные
        for (Method method : clazz.getMethods()) {
            System.out.println(method);
        }
        System.out.println("__________");

        // список всех методов класса
        for (Method method : clazz.getDeclaredMethods()) {
            System.out.println(method);
        }

        try {
            Sample sample = clazz.newInstance();

            // просим найти указанный метод без параметров
            Method met = clazz.getMethod("bigChange", null);
            met.invoke(sample, null);
        } catch (InstantiationException | IllegalAccessException
                | NoSuchMethodException | IllegalArgumentException
                | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}

class Sample {
    static final int MAX = 10;
    static int MIN = 1;

    static {
        System.out.println("static sample init");
    }

    void change() {
    }

    public void bigChange() {
        System.out.println("very big change");
    }

    private void privateChange() {
    }
}
