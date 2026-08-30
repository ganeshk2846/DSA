class Solution {
    public int minimumDeletions(int[] nums) {
        int max=0,min=0;
        int n=nums.length;
        for(int i=1;i<n;i++)
        {
            if(nums[min]>nums[i])
                min=i;
            if(nums[max]<nums[i])
                max=i;
        }
        int a=Math.min(min,max);
        int b=Math.max(min,max);
        int count;

        count = (a-0+1)+(n-b);
        count = count > n-a? n-a : count;
        count = count > b-0+1?b-0+1 : count;

        return count;
    }
}