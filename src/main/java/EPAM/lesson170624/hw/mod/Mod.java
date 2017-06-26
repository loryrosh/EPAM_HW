package EPAM.lesson170624.hw.mod;

public class Mod {
    public static int mod(int a, int b) throws ArithmeticException {
        int res = a / b;
        return a - (b * res);
    }
}
