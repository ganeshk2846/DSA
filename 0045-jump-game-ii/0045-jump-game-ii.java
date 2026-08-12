class Solution {
    public int jump(int[] nums) {
        int farthest=0,count=0,currentEnd=0;

        for(int i=0;i<nums.length-1;i++)
        {
            farthest = Math.max(farthest,i+nums[i]);
            
            if(i==currentEnd)
            {
                count++;
                currentEnd = farthest;
            }
        }

        return count;
    }
}