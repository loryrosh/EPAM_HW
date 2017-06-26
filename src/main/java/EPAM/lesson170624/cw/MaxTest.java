package EPAM.lesson170624.cw;

import EPAM.lesson170624.SimpleUnit;

public class MaxTest {
    public static void main(String[] args){
        System.out.println(SimpleUnit.assertEquals(MathUtils.max(10, 20), 20));
        System.out.println(SimpleUnit.assertEquals(MathUtils.max(1, 30), 30));
        System.out.println(SimpleUnit.assertEquals(MathUtils.max(10, 10), 10));

        System.out.println(SimpleUnit.assertEquals(MathUtils.max(
                Integer.MAX_VALUE, 0), Integer.MAX_VALUE));
        System.out.println(SimpleUnit.assertEquals(MathUtils.max(
                Integer.MAX_VALUE, Integer.MIN_VALUE), Integer.MAX_VALUE));

        System.out.println(SimpleUnit.assertNotEquals(MathUtils.max(30, 10), 10));
        System.out.println(SimpleUnit.assertNotEquals(MathUtils.max(0, 10), 0));
        System.out.println(SimpleUnit.assertNotEquals(MathUtils.max(10, 10), 0));
    }
}
