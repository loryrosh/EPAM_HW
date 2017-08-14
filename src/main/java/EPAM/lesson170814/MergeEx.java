package EPAM.lesson170814;

import java.util.Arrays;

public class MergeEx {
    public static void main(String[] args) {
        Integer[] a = new Integer[]{1, 2, 3, 4, 3, 4, 2, 3, 6};
        Integer[] aux = new Integer[a.length];

        merge(a, aux, 0, a.length - 1, 4);
        System.out.println(Arrays.toString(a));

        Integer[] a2 = {70, 60, 50, 40, 30, 20, 10, 0};
        sort(a2);
        System.out.println(Arrays.toString(a2));
    }

    public static void merge(Comparable[] a, Comparable[] aux, int lo, int hi, int mid) {
        for (int i = lo; i <= hi; i++) {
            aux[i] = a[i];
        }

        int i = lo;
        int j = mid + 1;

        for (int k = lo; k <= hi; k++) {
            if (i > mid) { // если левая часть закончилась, начинаем брать из правой части
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (aux[j].compareTo(aux[i]) < 0) {
                a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }
        }
    }

    public static void sort(Comparable[] a) {
        Comparable[] aux = new Comparable[a.length];
        sortRec(a, aux, 0, a.length - 1);
    }

    public static void sortRec(Comparable[] a, Comparable[] aux, int lo, int hi) {
        if (hi <= lo) {
            return;
        }

        int mid = lo + (hi - lo) / 2;
        sortRec(a, aux, lo, mid);
        sortRec(a, aux, mid + 1, hi);
        merge(a, aux, lo, hi, mid);

        System.out.println("Merged: " + Arrays.toString(a) + " lo: " + lo + " hi: " + hi);
        System.out.println();
    }
}
