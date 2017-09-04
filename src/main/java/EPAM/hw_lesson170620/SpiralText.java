package EPAM.hw_lesson170620;

public class SpiralText {
    public static void main(String[] args) {
        int[][] arr = new int[4][5];

        printArr(arr);
        printArr(getSpiral(arr));
    }

    private static int[][] getSpiral(int[][] arr) {
        if (arr.length == 0) {
            return arr;
        }

        int iStart = 0;
        int iEnd = arr.length;
        int jStart = 0;
        int jEnd = arr[0].length;

        int curNum = 1;

        while (curNum <= (arr.length * arr[0].length)) {
            for (int j = jStart; j < jEnd; j++) {
                arr[iStart][j] = curNum++;
            }
            iStart++;
            jEnd--;

            for (int i = iStart; i < iEnd; i++) {
                arr[i][jEnd] = curNum++;
            }
            iEnd--;

            for (int j = jEnd - 1; j >= jStart; j--) {
                arr[iEnd][j] = curNum++;
            }

            for (int i = iEnd - 1; i >= iStart; i--) {
                arr[i][jStart] = curNum++;
            }
            jStart++;
        }
        return arr;
    }

    private static void printArr(int[][] arr) {
        for (int[] row : arr) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.print("\n");
        }
        System.out.println("");
    }
}
