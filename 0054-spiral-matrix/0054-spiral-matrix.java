import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return list;
        }
        
        int rt = 0;                  
        int rb = matrix.length - 1;   
        int cl = 0;                  
        int cr = matrix[0].length - 1;
        
        while (rt <= rb && cl <= cr) {
            for (int j = cl; j <= cr; j++) {
                list.add(matrix[rt][j]);
            }

            rt++; 
            for (int i = rt; i <= rb; i++) {
                list.add(matrix[i][cr]);
            }

            cr--; 
            if (rt <= rb) {
                for (int j = cr; j >= cl; j--) {
                    list.add(matrix[rb][j]);
                }
                rb--;
            }

            if (cl <= cr) {
                for (int i = rb; i >= rt; i--) {
                    list.add(matrix[i][cl]);
                }
                cl++;
            }
        }
        
        return list;
    }
}
