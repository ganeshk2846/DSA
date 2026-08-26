class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();
        int i = 0, j = 0, ones = 0;
        String res = ""; 

        while (j < n) {
            if (s.charAt(j) == '1') {
                ones++;
            }


            while (ones == k) {
                if (s.charAt(i) == '1') {
                    String currentStr = s.substring(i, j + 1);

                    if (res.isEmpty() || currentStr.length() < res.length() || 
                       (currentStr.length() == res.length() && currentStr.compareTo(res) < 0)) {
                        res = currentStr;
                    }
                    
                    ones--; 
                }
                i++; 
            }
            j++;
        }

        return res;
    }
}
