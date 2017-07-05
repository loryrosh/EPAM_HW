package EPAM.lesson170704.arrays;

import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {
        // создание пустого массива за 1 шаг
        int[] a = {};

        // создание пустого массива за 2 шага
        int[] b;
        b = new int[]{};
        b = new int[0]; // 0 элементов
        b = new int[3]; // 3 элемента с значениями по умолчанию = new int[]{0, 0, 0}

        System.out.println(a); // вызываем метод Object.toString() - адрес массива
        System.out.println(Arrays.toString(b)); // содержимое массива

        String s[] = new String[3];
        System.out.println(Arrays.toString(s));

        print(s);
    }

    private static void print(String[] arrStr) {
        int index = 0;
        while (index < arrStr.length) {
            System.out.println(arrStr[index++]);
        }
    }
}

// сделать вывод как в toString() - [null, null, null]