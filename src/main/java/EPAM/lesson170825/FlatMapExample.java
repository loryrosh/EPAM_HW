package EPAM.lesson170825;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {
    public static void main(String[] args) {
        // разбить строку на отдельные буквы
        String[] spl = "hello".split("");
        System.out.println(Arrays.toString(spl));


        String[] words = {"hello", "world"};

        // получить список всех уникальных букв
        Stream<String> stream = Arrays.stream(words);

        Stream<String[]> stringArrays = stream.map(s -> s.split(""));

        //Stream<Stream<String>> map = stringArrays.map(Arrays::stream);
        // получаем плоскую структуру
        // (Stream из всех элементов, которые сами по себе Stream-ы)
        Stream<String> streamOfLetters = stringArrays.flatMap(Arrays::stream);

        // берем только уникальные буквы и собираем его в список
        List<String> list = streamOfLetters.distinct().collect(Collectors.toList());
        System.out.println(list);


        // короткий вариант записи
        System.out.println(
                Arrays.stream(words)
                        .map(s -> s.split(""))
                        .flatMap(Arrays::stream)
                        .distinct()
                        .collect(Collectors.toList())

        );
    }
}
