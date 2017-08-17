package EPAM.lesson170816.hw;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] arr = new int[]{124, 34, 0, 1, 12376, 22};

        int[] sortedArr = sort(arr);
        System.out.println(Arrays.toString(sortedArr));
    }

    public static int[] sort(int[] a) {
        int R = 10; // 0123456789
        int N = a.length;
        int[] aux = new int[N];
        int max = max(a);

        for (int d = 1; (max / d) > 0; d *= 10) {
            int[] count = new int[R + 1];

            for (int i = 0; i < N; i++) {
                count[(a[i] / d) % 10 + 1]++;
            }

            for (int r = 0; r < R; r++) {
                count[r + 1] += count[r];
            }

            for (int i = 0; i < N; i++) {
                aux[count[(a[i] / d) % 10]++] = a[i];
            }

            for (int i = 0; i < N; i++) {
                a[i] = aux[i];
            }
        }
        return a;
    }

    private static int max(int[] arr) {
        int max = 0;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}

// http://algs4.cs.princeton.edu/lectures/51StringSorts.pdf
