package EPAM.lesson170823.hw;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;

public class MapHW {
    private static HashMap<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        //List<String> list = Arrays.asList("a", "b", "c", "a", "d", "b", "b", "c", "h");
        List<String> list = Arrays.asList("one", "one", "two", "two", "three");

        // simple word count
        countWordsSimple(list);
        printMap();

        // functional interface
        Countable inter = MapHW::countWordsSimple;
        inter.countWords(list);
        printMap();

        // Consumer function and streams
        Consumer<List<String>> consumer = MapHW::countWordsWithStreams;
        consumer.accept(list);
        printMap();
    }

    private static void countWordsSimple(List<String> list) {
        map.clear();
        for (String str : list) {
            addToMap(str);
        }
    }

    private static void countWordsWithStreams(List<String> list) {
        map.clear();
        list.forEach(MapHW::addToMap);
    }

    private static void addToMap(String str) {
        if (map.containsKey(str)) {
            map.replace(str, map.get(str) + 1);
        } else {
            map.put(str, 1);
        }
    }

    private static void printMap() {
        map.entrySet().forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
        System.out.println("");
    }
}

@FunctionalInterface
interface Countable {
    void countWords(List<String> list);
}
