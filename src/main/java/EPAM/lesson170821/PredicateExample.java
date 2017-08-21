package EPAM.lesson170821;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        // T -> boolean
        Predicate<String> pred = s -> s.isEmpty();
        Predicate<String> pred1 = String::isEmpty;

        System.out.println(pred.test(""));
        System.out.println(pred.test("Hello"));

        BiPredicate<String, String> bp1 = (line, prefix) -> line.startsWith(prefix);
        BiPredicate<String, String> bp2 = String::startsWith;

        
    }
}
