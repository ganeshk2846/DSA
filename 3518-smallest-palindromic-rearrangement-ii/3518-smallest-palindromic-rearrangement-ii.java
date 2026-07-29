class Solution {
    public String smallestPalindrome(String s, int k) {
        int[] freq = new int[26];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            freq[s.charAt(i) - 'a']++;
        }
        
        // 1. Identify the single center character (if the string length is odd)
        char oddCh = 0;
        if (n % 2 == 1) {
            for (int i = 0; i < 26; i++) {
                if (freq[i] % 2 == 1) {
                    oddCh = (char) ('a' + i);
                    break;
                }
            }
        }

        // 2. Extract character frequencies for the first half
        int[] halfFreq = new int[26];
        int halfLen = n / 2;
        for (int i = 0; i < 26; i++) {
            halfFreq[i] = freq[i] / 2;
        }

        // 3. Build the first half greedily using multiset permutation rules
        StringBuilder firstHalf = new StringBuilder();
        long currentK = k;

        for (int i = 0; i < halfLen; i++) {
            boolean found = false;
            for (int c = 0; c < 26; c++) {
                if (halfFreq[c] == 0) continue;

                // Try placing character 'c' at the current index
                halfFreq[c]--;
                long ways = countPermutations(halfLen - 1 - i, halfFreq, currentK);
                
                if (currentK <= ways) {
                    firstHalf.append((char) ('a' + c));
                    found = true;
                    break; 
                } else {
                    currentK -= ways;
                    halfFreq[c]++; // Backtrack
                }
            }
            if (!found) return ""; 
        }

        // 4. Mirror and assemble the final palindromic string
        String first = firstHalf.toString();
        String middle = (n % 2 == 1) ? String.valueOf(oddCh) : "";
        String second = firstHalf.reverse().toString();

        return first + middle + second;
    }

    private long countPermutations(int totalLen, int[] freq, long maxK) {
        long ways = 1;
        int remainingSlots = totalLen;

        for (int count : freq) {
            if (count == 0) continue;
            
            // FIXED: Pass maxK to nCr to clamp internal combinations early
            long combinations = nCr(remainingSlots, count, maxK);
            
            // Check overflow before multiplying
            if (ways > maxK / combinations + 1) {
                return maxK + 1;
            }
            
            ways *= combinations;
            remainingSlots -= count;
            
            if (ways > maxK) return maxK + 1; 
        }
        return ways;
    }

    // FIXED: Added maxK parameter and clamping inside the loop to avoid overflow
    private long nCr(int n, int r, long maxK) {
        if (r > n) return 0;
        if (r == 0 || r == n) return 1;
        if (r > n - r) r = n - r;
        
        long res = 1;
        for (int i = 1; i <= r; i++) {
            if (res > maxK) return maxK + 1;
            res = res * (n - i + 1) / i;
        }
        return res;
    }
}
