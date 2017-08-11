package EPAM.lesson170811.hw;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 5, 6, 8, 9, 3, 4};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        int res = BinarySearch.indexOf(a, 7);
        System.out.println(res);
    }

    // http://algs4.cs.princeton.edu/11model/BinarySearch.java.html
    public static int indexOf(int[] a, int key) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return determineIndex(a, key);
    }

    private static int determineIndex(int[] a, int key) {
        int idx = 0;
        while (key > a[idx]) {
            idx++;
        }
        return -(idx + 1);
    }
}
