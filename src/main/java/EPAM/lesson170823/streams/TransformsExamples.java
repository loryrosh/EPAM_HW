package EPAM.lesson170823.streams;

import java.util.stream.Stream;

public class TransformsExamples {
    public static void main(String[] args) {
        Stream.of("b", "a", "n", "a", "n", "a").distinct().forEach(System.out::println);

        System.out.println("_____________");
        Stream.of("b", "a", "n", "a", "n", "a").filter(s -> s.charAt(0) > 'c').forEach(System.out::println);

        System.out.println("_____________");
        Stream.of("b", "a", "n", "a", "n", "a").limit(3).forEach(System.out::println);

        System.out.println("_____________");
        Stream.of("b", "a", "n", "a", "n", "a").skip(2).forEach(System.out::println);

        // начиная с 6 элемента взять 2 элемента (первые 5 пропустить)
        System.out.println("_____________");
        Stream.iterate(1, n -> n + 1).skip(5).limit(2).forEach(System.out::print);

        
    }
}
