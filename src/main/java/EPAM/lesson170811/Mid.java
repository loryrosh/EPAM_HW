package EPAM.lesson170811;

public class Mid {
    public static void main(String[] args) {
        int lo = 10; // low bound
        int hi = 30; // high bound

        int mid = (lo + hi) / 2; // неверно. lo и hi могут быть очень близко к Integer.MAX_VALUE
        int midRight = lo + (hi - lo) / 2;

        System.out.println(mid);
        System.out.println(midRight);

        lo = 2_000_000_000;
        hi = 2_000_000_010;
        // получим отрицательное число, если используем первый вариант вычисления mid

        mid = (lo + hi) / 2; // неверно. lo и hi могут быть очень близко к Integer.MAX_VALUE
        midRight = lo + (hi - lo) / 2;
        System.out.println(mid);
        System.out.println(midRight);
    }
}
