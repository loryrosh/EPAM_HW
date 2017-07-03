package EPAM.lesson170701.hw;

import EPAM.lesson170629.hw.SequenceGenerator;

import java.util.HashMap;

public class GenomeThroughHM {
    private static final int GENOME_SIZE = 300;
    private static final int WORD_SIZE = 2;

    public static void main(String[] args) {
        byte[] data = SequenceGenerator.generate(GENOME_SIZE);
        SequenceGenerator.printOut();

        HashMap<String, Integer> res = populateHM(data);
        printResults(res);

        System.out.println("Resulting time in milliseconds: " + SequenceGenerator.calcTime());
    }

    private static void printResults(HashMap<String, Integer> res) {
        int count = 0;
        for (String key : res.keySet()) {
            if (res.get(key) > 1) {
                System.out.println(key + " " + res.get(key));
                count++;
            }
        }
        System.out.println(count + " repeating patterns");
    }

    private static HashMap<String, Integer> populateHM(byte[] data) {
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < data.length - WORD_SIZE; i++) {
            String seq = "";
            for (int j = 0; j < WORD_SIZE; j++) {
                seq += (char) data[i + j];
            }

            if (map.containsKey(seq)) {
                map.put(seq, map.get(seq) + 1);
            } else {
                map.put(seq, 1);
            }
        }
        return map;
    }
}
