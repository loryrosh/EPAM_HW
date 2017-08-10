package EPAM.lesson170809.hw;

import EPAM.lesson170809.hw.Dictionary.Pair;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Dictionary implements Iterable<Pair> {
    private static final int MAX = 10;

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
        Pair pair = getPair(key);
        return (pair == null) ? null : pair.value;
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
        newDict.data = new List[data.length * 2];

        Iterator<Pair> iter = this.iterator();
        while (iter.hasNext()) {
            Pair pair = iter.next();
            newDict.put(pair.key, pair.value);
        }
        data = newDict.data;
        newDict = null;
    }

    public String toString() {
        StringBuilder res = new StringBuilder();

        Iterator<Pair> iter = this.iterator();
        while (iter.hasNext()) {
            Pair pair = iter.next();
            res.append("Key: " + pair.key + " --- Value: " + pair.value + "\n");
        }
        res.append("size " + data.length + "\n");
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
