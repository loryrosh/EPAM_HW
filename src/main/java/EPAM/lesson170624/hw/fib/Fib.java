package EPAM.lesson170624.hw.fib;

public class Fib {
    public static boolean isFibonacci(int a) {
        if(a < 1)
            return false;
        else if(a == 1)
            return true;

        int n = 0, k1 = 1, k2 = 1;
        while (n < a){
            n = k2 + k1;
            k2 = k1;
            k1 = n;
        }
        if (a == n)
            return true;
        return false;
    }
}

// resources
// fib(k) = fib(k-2) + fib(k-1)

// https://oeis.org/A000045
// https://habrahabr.ru/post/261159/
// https://code-live.ru/forum/cpp/145/
