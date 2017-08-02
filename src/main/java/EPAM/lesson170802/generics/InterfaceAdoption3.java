package EPAM.lesson170802.generics;

interface Cleaning<T> {
    void clean(T t);
}

public class InterfaceAdoption3 {
    public static void main(String[] args) {
        Cleaning<String> c = new Cleaner<>();
        c.clean("line");
        //c.clean(1); // ошибка компиляции

        Cleaning c2 = c;
        c2.clean(1);

        c2 = new StringCleaner();
        c2.clean(1);

        Cleaning<Integer> ci = new Cleaner<Integer>();
        c = (Cleaning) ci;
    }
}

class StringCleaner implements Cleaning<String> {
    @Override
    public void clean(String t) {
        System.out.println("cleaning " + t);
    }
}

class Cleaner<T> implements Cleaning<T> {
    @Override
    public void clean(T t) {
        System.out.println("cleaning " + t);
    }
}
