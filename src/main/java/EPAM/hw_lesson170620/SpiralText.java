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
        int jStart = 0;
        int iEnd = arr.length;
        int jEnd = arr[0].length;
        int iParam = 1;
        int jParam = 1;

        int curNum = 1;

        int i = 0;
        int j = 0;
        while (curNum <= (arr.length * arr[0].length)) {
            for (; j < jEnd && j >= 0; j = j + jParam) {
                if (arr[i][j] == 0) {
                    arr[i][j] = curNum++;
                } else {
                    jEnd = j;
                    break;
                }
            }
            jParam = -jParam;

            if (j > 0) {
                j--;
                i++;
            } else {
                j++;
                i--;
            }

            for (; i < iEnd && i >= 0; i = i + iParam) {
                if (arr[i][j] == 0) {
                    arr[i][j] = curNum++;
                } else {
                    iEnd = i;
                    break;
                }
            }
            j--;
            i--;

            iParam = -iParam;
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
