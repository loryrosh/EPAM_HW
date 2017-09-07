package EPAM.lesson170907;

import java.math.BigDecimal;

public class Fib {
    private static int MAX = 2000;
    static BigDecimal[] fib = new BigDecimal[MAX];

    public static void main(String[] args) {
        System.out.println("start");

        long start = System.currentTimeMillis();
        System.out.println(fib1(1090));
        System.out.println(System.currentTimeMillis() - start);
    }

    public static long fib(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        }

        if (n <= 2) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }

    // используем меморизацию - запоминание промежуточного результата
    public static BigDecimal fib1(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        }

        if (n <= 2) {
            return new BigDecimal(1);
        }

        if (fib[n] == null) {
            fib[n] = fib1(n - 1).add(fib1(n - 2));
        }

        return fib[n];
    }
}
