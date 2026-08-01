class Solution {
    public int lengthOfLastWord(String s) {
        String t=s.trim();
        String[] str=t.split(" ");
        return str[str.length-1].length();
    }
}