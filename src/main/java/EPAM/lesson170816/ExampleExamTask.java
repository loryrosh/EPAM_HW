package EPAM.lesson170816;

public class ExampleExamTask {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {-2, 6},
                {1, -3},
                {5, 0, 6},
                {3, 5, 4}
        };

        System.out.println(isSimm(arr));
    }

    private static boolean isSimm(int[][] arr) {
        if (arr[0].length != arr.length) {
            return false;
        }

        for (int i = 0; i < arr.length; i++) {
            int[] curArr = arr[i];

            for (int j = 0; j < curArr.length; j++) {
                if (i != j) {
                    if (arr[i][j] != arr[j][i]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
