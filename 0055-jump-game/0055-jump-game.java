class Solution {
    public boolean canJump(int[] nums) {
        int maxindexreach=0;

        for(int i=0;i<nums.length;i++)
        {
            if(i>maxindexreach)
                return false;
            
            maxindexreach = Math.max(maxindexreach,i+nums[i]);
        }

        return true;
    }
}