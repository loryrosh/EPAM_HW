package EPAM.lesson170811;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BinarySearchExample {
    public static void main(String[] args) {
        List<A> list = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            list.add(new A());
        }

        System.out.println(list);

        A key = new A();
        System.out.println(key);
        int idx = Collections.binarySearch(list, key);
        System.out.println(idx); // не всегда верный результат - нужны сортировка

        Collections.sort(list);
        System.out.println(list);
        idx = Collections.binarySearch(list, key);
        System.out.println(idx);
    }
}
