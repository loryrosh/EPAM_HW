package EPAM.lesson170823.streams;

import java.util.Optional;
import java.util.stream.Stream;

public class TerminalOperationsExamples {
    public static void main(String[] args) {
        System.out.println(
                Stream.generate(Math::random)
                        .limit(20)
                        .min(Double::compare)
                        .get()
        );

        // это два разных объекта
        Stream<Double> s1 = Stream.generate(Math::random);
        Stream<Double> s2 = s1.limit(20);

        System.out.println(s1 == s2);

        // для получения minimum нужен компаратор
        // Stream может быть пустым - возвращается Optional
        Optional<Double> minOpt = s2.min(Double::compare);
        Double res = minOpt.get();

        System.out.println(res);
    }
}
