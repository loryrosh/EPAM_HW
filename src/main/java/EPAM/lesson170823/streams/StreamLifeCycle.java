package EPAM.lesson170823.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamLifeCycle {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("one");
        list.add("two");
        list.add("three");

        Stream<String> mappedStream = list.stream().map(String::toUpperCase);

        list.add("four");
        list.add("five");
        list.add("six");
        list.add("seven");
        list.add("eight");

        Stream<String> limited = mappedStream.limit(5);

        mappedStream.forEach(System.out::println);

        // после отработки первого Stream второй Stream, образованный от него, уже не сможет работать;
        // каждый последующий Stream "завязан" на предыдущий
        limited.forEach(System.out::println);
    }
}
