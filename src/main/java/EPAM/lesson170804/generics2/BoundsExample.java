package EPAM.lesson170804.generics2;

public class BoundsExample {
    public static void main(String[] args) {
        double result = min(4.8, 5.6);
        System.out.println(result);
        System.out.println(min(3, 5));
        System.out.println(min("Hello", "Halo"));
    }

    static <T extends Comparable<T>> T min(T a, T b) {
        return a.compareTo(b) < 0 ? a : b;
    }

    static Comparable min2(Comparable a, Comparable b) {
        return a.compareTo(b) < 0 ? a : b;
    }
}
