package EPAM.lesson170701.hw;

public class MatrixProcessing {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 2},
                {3, 4, 5},
                {6, -7, 8}
        };

        //int sum = countSumInRow(matrix, 1);
        //System.out.println(sum);

        countSumInRows(matrix);
    }

    private static int countSumInRow(int[][] matrix, int rowNum) {
        if (rowNum < 0)
            return 0;

        int sum = 0;

        int[] row = matrix[rowNum];
        for (int j = 0; j < row.length; j++) {
            if (row[j] > 0) {
                sum += row[j];
            }
        }
        return sum;
    }

    private static void countSumInRows(int[][] matrix) {
        OUTER:
        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            int sum = 0;

            for (int j = 0; j < row.length; j++) {
                if (row[j] < 0) {
                    continue OUTER;
                }
                sum += row[j];
            }
            System.out.println("Row " + i + " - sum: " + sum);
        }
    }
}
