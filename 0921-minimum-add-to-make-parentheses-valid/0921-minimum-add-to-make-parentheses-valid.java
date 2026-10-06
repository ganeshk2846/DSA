class Solution {
    public int minAddToMakeValid(String s) {
        int count=0;
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray())
        {
            if(ch=='(')
                st.push(ch);
            else
            {
                if(!st.isEmpty())
                    st.pop();
                else
                    count++;
            }
        }
        while(!st.isEmpty())
        {
             count++;
             st.pop();
        }   
        return count;
    }
}