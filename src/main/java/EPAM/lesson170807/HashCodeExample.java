package EPAM.lesson170807;

public class HashCodeExample {
    public static void main(String[] args) {
        String s = "policarbonatus";

        System.out.println(s.hashCode());
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Math.abs(Integer.MIN_VALUE));
        System.out.println(Math.abs(Integer.MIN_VALUE % 10));
    }
}
