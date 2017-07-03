package EPAM.lesson170629.hw;

import java.util.HashSet;
import java.util.Set;

public class PatternsFinder {
    private static final byte[] seq = SequenceGenerator.generate(300);
    private static final int WORD_LEN = 2;

    public static void main(String[] args) {
        SequenceGenerator.printOut();

        calcInThreeLoops();
        System.out.println("Resulting time in milliseconds: " + SequenceGenerator.calcTime());
    }

    // сколько раз встречаются повторяющиеся подстроки длиной WORD_LEN
    private static void calcInThreeLoops() {
        Set<String> res = new HashSet<String>();

        for (int i = 0; i < seq.length - WORD_LEN; i++) {
            for (int j = i + 1; j < seq.length - WORD_LEN + 1; j++) {
                boolean found = true;
                String subSeq = "";
                for (int k = 0; k < WORD_LEN; k++) {
                    if (seq[i + k] != seq[j + k]) {
                        found = false;
                        break;
                    } else {
                        subSeq += (char) seq[j + k];
                    }
                }
                if (found) {
                    res.add(subSeq);
                }
            }
        }
        System.out.println(res.size());
    }
}
