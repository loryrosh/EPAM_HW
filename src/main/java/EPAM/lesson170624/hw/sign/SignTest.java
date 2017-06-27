package EPAM.lesson170624.hw.sign;

import EPAM.mytestframework.Asserts;

public class SignTest {
    public static void main(String[] args){
        System.out.println(Asserts.assertEquals(Sign.sign(4), 1));
        System.out.println(Asserts.assertEquals(Sign.sign(-16), -1));

        System.out.println(Asserts.assertEquals(Sign.sign(0), 0));

        System.out.println(Asserts.assertEquals(Sign.sign(Integer.MAX_VALUE), 1));
        System.out.println(Asserts.assertEquals(Sign.sign(Integer.MIN_VALUE), -1));
    }
}
