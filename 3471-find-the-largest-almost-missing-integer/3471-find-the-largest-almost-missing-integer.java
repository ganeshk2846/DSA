class Solution {
    public int largestInteger(int[] A, int k) {
        int[] f = new int[51];
        for (int x : A) {
            f[x]++;
        }

        int res = -1, n = A.length;
        for (int i = 0; i < n; i++) {
            int num = A[i];
            
            if (k == n) {
                res = Math.max(res, num);
                continue; 
            }

            if (f[num] == 1) {
                if (k == 1) {
                    res = Math.max(res, num);
                }
                else if (i == 0) {
                    res = Math.max(res, num);
                }
                else if (i == n - 1) {
                    res = Math.max(res, num);
                }
            }
        }

        return res;
    }
}
