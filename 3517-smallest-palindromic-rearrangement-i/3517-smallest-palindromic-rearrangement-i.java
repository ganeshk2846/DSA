class Solution {
    public String smallestPalindrome(String s) {
        int freq[] = new int[26];
        int n = s.length();
        for(int i = 0; i < n; i++) {
            freq[s.charAt(i) - 'a']++;
        }
        
        char ans[] = new char[n];
        char odd_ch = 0;
        int index = 0;
        
        for(int i = 0; i < 26; i++) {
            int f = freq[i];
            if(f > 0) {
                if(f % 2 == 1) {
                    odd_ch = (char) ('a' + i);
                }
                
                for(int j = 0; j < f / 2; j++) {
                    ans[index++] = (char) ('a' + i);
                }
            }
        }
        if (n % 2 == 1) {
            ans[n / 2] = odd_ch;
        }

        int left = (n % 2 == 1) ? (n / 2) - 1 : (n / 2) - 1;
        int right = (n % 2 == 1) ? (n / 2) + 1 : (n / 2);
        
        while (left >= 0) {
            ans[right++] = ans[left--];
        }

        return new String(ans);
    }
}
