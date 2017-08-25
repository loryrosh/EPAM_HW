package EPAM.lesson170825;

import java.util.Optional;

public class OptionalFlatExample {
    public static void main(String[] args) {
        String s = null;
        Optional<String> opStr = Optional.ofNullable(s);
        Optional<Integer> opInt = opStr.map(String::length);
    }
}
