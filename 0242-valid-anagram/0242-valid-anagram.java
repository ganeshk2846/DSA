class Solution {
    public boolean isAnagram(String s, String t) {
        int s_freq[]=new int[26];
        int t_freq[]=new int[26];

        for(char ch:s.toCharArray())
            s_freq[ch-'a']++;
        
        for(char ch:t.toCharArray())
            t_freq[ch-'a']++;

        for(int i=0;i<26;i++)
        {
            if(s_freq[i] != t_freq[i])
                return false;
        }

        return true;
    }
}