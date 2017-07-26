package EPAM.lesson170726.interfaces;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorEx {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one", "two", "three");

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Iterator<String> iterator = new Iterator<String>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public String next() {
                return "hello";
            }
        };

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
