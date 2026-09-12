class Solution {
    public int reverse(int x) {
        int reversed = 0;
        int int_max=Integer.MAX_VALUE;
        int int_min=Integer.MIN_VALUE;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            if (reversed > int_max / 10 || (reversed == int_max / 10 && digit > 7)) return 0;
            if (reversed < int_min / 10 || (reversed == int_min / 10 && digit < -8)) return 0;
            reversed = reversed * 10 + digit;
        }
        return reversed;       
    }
}