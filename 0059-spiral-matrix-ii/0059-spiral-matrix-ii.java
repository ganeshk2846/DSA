class Solution {
    public int[][] generateMatrix(int n) {
        int spiral[][] = new int[n][n];

        int rt = 0;                  
        int rb = n - 1;   
        int cl = 0;                  
        int cr = n - 1;
        int k=1;
        
        while (rt <= rb && cl <= cr) {
            for (int j = cl; j <= cr; j++) {
                spiral[rt][j] = k++;
            }

            rt++; 
            for (int i = rt; i <= rb; i++) {
                spiral[i][cr] = k++;
            }

            cr--; 
            if (rt <= rb) {
                for (int j = cr; j >= cl; j--) {
                    spiral[rb][j] = k++;
                }
                rb--;
            }

            if (cl <= cr) {
                for (int i = rb; i >= rt; i--) {
                    spiral[i][cl] = k++;
                }
                cl++;
            }
        }   
        return spiral;
    }
}