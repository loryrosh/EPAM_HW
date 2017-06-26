package EPAM.lesson170624.hw.fib;

import EPAM.lesson170624.SimpleUnit;

public class FibTest {
    public static void main(String[] args) {
        System.out.println(SimpleUnit.assertEquals(Fib.isFibonacci(1), true));
        System.out.println(SimpleUnit.assertEquals(Fib.isFibonacci(5), true));
        System.out.println(SimpleUnit.assertEquals(Fib.isFibonacci(-56), false));
        System.out.println(SimpleUnit.assertEquals(Fib.isFibonacci(17711), true));

        System.out.println(SimpleUnit.assertNotEquals(Fib.isFibonacci(50), true));
        System.out.println(SimpleUnit.assertNotEquals(Fib.isFibonacci(832041), true));

        System.out.println(SimpleUnit.assertEquals(Fib.isFibonacci(Integer.MIN_VALUE), false));
        System.out.println(SimpleUnit.assertEquals(Fib.isFibonacci(Integer.MIN_VALUE), false));
    }
}
