package EPAM.lesson170823;

import java.util.ArrayList;
import java.util.List;

public class LambdaUsageExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Boston");
        list.add("Moscow");
        list.add("NY");

        System.out.println(list);

        // обычный подход
        for (String str : list) {
            System.out.println(str);
        }

        // через lambda
        list.forEach(s -> System.out.println(s));
        list.forEach(System.out::println);

        list.removeIf(s -> s.length() > 6);
    }
}
