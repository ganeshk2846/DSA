
public class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

        Map<Integer, Integer> reservedRows = new HashMap<>();
        
        for (int[] seat : reservedSeats) {
            int row = seat[0];
            int col = seat[1];
            
            if (col >= 2 && col <= 9) {
                int currentMask = reservedRows.getOrDefault(row, 0);
                reservedRows.put(row, currentMask | (1 << (col - 2)));
            }
        }
        int leftMask = 15;
        int midMask = 60;
        int rightMask = 240;
        int maxGroups = n * 2;
        for (int mask : reservedRows.values()) {
            boolean leftFree = (mask & leftMask) == 0;
            boolean rightFree = (mask & rightMask) == 0;
            boolean midFree = (mask & midMask) == 0;
            
            if (leftFree && rightFree) {
                continue;
            } else if (leftFree || rightFree || midFree) {
                maxGroups -= 1;
            } else {
                maxGroups -= 2;
            }
        }
        
        return maxGroups;
    }
}
