class Solution {
    public boolean uniformArray(int[] nums1) {
        int min=nums1[0];
        boolean even= nums1[0]%2==0;
        for(int i=1;i<nums1.length;i++)
        {
            min = min>nums1[i]?nums1[i]:min;

            if(even)
            {
                if(nums1[i]%2!=0)
                    even=false;
            }
        }
        if(even)
        return true;

        if(min %2 !=0)
            return true;
        
        return false;
    }
}