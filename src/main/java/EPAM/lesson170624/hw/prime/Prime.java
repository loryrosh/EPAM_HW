package EPAM.lesson170624.hw.prime;

import java.util.Arrays;

public class Prime {
    public static boolean isPrime(int a) {
        if(a < 2)
            return false;

        double max = Math.sqrt(a);
        for (int i = 2; i <= max; i++){
            if (a % i == 0)
                return false;
        }
        return true;
    }
}

// resources
// prime: a % a == 0 and a % 1 == 0

// https://ru.wikipedia.org/wiki/%D0%A1%D0%BF%D0%B8%D1%81%D0%BE%D0%BA_%D0%BF%D1%80%D0%BE%D1%81%D1%82%D1%8B%D1%85_%D1%87%D0%B8%D1%81%D0%B5%D0%BB
// https://habrahabr.ru/post/122538/
