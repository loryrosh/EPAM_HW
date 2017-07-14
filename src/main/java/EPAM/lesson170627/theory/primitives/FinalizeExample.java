package EPAM.lesson170627.theory.primitives;

import java.util.LinkedList;
import java.util.List;

public class FinalizeExample {
    static List<A> storage = new LinkedList<>();

    static class A {
        @Override
        protected void finalize() throws Exception {
            System.out.println("Dying...");

            // можно взять ссылку на уничтожаемый объект с помошью this и где-то ее сохранить
            // объект "останется жить", и его GC уже никогда не попытается уничтожить
            // this.
        }
    }

    public static void main(String[] args) {
        /*while (true) {
            new SuperSuperExample();
        }*/

        while (true) {
            storage.add(new A());
        }

        //new SuperSuperExample();
    }
}
