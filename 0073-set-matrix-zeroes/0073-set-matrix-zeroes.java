class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> rows = new HashSet<>();
        HashSet<Integer> cols = new HashSet<>();
        int n_rows=matrix.length;
        int n_cols=matrix[0].length;

        for(int i=0;i<n_rows;i++)
        {
            for(int j=0;j<n_cols;j++)
            {
                 if (matrix[i][j] == 0)
                  {
                    rows.add(i);
                    cols.add(j);
                 }
            }
        }
       

        for (int row : rows) {
            for (int j = 0; j <n_cols; j++) {
                 matrix[row][j] = 0;
            }
        }
        for(int col:cols)
        {
            for(int i=0;i<n_rows;i++)
                matrix[i][col]=0;
        }
    }
}