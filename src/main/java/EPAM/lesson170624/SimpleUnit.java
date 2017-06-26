package EPAM.lesson170624;

public class SimpleUnit {
    public static boolean assertEquals(String actual, String expected){
        // сравниваем ССЫЛКИ (адреса в памяти) для двух объектов
        // return actual == expected;

        // сравниваем СОДЕРЖИМОЕ двух объектов
        boolean equals = actual.equals(expected);
        if(!equals){
            System.err.println("Test failed: expected -->" + expected + "<--, but actual was -->" + actual + "<--");
        }
        return equals;
    }

    public static boolean assertNotEquals(String actual, String expected){
        boolean notEquals = !actual.equals(expected);
        if(!notEquals){
            System.err.println("Test failed: expected NOT -->" + expected + "<--, but actual was -->" + actual + "<--");
        }
        return notEquals;
    }

    public static boolean assertEquals(int actual, int expected) {
        boolean equals = (actual == expected);
        if(!equals){
            System.err.println("Test failed: expected -->" + expected + "<--, but actual was -->" + actual + "<--");
        }
        return equals;
    }
    
    public static boolean assertNotEquals(int actual, int expected) {
        boolean notEquals = (actual != expected);
        if(!notEquals){
            System.err.println("Test failed: expected NOT -->" + expected + "<--, but actual was -->" + actual + "<--");
        }
        return notEquals;
    }

    public static boolean assertEquals(boolean actual, boolean expected) {
        boolean equals = (actual == expected);
        if(!equals){
            System.err.println("Test failed: expected -->" + expected + "<--, but actual was -->" + actual + "<--");
        }
        return equals;
    }

    public static boolean assertNotEquals(boolean actual, boolean expected) {
        boolean notEquals = (actual != expected);
        if(!notEquals){
            System.err.println("Test failed: expected NOT -->" + expected + "<--, but actual was -->" + actual + "<--");
        }
        return notEquals;
    }

    public static boolean assertHasException(Exception ae) {
        boolean hasException = (ae != null);
        if(!hasException) {
            System.out.println("Test failed: exception not thrown");
        }
        return hasException;
    }
}
