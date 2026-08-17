class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> st=new Stack<>();
        for(int i=0;i<tokens.length;i++)
        {
            String token=tokens[i];

            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/"))
            {
                int op1=st.pop();
                int op2=st.pop();

                switch(token)
                {
                    case "+": { st.push(op2 + op1); break; }
                    case "-": {st.push(op2 - op1); break; }
                    case "*": {st.push(op2 * op1); break; }
                    case "/": {st.push(op2 / op1); break; }
                }
            }
            else
                st.push(Integer.parseInt(token));
        }

        return st.pop();
        
    }
}