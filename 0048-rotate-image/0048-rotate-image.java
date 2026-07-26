class Solution {

    public void rotateRows(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;

            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;
            }
        }
    }

    public void antiDiagonalTranspose(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - j][n - 1 - i];
                matrix[n - 1 - j][n - 1 - i] = temp;

            }
        }
    }

    public void rotate(int[][] matrix) {
        int n = matrix.length;

        rotateRows(matrix, n);
        antiDiagonalTranspose(matrix, n);
    }
}