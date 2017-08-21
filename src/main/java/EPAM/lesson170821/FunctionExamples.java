package EPAM.lesson170821;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExamples {
    public static void main(String[] args) {
        Function<String, Integer> f1 = s -> s.length();
        Function<String, Integer> f2 = String::length;

        System.out.println(f2.apply("Hello"));
        BiFunction<String, String, String> bf = (s1, s2) -> s1.concat(s2);
        BiFunction<String, String, String> bf1 = String::concat;
    }
}
