package EPAM.lesson170714;

public class FinalExamples {
    public static void main(String[] args) {
        final int x = 10; // лучше делать переменные, значения котторых мы не будем менять, final

        //process(x);
        process(10);

        System.out.println(x);
    }

    private static void process(int param) { // param = 10
        param += 10;
    }
}
