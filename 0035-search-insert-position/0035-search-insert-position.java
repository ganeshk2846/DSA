class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0,n=nums.length;
        int high=n-1,mid;

        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(target<=nums[mid])
                high=mid-1;
            else
                low=mid+1;
        }
        return low;
    }
}