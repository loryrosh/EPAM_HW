package EPAM.lesson170701.operations;

public class Example3 {
    public static void main(String[] args) {
        short x = 10;
        short y = 3;

        // по умолчанию результат операции преобразовывается к int
        short z = (short) (x * y);
        System.out.println(z);

        // "зацикливание" - Max переходит в Min
        int k = Integer.MAX_VALUE;
        k++;
        System.out.println(k);
        System.out.println(Math.abs(Integer.MIN_VALUE));
    }
}
