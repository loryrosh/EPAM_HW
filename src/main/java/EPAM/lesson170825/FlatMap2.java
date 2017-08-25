package EPAM.lesson170825;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap2 {
    public static void main(String[] args) {
        List<String> empty = Arrays.asList();

        List<String> list1 = Arrays.asList("one", "two", "three");
        List<String> list2 = Arrays.asList("один", "два", "три");

        // получить объединенный список
        Stream<List<String>> streamOfLists = Stream.of(list1, empty, list2);

        //Stream<Stream<String>> res = streamOfLists.map(Collection::stream);
        Stream<String> streamOfStrings = streamOfLists.flatMap(Collection::stream);
        List<String> words = streamOfStrings.collect(Collectors.toList());
        System.out.println(words);

        // или коротко
        List<String> wordsShort = Stream.of(list1, empty, list2)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println(wordsShort);
    }
}
