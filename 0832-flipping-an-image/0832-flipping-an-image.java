class Solution {
    public int[][] flipAndInvertImage(int[][] image)
    {
        int n=image.length;
        int[][] flipped= new int[n][n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                flipped[i][j] = image[i][n-1-j]==0?1:0;
            }
        }
        return flipped;
    }
}