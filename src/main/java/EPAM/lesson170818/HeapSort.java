package EPAM.lesson170818;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class HeapSort {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        List<String> sorted = heapSort(list);

        System.out.println(sorted);
    }

    private static List<String> heapSort(List<String> list) {
        PriorityQueue<String> pq = new PriorityQueue<>();

        for (String str : list) {
            pq.add(str);
        }

        List<String> res = new ArrayList<>();
        while (!pq.isEmpty()) {
            res.add(pq.poll());
        }

        return res;
    }
}
