package EPAM.lesson170809.hw;

import EPAM.lesson170809.hw.Dictionary.Pair;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Dictionary implements Iterable<Pair> {
    private static final int MAX = 10;
    private static final BigDecimal THRESHOLD = new BigDecimal(100000);

    List<Pair>[] data = new List[MAX];
    private int elemsCount = 0;

    public static class Pair {
        String key;
        String value;

        public Pair(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public static Dictionary createInstance(int valuesNum) {
        BigDecimal start = new BigDecimal(System.currentTimeMillis());

        Dictionary dict = new Dictionary();
        for (int i = 0; i < valuesNum; i++) {
            dict.put(("Key " + i), ("Value " + i));
        }
        System.out.println("Resulting time for populating the Dictionary: " + new BigDecimal(System.currentTimeMillis())
                .subtract(start));
        return dict;
    }

    public void put(String key, String value) {
        int index = hash(key);
        if (data[index] == null) {
            data[index] = new ArrayList<>();
        }

        Pair pair = getPair(index, key);
        if (pair == null) {
            data[index].add(new Pair(key, value));
            return;
        }

        pair.value = value;
    }

    public String get(String key) {
        BigDecimal start = new BigDecimal(System.nanoTime());
        Pair pair = getPair(key);
        BigDecimal end = new BigDecimal(System.nanoTime()).subtract(start);

        benchmark(end);
        return (pair == null) ? null : pair.value;
    }

    private void benchmark(BigDecimal end) {
        if (end.compareTo(THRESHOLD) > 0) {
            System.out.println("Resize occurred. Previous size: " + data.length);
            resize();
            System.out.println("Current size: " + data.length);
        }
    }

    public Pair delete(String key) {
        int index = hash(key);
        if (data[index] != null) {
            for (Pair pair : data[index]) {
                if (pair.key.equals(key)) {
                    data[index].remove(pair);
                    return pair;
                }
            }
        }
        return null;
    }

    private Pair getPair(String key) {
        int index = hash(key);
        return getPair(index, key);
    }

    private Pair getPair(int index, String key) {
        List<Pair> list = data[index];
        if (list == null) { // guard condition
            return null;
        }

        for (Pair pair : list) {
            if (pair.key.equals(key)) {
                return pair;
            }
        }
        return null;
    }

    public void resize() {
        Dictionary newDict = new Dictionary();
        newDict.data = new List[(int) (data.length * 1.5)];

        for (Pair pair : this) {
            newDict.put(pair.key, pair.value);
        }

        data = newDict.data;
    }

    public String toString() {
        StringBuilder res = new StringBuilder();

        for (Pair pair : this) {
            res.append("Key: ").append(pair.key).append(" --- Value: ").append(pair.value).append("\n");
        }
        res.append("size ").append(data.length).append("\n");
        res.append("________\n");
        return res.toString();
    }

    private int hash(String key) {
        return key.hashCode() & 0x7FFFFFFF % data.length;
    }

    @Override
    public Iterator<Pair> iterator() {
        return new Iterator<Pair>() {
            int currentElem = 0;
            Iterator<Pair> listIterator = null;

            @Override
            public boolean hasNext() {
                if (listIterator != null && listIterator.hasNext())
                    return true;

                listIterator = null; // предыдущий список уже перебрали до конца
                while (listIterator == null && currentElem < data.length) {
                    List<Pair> list = data[currentElem++];
                    if (list == null) {
                        continue;
                    }

                    listIterator = list.iterator();
                    if (!listIterator.hasNext()) {
                        listIterator = null;
                        continue;
                    }
                    return listIterator.hasNext();
                }
                return false;
            }

            @Override
            public Pair next() {
                if (!hasNext()) {
                    throw new IllegalArgumentException();
                }
                return listIterator.next();
            }
        };
    }
}
