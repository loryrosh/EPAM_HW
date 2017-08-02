package EPAM.lesson170802.generics;

public class InterfaceAdoptionWithErasure {
    public static void main(String[] args) {
        Cleaning<String> c = new Cleaner<>();
        c.clean("line");
        //c.clean(1); // ошибка компиляции

        Cleaning c2 = c;
        c2.clean(1);

        c2 = new StringCleaner();
        c2.clean(1);
    }
}

interface Cleaning2 {
    void clean(Object t);
}

class StringCleaner2 implements Cleaning {
    @Override
    public void clean(Object t) {
        String s = (String) t;
        System.out.println("cleaning " + s);
    }
}

class Cleaner2 implements Cleaning {
    @Override
    public void clean(Object t) {
        System.out.println("cleaning " + t);
    }
}
