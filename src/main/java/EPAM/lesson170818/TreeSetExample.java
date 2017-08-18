package EPAM.lesson170818;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {
    private static final int MAX = 100;

    public static void main(String[] args) {
        Random r = new Random();

        // эффективный поиск с помощью красно-черных деревьев
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < MAX; i++) {
            set.add(r.nextInt(MAX));
        }

        // от первого узла только направо и от последнего узла только налево
        SortedSet<Integer> subSet = set.subSet(20, 30);
        System.out.println(subSet);

        Integer ceiling = set.ceiling(50);
        System.out.println(ceiling);

        // все, что лежит до 40
        System.out.println(set.headSet(40));

        // все, что лежит после 80
        System.out.println(set.tailSet(80));
    }
}
