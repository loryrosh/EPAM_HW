package EPAM.lesson170629.hw;

import java.util.Random;

public class SequenceGenerator {
    private static final byte[] ALPHA = {'A', 'C', 'G', 'T'};
    private static byte[] seq = null;

    private static long startTime = System.currentTimeMillis();

    public static byte[] generate(int size) {
        seq = new byte[size];

        Random r = new Random();
        for (int i = 0; i < size; i++) {
            seq[i] = ALPHA[r.nextInt(ALPHA.length)];
        }
        return seq;
    }

    public static void printOut() {
        if (seq == null)
            return;

        for (byte b : seq) {
            System.out.print((char) b + " ");
        }
        System.out.println();
    }

    public static long calcTime() {
        return System.currentTimeMillis() - startTime;
    }
}
