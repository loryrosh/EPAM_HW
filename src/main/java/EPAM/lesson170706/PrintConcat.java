package EPAM.lesson170706;

public class PrintConcat {
    public static void main(String[] args) {
        String s = "hello" + "dad";
        String s1 = "2";

        System.out.println(s + 1);
        System.out.println(s1 + 1);
        System.out.println(1 + 2 + s1);
        System.out.println(s1 + 1 + 2); // !!!

        System.out.println(s.intern());
    }
}
