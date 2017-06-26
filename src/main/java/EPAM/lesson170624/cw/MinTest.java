package EPAM.lesson170624.cw;

import EPAM.lesson170624.SimpleUnit;

public class MinTest {
    public static void main(String[] args){
        System.out.println(SimpleUnit.assertEquals(MathUtils.min(10, 20), 10));
        System.out.println(SimpleUnit.assertEquals(MathUtils.min(100, 30), 30));
        System.out.println(SimpleUnit.assertEquals(MathUtils.min(30, 100), 30));
        System.out.println(SimpleUnit.assertEquals(MathUtils.min(30, 30), 30));

        System.out.println(SimpleUnit.assertEquals(MathUtils.min(
                0, Integer.MAX_VALUE), 0));
        System.out.println(SimpleUnit.assertEquals(MathUtils.min(
                Integer.MAX_VALUE, 0), 0));
        System.out.println(SimpleUnit.assertEquals(MathUtils.min(
                Integer.MIN_VALUE, Integer.MAX_VALUE), Integer.MIN_VALUE));

        System.out.println(SimpleUnit.assertNotEquals(MathUtils.min(30, 10), 30));
        System.out.println(SimpleUnit.assertNotEquals(MathUtils.min(30, 30), 10));
        System.out.println(SimpleUnit.assertNotEquals(MathUtils.min(
                Integer.MIN_VALUE, Integer.MAX_VALUE), Integer.MAX_VALUE));
    }
}
