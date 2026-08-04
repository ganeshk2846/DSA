class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);

        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length-1;i++)
        {
            int t=nums[i];
            while(t+1<nums[i+1])
            {
                ans.add(t+1);
                t++;
            }
        }
        return ans; 
    }
}