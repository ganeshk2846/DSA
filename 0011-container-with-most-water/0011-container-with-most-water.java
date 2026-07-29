class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int curArea=0,maxArea=0;
        while(left<right)
        {
            curArea= Math.min(height[left],height[right]) * (right-left);

            maxArea=Math.max(curArea,maxArea);

            if(height[left]<=height[right])
                left++;
            else
                right--;
        }
        return maxArea;
    }
}