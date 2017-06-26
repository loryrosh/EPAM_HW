package EPAM.lesson170624.hw.prime;

import EPAM.lesson170624.SimpleUnit;

public class PrimeTest {
    public static void main(String[] args) {
        System.out.println(SimpleUnit.assertEquals(Prime.isPrime(7), true));
        System.out.println(SimpleUnit.assertEquals(Prime.isPrime(10), false));
        System.out.println(SimpleUnit.assertEquals(Prime.isPrime(3571), true));
        System.out.println(SimpleUnit.assertEquals(Prime.isPrime(123233636), false));

        System.out.println(SimpleUnit.assertNotEquals(Prime.isPrime(17), false));
        System.out.println(SimpleUnit.assertNotEquals(Prime.isPrime(200), true));
        System.out.println(SimpleUnit.assertNotEquals(Prime.isPrime(1459), false));

        System.out.println(SimpleUnit.assertEquals(Prime.isPrime(1), false));
        System.out.println(SimpleUnit.assertNotEquals(Prime.isPrime(0), true));
        System.out.println(SimpleUnit.assertEquals(Prime.isPrime(Integer.MAX_VALUE), true));
        System.out.println(SimpleUnit.assertEquals(Prime.isPrime(Integer.MIN_VALUE), false));
    }
}
