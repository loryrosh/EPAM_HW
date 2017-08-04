package EPAM.lesson170804.collections;

import java.util.*;

public class PriorityQueueExample {
    private static final int MAX = 1000000;

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(0);
        pq.add(5);
        pq.add(-3);
        pq.add(40);

        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());


        Random r = new Random();
        for (int i = 0; i < MAX; i++) {
            pq.add(r.nextInt(100000000));
            if (pq.size() > 10) {
                pq.poll();
            }
        }

        System.out.println(pq);

        Map<String, Integer> wordCount = new HashMap<>();
        fill(wordCount);

        Map<String, Integer> wordCount1 = new LinkedHashMap<>();
        Map<String, Integer> wordCount2 = new TreeMap<>();
    }

    private static void fill(Map<String, Integer> wordCount) {
        List<String> words = Arrays.asList("one", "two", "two", "three");

        for (String word : words) {
            Integer count = wordCount.get(word);
            wordCount.put(word, count == null ? Integer.valueOf(1) : ++count);
        }

        System.out.println(wordCount);
    }
}
