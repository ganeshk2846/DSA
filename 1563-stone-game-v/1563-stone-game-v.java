public class Solution {
    public int stoneGameV(int[] stoneValue) {
        int n = stoneValue.length;
        
        int[] pref = new int[n + 1];
        for (int i = 0; i < n; i++) {
            pref[i + 1] = pref[i] + stoneValue[i];
        }
        
        int[][] dp = new int[n][n];
        int[][] maxLeft = new int[n][n];
        int[][] maxRight = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            maxLeft[i][i] = stoneValue[i];
            maxRight[i][i] = stoneValue[i];
        }
        
        for (int len = 2; len <= n; len++) {
            int mid = 0; 
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                
                while (mid < j && (pref[mid + 1] - pref[i]) < (pref[j + 1] - pref[mid + 1])) {
                    mid++;
                }
                
                int res = 0;
                
                if (mid > i) {
                    res = Math.max(res, maxLeft[i][mid - 1]);
                }
                

                if (mid < j) {
                    res = Math.max(res, maxRight[mid + 1][j]);
                }
                
                if ((pref[mid + 1] - pref[i]) == (pref[j + 1] - pref[mid + 1])) {
                    res = Math.max(res, dp[i][mid] + (pref[mid + 1] - pref[i]));
                    if (mid + 1 <= j) {
                        res = Math.max(res, dp[mid + 1][j] + (pref[j + 1] - pref[mid + 1]));
                    }
                }
                
                dp[i][j] = res;
            
                maxLeft[i][j] = Math.max(maxLeft[i][j - 1], dp[i][j] + (pref[j + 1] - pref[i]));
                maxRight[i][j] = Math.max(maxRight[i + 1][j], dp[i][j] + (pref[j +1 ] - pref[i]));
            }
        }
        
        return dp[0][n - 1];
    }
}
