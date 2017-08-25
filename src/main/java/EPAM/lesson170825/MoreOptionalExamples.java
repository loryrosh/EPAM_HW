package EPAM.lesson170825;

import java.util.Optional;

public class MoreOptionalExamples {
    public static void main(String[] args) {
        System.out.println(hasThreeDigits(null));
        System.out.println(hasThreeDigits(100));
        System.out.println(hasThreeDigits(99));
        System.out.println(hasThreeDigits(1000));
        System.out.println(hasThreeDigits(-100)); // сюрприз :)
    }

    static public boolean hasThreeDigits(Integer n) {
        if (n == null) {
            return false;
        }

        String s = Integer.toString(n);
        return s.length() == 3;
    }

    static public boolean hasThreeDigitsWithOptionals(Integer n) {
        return Optional.ofNullable(n)
                .map(i -> Integer.toString(i))
                .filter(s -> s.length() == 3)
                .isPresent();
    }
}
