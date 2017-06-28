package EPAM.lesson170627.theory.primitives;

public class PrimitiveTypes {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);

        long l = 21474836470l;
        System.out.println(l);

        int x = 0xff; //16
        int o = 077; // 8
        int b = 0b11; //2

        char c = 100;
        System.out.println(c);
        System.out.println((char) 65);
        System.out.println((char) 32);
        System.out.println((int) 'A');

        long l2 = 100;

        // приведение типа нельзя провести, так может быть потеря информации
        //int i2 = l2;
        // нужно сделать явное приведение типа
        int i2 = (int) l2;

        double d = 10;
        int t = (int) d;

        x = 15;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toHexString(x));
        System.out.println(Integer.toOctalString(x));
    }
}
