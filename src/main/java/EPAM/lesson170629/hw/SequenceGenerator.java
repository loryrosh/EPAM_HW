package EPAM.lesson170629.hw;

import java.util.Random;

public class SequenceGenerator {
    private static final byte[] ALPHA = {'A', 'C', 'G', 'T'};

    public static byte[] generate(int size) {
        byte[] seq = new byte[size];

        Random r = new Random();
        for (int i = 0; i < size; i++) {
            seq[i] = ALPHA[r.nextInt(ALPHA.length)];
        }
        return seq;
    }
}
