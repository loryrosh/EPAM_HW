package EPAM.lesson170825;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class PrimitiveStreams {
    public static void main(String[] args) {
        // Stream со значениями от 1 до 10
        IntStream.rangeClosed(1, 10).forEach(System.out::println);


        IntStream stream = IntStream.rangeClosed(1, 10);
        printStats(stream);
    }

    private static void printStats(IntStream stream) {
        // int sum = stream.sum();
        // long count = stream.count(); // уже будет исключение!!! Stream уже отработал
        // OptionalDouble average = stream.average();
        // System.out.println(sum + " " + count);

        IntSummaryStatistics stats = stream.summaryStatistics();
        System.out.println(stats);
    }
}
