package EPAM.lesson170811.hw;

import java.math.BigDecimal;
import java.util.*;

public class BinarySearchExample {
    public static void main(String[] args) {
        A a = new A();

        BigDecimal start = new BigDecimal(System.currentTimeMillis());
        List<A> linkedList = new LinkedList<>();
        linkedList = (LinkedList<A>) fill(linkedList);
        sort(linkedList);
        search(linkedList, a);
        System.out.println("Total time for LinkedList: " + new BigDecimal(System.currentTimeMillis()).subtract(start));
        System.out.println("");


        start = new BigDecimal(System.currentTimeMillis());
        List<A> arrayList = new ArrayList<>();
        arrayList = (ArrayList<A>) fill(arrayList);
        sort(arrayList);
        search(arrayList, a);
        System.out.println("Total time for ArrayList: " + new BigDecimal(System.currentTimeMillis()).subtract(start));
        System.out.println("");


        start = new BigDecimal(System.currentTimeMillis());
        Set<A> set = new TreeSet<>();
        set = (TreeSet<A>) fill(set);
        set.contains(a);
        System.out.println("Total time for TreeSet: " + new BigDecimal(System.currentTimeMillis()).subtract(start));
    }

    private static boolean search(List<A> list, A elem) {
        BigDecimal start = new BigDecimal(System.currentTimeMillis());
        int idx = Collections.binarySearch(list, elem);
        System.out.println("Searching time: " + new BigDecimal(System.currentTimeMillis()).subtract(start));
        return true;
    }

    private static void sort(List<A> list) {
        BigDecimal start = new BigDecimal(System.currentTimeMillis());
        Collections.sort(list);
        System.out.println("Sorting time: " + new BigDecimal(System.currentTimeMillis()).subtract(start));
    }

    private static Collection<A> fill(Collection<A> list) {
        BigDecimal start = new BigDecimal(System.currentTimeMillis());
        for (int i = 0; i < 1000000; i++) {
            list.add(new A());
        }
        System.out.println("Filling time: " + new BigDecimal(System.currentTimeMillis()).subtract(start));
        return list;
    }
}

class A implements Comparable<A> {
    static Random r = new Random(5);
    int x = r.nextInt(1000000);

    @Override
    public String toString() {
        return Integer.toString(x);
    }

    @Override
    public int compareTo(A o) {
        return x - o.x;
        // -1 наше значение меньше o.x
        // 0 наше значение равно o.x
        // 1 наше значение больше o.x
    }
}
