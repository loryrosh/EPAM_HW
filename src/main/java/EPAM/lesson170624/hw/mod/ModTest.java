package EPAM.lesson170624.hw.mod;

import EPAM.lesson170624.SimpleUnit;

public class ModTest {
    public static void main(String[] args) {
        System.out.println(SimpleUnit.assertEquals(Mod.mod(10, 5), 0));
        System.out.println(SimpleUnit.assertEquals(Mod.mod(20, 7), 6));
        System.out.println(SimpleUnit.assertEquals(Mod.mod(11, 5), 1));

        System.out.println(SimpleUnit.assertEquals(Mod.mod(5, 11), 5));
        System.out.println(SimpleUnit.assertEquals(Mod.mod(11, 11), 0));

        System.out.println(SimpleUnit.assertEquals(Mod.mod(Integer.MAX_VALUE, Integer.MAX_VALUE), 0));
        System.out.println(SimpleUnit.assertEquals(Mod.mod(Integer.MIN_VALUE, Integer.MIN_VALUE), 0));

        System.out.println(SimpleUnit.assertEquals(Mod.mod(Integer.MAX_VALUE, 11), 1));
        System.out.println(SimpleUnit.assertEquals(Mod.mod(2, Integer.MAX_VALUE), 2));

        System.out.println(SimpleUnit.assertEquals(Mod.mod(Integer.MIN_VALUE, 11), -2));
        System.out.println(SimpleUnit.assertEquals(Mod.mod(Integer.MIN_VALUE, 110), -68));
        System.out.println(SimpleUnit.assertEquals(Mod.mod(2, Integer.MIN_VALUE), 2));

        System.out.println(SimpleUnit.assertEquals(Mod.mod(0, 5), 0));
        try{
            System.out.println(SimpleUnit.assertEquals(Mod.mod(5, 0), 0));
        } catch(ArithmeticException ae){
            System.out.println(SimpleUnit.assertHasException(ae));
        }
    }
}
