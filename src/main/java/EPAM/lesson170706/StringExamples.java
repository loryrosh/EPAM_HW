package EPAM.lesson170706;

import java.util.Arrays;

public class StringExamples {
    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 4, 5, 6};

        // копирование массивов - ссылка на новый массив
        int[] copyOf = Arrays.copyOf(a, 20);

        String s = "hello";
        String mes = s.concat(", world");

        System.out.println(s);
        System.out.println(mes);

        String newMes = s + ", world";
        System.out.println(newMes);

        
    }
}
