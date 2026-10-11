class Solution {
    public int sumOfSquares(int[] nums) {
        int sum=0;
        int n=nums.length;
        int a=1;
        for(int i=0;i<n;i++)
        {
            if(n%a==0)
            {
                sum += Math.pow(nums[i],2); 
            }
            a++;
        }
        return sum;
    }
}