import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        if (pattern.length() != str.length) {
            return false;
        }
        
        HashMap<Character, String> map = new HashMap<>();
        int i = 0;
        
        for (char ch : pattern.toCharArray()) {
            String word = str[i];
            
            if (!map.containsKey(ch)) {
                if (map.containsValue(word)) {
                    return false;
                }
                map.put(ch, word); 
            } 
            else {
                if (!map.get(ch).equals(word)) {
                    return false;
                }
            }
            i++;
        }
        return true;
    }
}
