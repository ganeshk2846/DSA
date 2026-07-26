class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int max,min,globalMax;
        max=min=globalMax=nums[0];

        for(int i=1;i<n;i++)
        {
            if(nums[i]<0)
            {
                int temp=max;
                max=min;
                min=temp;
            }
            max = Math.max(nums[i],nums[i]*max);
            min = Math.min(nums[i],nums[i]*min);

            globalMax = Math.max(max,globalMax);
        }
        return globalMax;
    }
}
