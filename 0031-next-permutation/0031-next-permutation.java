class Solution {
    public void nextPermutation(int[] nums) {
        int i,j,temp;
        int n=nums.length;
        i=n-1;
        while( i>0 && nums[i]<=nums[i-1])
            i--;
        if(i<=0)
        {
            i=0;
            j=n-1;
            while(i<j)
            {
                temp=nums[i];
                nums[i++]=nums[j];
                nums[j--]=temp;
            }   
        }
        else
        {
        i--;
        j=n-1;
        while(nums[j]<=nums[i])
            j--;

        temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        i++;
        j=n-1;
        while(i<j)
        {
            temp=nums[i];
            nums[i++]=nums[j];
            nums[j--]=temp;
        }
        }
    }
}