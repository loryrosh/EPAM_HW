package EPAM.lesson170809;

import java.math.BigDecimal;

public class OptimizeExample {
    public static void main(String[] args) {
        BigDecimal start = new BigDecimal(System.currentTimeMillis());
        for (long i = 0; i < 1000_000_000_000_000L; i++) {
            int x = 0;
        }
        System.out.println(start.subtract(new BigDecimal(System.currentTimeMillis())));
    }
}
