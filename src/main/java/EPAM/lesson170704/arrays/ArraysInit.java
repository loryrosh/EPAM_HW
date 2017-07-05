package EPAM.lesson170704.arrays;

import java.util.Arrays;

public class ArraysInit {
    public static void main(String[] args) {
        int[][] m = {
                {0, 0, 0},
                {0, 0, 0}
        };

        int[][] m2 = new int[2][3];

        int[][] m3;
        m3 = new int[2][];
        System.out.println(Arrays.toString(m3)); // [null, null]

        m3[0] = new int[3];
        m3[1] = new int[3];
        //m3[2] = new int[3]; // ERROR

        int[][][] cube; // трехмерный массив

        int[][] triangle = {
                {0},
                {1, 2},
                {3, 4, 5}
        };
        System.out.println(Arrays.toString(triangle));
    }
}
