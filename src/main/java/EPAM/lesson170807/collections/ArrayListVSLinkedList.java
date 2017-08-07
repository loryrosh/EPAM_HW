package EPAM.lesson170807.collections;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ArrayListVSLinkedList {
    private static final int MAX = 10000000;
    static Random r = new Random();

    public static void main(String[] args) {
        List<Integer> arrayBased = new ArrayList<>();
        List<Integer> linkBased = new LinkedList<>();

        testFill(arrayBased);
        testFill(linkBased);

        arrayBased.clear();
        linkBased.clear();

        testFillByInsertion(arrayBased);
        testFillByInsertion(linkBased);
    }

    private static void testFill(List<Integer> arr) {
        BigDecimal timing = new BigDecimal(System.currentTimeMillis());
        fill(arr);
        System.out.println(new BigDecimal(System.currentTimeMillis()).subtract(timing));
    }

    private static void testFillByInsertion(List<Integer> arr) {
        BigDecimal timing = new BigDecimal(System.currentTimeMillis());
        fill(arr);
        System.out.println(new BigDecimal(System.currentTimeMillis()).subtract(timing));
    }

    private static void fill(List<Integer> arr) {
        for (int i = 0; i < MAX; i++) {
            arr.add(r.nextInt());
        }
    }

    private static void fillByInsertion(List<Integer> arr) {
        for (int i = 0; i < MAX; i++) {
            arr.add(0, r.nextInt());
        }
    }
}
