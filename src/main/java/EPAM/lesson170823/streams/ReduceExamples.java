package EPAM.lesson170823.streams;

import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class ReduceExamples {
    public static void main(String[] args) {
        Stream<String> letters = Stream.of("b", "a", "n", "a", "n", "a");
        Optional<String> res = letters.reduce(String::concat);
        res.ifPresent(System.out::println);

        // сокращаем (reduce) набор чисел, каждый раз суммируя числа попарно
        Optional<Integer> sum = Stream.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
                .reduce((i, j) -> i + j);
        sum.ifPresent(System.out::println);

        // в данном случае получится уже не Optional, а число - мы задали начальное значение
        Integer mult = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .reduce(1, (i, j) -> i * j);
        System.out.println(mult);

        // если нужно распараллелить вычисление
        BinaryOperator<Integer> op = (i, j) -> i * j;
        Integer product2 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).parallel()
                .reduce(1, op, op);
        System.out.println(product2);
    }
}
