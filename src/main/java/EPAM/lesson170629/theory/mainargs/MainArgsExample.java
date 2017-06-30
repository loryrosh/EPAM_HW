package EPAM.lesson170629.theory.mainargs;

public class MainArgsExample {
    public static void main(String[] args) {
        System.out.println(args);
        System.out.println(args.length);

        if (args.length == 0) {
            System.out.println("Usage: java MainArgsExample <name> [<age>]");
        }

        // для параметров с пробелом нужно использовать кавычки
        for (String str : args) {
            System.out.println(str);
        }
    }
}
