package EPAM.lesson170624.theory_classes;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();

        // каждый класс - это объект Class (Reflections)
        System.out.println(ArrayList.class.getName());
        System.out.println(ArrayList.class.getSimpleName());
        System.out.println(ArrayList.class.getPackage().getName());
    }
}
