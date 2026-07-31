class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 1, LR = 0, maxLen = 0;
        int freq[] = new int[128];

        for (char ch : s.toCharArray()) {
            if (freq[ch] > LR) {
                LR = freq[ch];
            }
            freq[ch] = i;

            maxLen = Math.max(maxLen, i - LR);
            i++;
        }

        return maxLen;
    }
}
