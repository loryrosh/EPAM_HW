package EPAM.lesson170907;

import java.util.stream.IntStream;

public class Recursion {
    public static void main(String[] args) {

        // напечатать 10 чисел от 1 до 10
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        IntStream.range(1, 10).forEach(System.out::print);
        System.out.println("");

        print(1, 10);
        printFrom1To(10);
        printFromITo1(10);
    }

    private static void printFromITo1(int i) {
        if (i < 1) {
            return;
        }
        System.out.println(i);
        printFrom1To(i - 1);
    }

    private static void printFrom1To(int i) {
        if (i < 1) {
            return;
        }
        printFrom1To(i - 1);
        System.out.println(i);
    }

    private static void print(int start, int end) {
        if (start > end) {
            return;
        }

        System.out.println(start);
        print(start + 1, end);
    }
}
