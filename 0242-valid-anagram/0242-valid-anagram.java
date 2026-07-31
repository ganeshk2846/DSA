class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
            return false;
            
        int s_freq[]=new int[26];

        for(char ch:s.toCharArray())
            s_freq[ch-'a']++;
        
        for(char ch:t.toCharArray())
        {
            if(s_freq[ch-'a'] <=0)
            return false;

            s_freq[ch-'a']--;

        }
        return true;
    }
}