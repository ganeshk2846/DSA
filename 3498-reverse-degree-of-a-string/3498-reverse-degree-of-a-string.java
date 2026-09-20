class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            sum = sum + (('z'-s.charAt(i)+1)*(i+1));
        }

        return sum;
    }
}