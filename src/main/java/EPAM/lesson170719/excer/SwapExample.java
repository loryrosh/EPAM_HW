package EPAM.lesson170719.excer;

import java.util.Arrays;

public class SwapExample {
    public static void main(String[] args) {
        int x = 100;
        int y = 10;

        // классический вариант - быстро, но не экономно по памяти
        int tmp = x;
        x = y;
        y = tmp;

        swap(x, y); // изменение значений x и y происходит только локально внутри функции, а реальные x и y не меняются

        int a[] = new int[]{100, 50};
        swap(a);
        System.out.println(Arrays.toString(a));

        // медленнее, но экономим лишнюю ячейку памяти
        x = x + y; // x == 100 + 50 (важно, чтобы x + y были небольшие, чтобы не было переполнения типа)
        y = x - y; // y == 100
        x = x - y; // x == 50
    }

    private static void swap(int[] a) {
        int tmp = a[0];
        a[0] = a[1];
        a[1] = tmp;
    }

    private static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }
}
