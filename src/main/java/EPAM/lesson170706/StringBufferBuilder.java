package EPAM.lesson170706;

public class StringBufferBuilder {
    public static void main(String[] args) {
        int[] a = new int[100000];

        long start = System.currentTimeMillis();
        String s = toString(a);
        long stop = System.currentTimeMillis();
        System.out.println(stop - start);

        start = System.currentTimeMillis();
        s = toString2(a);
        stop = System.currentTimeMillis();

        System.out.println(stop - start);
    }

    private static String toString(int[] a) {
        String r = "[";

        if (a.length > 0) {
            r += a[0];
            for (int i = 0; i < a.length; i++) {
                r += "," + a[i];
            }
        }

        r += "]";
        return r;
    }

    private static String toString2(int[] a) {
        StringBuilder str = new StringBuilder('[');

        if (a.length > 0) {
            str.append(a[0]);
            for (int i = 0; i < a.length; i++) {
                str.append(",").append(a[i]); // chain call (append возвращает ссылку на StringBuffer)
            }
        }
        str.append(']');
        return str.toString();
    }
}
