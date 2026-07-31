class Solution {
    public int minimumPushes(String word) {
         int[] frequency = new int[26];
        for (char c : word.toCharArray()) {
            frequency[c - 'a']++;
        }
        
        Arrays.sort(frequency);
        int total=0;
        int count=0;
        for(int i=25;i>=0;i--)
        {
            total += frequency[i]*((count/8)+1);
            count++;
        }
        return total;
    }
}