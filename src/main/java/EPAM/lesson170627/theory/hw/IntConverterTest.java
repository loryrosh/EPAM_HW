package EPAM.lesson170627.theory.hw;

import EPAM.mytestframework.Asserts;

public class IntConverterTest {
    public static void main(String[] args) {
        // Binary
        System.out.println(Asserts.assertEquals(IntConverter.toBinaryString(1), Integer.toBinaryString(1)));
        System.out.println(Asserts.assertEquals(IntConverter.toBinaryString(2), Integer.toBinaryString(2)));
        System.out.println(Asserts.assertEquals(IntConverter.toBinaryString(5), Integer.toBinaryString(5)));
        System.out.println(Asserts.assertEquals(IntConverter.toBinaryString(100), Integer.toBinaryString(100)));
        System.out.println(Asserts.assertNotEquals(IntConverter.toBinaryString(100), Integer.toBinaryString(107)));
        System.out.println(Asserts.assertEquals(IntConverter.toBinaryString(0), Integer.toBinaryString(0)));
        System.out.println(Asserts.assertEquals(IntConverter.toBinaryString(78), Integer.toBinaryString(78)));
        System.out.println(Asserts.assertEquals(IntConverter.toBinaryString(Integer.MAX_VALUE), Integer
                .toBinaryString(Integer.MAX_VALUE)));

        System.out.println(Asserts.assertEquals(IntConverter.toBinaryString(-5), Integer.toBinaryString(-5)));
        System.out.println(Asserts.assertEquals(IntConverter.toBinaryString(-78), Integer.toBinaryString(-78)));
        System.out.println(Asserts.assertEquals(IntConverter.toBinaryString(Integer.MIN_VALUE), Integer
                .toBinaryString(Integer.MIN_VALUE)));


        // Octal
        System.out.println(Asserts.assertEquals(IntConverter.toOctalString(2), Integer.toOctalString(2)));
        System.out.println(Asserts.assertEquals(IntConverter.toOctalString(10), Integer.toOctalString(10)));
        System.out.println(Asserts.assertEquals(IntConverter.toOctalString(16), Integer.toOctalString(16)));
        System.out.println(Asserts.assertEquals(IntConverter.toOctalString(100), Integer.toOctalString(100)));
        System.out.println(Asserts.assertEquals(IntConverter.toOctalString(1012320), Integer.toOctalString(1012320)));
        System.out.println(Asserts.assertEquals(IntConverter.toOctalString(0), Integer.toOctalString(0)));
        System.out.println(Asserts.assertEquals(IntConverter.toOctalString(Integer.MAX_VALUE), Integer.toOctalString
                (Integer.MAX_VALUE)));

        System.out.println(Asserts.assertEquals(IntConverter.toOctalString(Integer.MIN_VALUE), Integer.toOctalString
                (Integer.MIN_VALUE)));
        System.out.println(Asserts.assertEquals(IntConverter.toOctalString(-78), Integer.toOctalString(-78)));
        System.out.println(Asserts.assertNotEquals(IntConverter.toOctalString(-78), Integer.toOctalString(-98)));


        // Hex
        System.out.println(Asserts.assertEquals(IntConverter.toHexString(2104), Integer.toHexString(2104)));
        System.out.println(Asserts.assertEquals(IntConverter.toHexString(21), Integer.toHexString(21)));
        System.out.println(Asserts.assertEquals(IntConverter.toHexString(100), Integer.toHexString(100)));
        System.out.println(Asserts.assertEquals(IntConverter.toHexString(0), Integer.toHexString(0)));
        System.out.println(Asserts.assertEquals(IntConverter.toHexString(Integer.MAX_VALUE), Integer.toHexString
                (Integer.MAX_VALUE)));

        System.out.println(Asserts.assertEquals(IntConverter.toHexString(Integer.MIN_VALUE), Integer.toHexString
                (Integer.MIN_VALUE)));
        System.out.println(Asserts.assertEquals(IntConverter.toHexString(-78), Integer.toHexString(-78)));
        System.out.println(Asserts.assertNotEquals(IntConverter.toHexString(-78), Integer.toHexString(-68)));
    }
}
