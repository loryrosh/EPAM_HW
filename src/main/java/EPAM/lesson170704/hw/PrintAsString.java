package EPAM.lesson170704.hw;

public class PrintAsString {
    public static void main(String[] args) {
        String[] s = {"one", "two", "three"};
        print(s);
    }

    private static void print(String[] arrStr) {
        System.out.print("[");

        int index = 0;
        while (index < arrStr.length) {
            System.out.print(arrStr[index++]);

            if (index < arrStr.length)
                System.out.print(", ");
        }
        System.out.print("]");
    }
}
