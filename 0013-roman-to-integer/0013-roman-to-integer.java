class Solution {
    private int getVal(char ch)
    {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
    public int romanToInt(String s) {
        if (s == null || s.length() == 0) return 0;

        int prev = getVal(s.charAt(s.length() - 1));
        int total = prev;

        for (int i = s.length() - 2; i >= 0; i--) {
            int cur = getVal(s.charAt(i));

            if (cur >= prev) {
                total += cur;
            } else {
                total -= cur;
            }

            prev = cur;
        }

        return total;
    }
}
