package EPAM.lesson170701.operations;

public class Example2 {
    public static void main(String[] args) {
        process("Dada");
        process("");
        process(null);

        int i = 0;
        int j = 0;
        j = i = 10;
    }

    private static void process(String s) {
        // происходит вычисление _обоих_ условий для вычисления побитового "&"
        // в результате - Exception
        //if (s != null & s.length() > 0) {

        if (s != null && s.length() > 0) {
            System.out.println("Hello " + s);
        }
    }
}
