package EPAM.lesson170823.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamsExamples {
    public static void main(String[] args) {
        // пустой поток данных
        Stream<String> stream = Stream.empty();

        // поток данных  значений
        Stream<Integer> stream2 = Stream.of(1);
        Stream<Integer> stream3 = Stream.of(1, 2, 3, 4, 5);

        // поток данных на коллекции
        List<String> list = Arrays.asList("one", "two", "three");
        Stream<String> stream4 = list.stream();

        // пересчитать кол-во элементов в потоке данных
        count(stream);
        count(stream2);
        count(stream3);
        count(stream4);


        // поток данных через lamdba-выражение (интерфейс Supplier)
        Stream<Double> rand = Stream.generate(Math::random);
        // бесконечно
        // System.out.println(count(rand));

        // Source -> Transformation -> Terminal Operations
        Stream.generate(Math::random).limit(20).forEach(System.out::println);

        // после обработки Stream уже закрыт - повторно его использовать нельзя
        // Optional<Integer> any = stream3.findAny(); !!!

        // метод empty() параметризированный - для записи <String>empty()
        Optional<String> any = Stream.<String>empty().findAny(); // !!!!!!!!!!!!
        any.ifPresent(System.out::println); // если есть значение, то его печатаем. ifPresent принимает Consumer

        // печатаем любое число потока данных
        Stream.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9).findAny().ifPresent(System.out::println);
        // печатаем первое число потока данных
        Stream.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9).findFirst().ifPresent(System.out::println);

        // возвращает boolean - есть ли данные, удовлетворяющие данному условию - терминальная операция
        // anyMatch - это Predicate
        Stream.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9).anyMatch(i -> i % 3 == 0);

        System.out.println("_______________");
        // генерация нового Stream - отфильтррованный прежний поток
        Stream.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9).filter(i -> i % 3 == 0).forEach(System.out::println);
    }

    private static void count(Stream<?> stream) {
        long count = stream.count();
        System.out.println(count);
    }
}
