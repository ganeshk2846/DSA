class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int nr = matrix.length, nc = matrix[0].length;
        int rlow = 0, rhigh = nr - 1;
        
    
        while (rlow <= rhigh) {
            int rmid = rlow + (rhigh - rlow) / 2;
            
            if (target >= matrix[rmid][0] && target <= matrix[rmid][nc - 1]) {
            
                int clow = 0, chigh = nc - 1;
                while (clow <= chigh) {
                    int cmid = clow + (chigh - clow) / 2;
                    if (matrix[rmid][cmid] == target) {
                        return true;
                    } else if (matrix[rmid][cmid] > target) {
                        chigh = cmid - 1;
                    } else {
                        clow = cmid + 1;
                    }
                }
                return false; 
            }
            
            if (target < matrix[rmid][0]) {
                rhigh = rmid - 1;
            } else {
                rlow = rmid + 1; 
            }
        }
        return false;
    }
}
