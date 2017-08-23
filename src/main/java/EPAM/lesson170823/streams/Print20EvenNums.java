package EPAM.lesson170823.streams;

import java.util.stream.Stream;

public class Print20EvenNums {
    public static void main(String[] args) {
        // Source -> Transformation -> Terminal Operations
        Stream.iterate(0, n -> n + 2)
                .limit(20)
                .forEach(System.out::println);

        
    }
}
