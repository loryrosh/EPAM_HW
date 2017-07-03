package EPAM.lesson170701.operations;

public class MatrixProcessing {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 2},
                {3, 4, 5},
                {6, 7, 8}
        };

        int k = count(matrix, 10);

        System.out.println();
        System.out.println(k);
    }

    private static int count(int[][] matrix, int max) {
        int res = 0;
        int s = 0;

        // оператор break с меткой
        OUTER:
        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            for (int j = 0; j < matrix[i].length; j++) {
                res++;
                s += row[j];
                System.out.print(s);
                if (s > max) {
                    break OUTER;
                }
            }
        }
        return res;
    }
}
