/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int low = 0, mid;
        int high = mountainArr.length() - 1; 

        while (low < high) 
        {
            mid = low + (high - low) / 2;
            if (mountainArr.get(mid) > mountainArr.get(mid + 1)) 
            { 
                high = mid;
            }
             else 
            {
                low = mid + 1;
            }
        }
        
        int peak_index = low;
        int curr;
        high = peak_index;
        low = 0;
        while (low <= high) 
        {
            mid = low + (high - low) / 2;
            curr = mountainArr.get(mid);
            if (curr == target) return mid;
            else if (curr > target) high = mid - 1;
            else low = mid + 1;
        }

        high = mountainArr.length() - 1;
        low = peak_index;
        while (low <= high) 
        {
            mid = low + (high - low) / 2;
            curr = mountainArr.get(mid);
            if (curr == target) return mid;
            else if (curr > target) low = mid + 1; 
            else high = mid - 1;
        }
        
        return -1;
    }
}
