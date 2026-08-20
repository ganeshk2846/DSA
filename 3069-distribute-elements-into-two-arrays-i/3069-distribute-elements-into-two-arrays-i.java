class Solution {
    public int[] resultArray(int[] nums) {
        int arr1[]=new int[nums.length];
        int arr2[]=new int[nums.length];
        int p=0,q=0;

        arr1[0]=nums[0];
        arr2[0]=nums[1];
        for(int i=2;i<nums.length;i++)
        {
            if(arr1[p]>arr2[q])
            {
                arr1[++p] = nums[i];
            }
            else
                arr2[++q] = nums[i];
        }
        for(int i=0;i<=q;i++)
        {
            arr1[++p] = arr2[i];
        }
        return arr1;
    }
}