package EPAM.lesson170823.optional;

import java.util.Optional;
import java.util.Random;

public class OptionalExample {
    final static Random r = new Random();

    public static void main(String[] args) {
        Optional<String> opt = Optional.empty();

        String f = opt.orElse("");
        String s = opt.orElseGet(() -> "");
        String s2 = opt.orElseGet(OptionalExample::getDefaultValue);
    }

    private static String getDefaultValue() {
        return null;
    }

    public Optional<String> compute() {
        return Optional.ofNullable(r.nextBoolean() ? "hello" : null);
    }
}
