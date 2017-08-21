package EPAM.lesson170821;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> cons = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        // String t не обязательно указывать - уже указали String
        Consumer<String> cons2 = (t) -> System.out.println(t);

        Consumer<String> con3 = System.out::println;
        con3.accept("Hello");

        Map<String, Integer> map = new HashMap<>();
        BiConsumer<String, Integer> biCons = new BiConsumer<String, Integer>() {
            @Override
            public void accept(String key, Integer value) {
                map.put(key, value);
            }
        };

        BiConsumer<String, Integer> biCons2 = (key, value) -> map.put(key, value);
        BiConsumer<String, Integer> biCons3 = map::put;
        biCons3.accept("one", 1);
    }
}
