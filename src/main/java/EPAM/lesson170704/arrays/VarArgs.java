package EPAM.lesson170704.arrays;

public class VarArgs {
    public static void main(String[] args) {
        int x = sum(0);
        System.out.println(sum(0, 1));
        System.out.println(sum(0, 1, 2, 3, 4));
        System.out.println(sum(2));
    }

    private static int sum(int first, int... args) { // i - обычный массив, int... args будет необязательным параметром
        int sum = first;
        for (int value : args) {
            sum += value;
        }
        return sum;
    }
}
