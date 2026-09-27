import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public String reverseParentheses(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == ')') {
                StringBuilder temp = new StringBuilder();
                while (!stack.isEmpty() && stack.peek() != '(') {
                    temp.append(stack.pop());
                }

                if (!stack.isEmpty()) {
                    stack.pop();
                }

                for (int j = 0; j < temp.length(); j++) {
                    stack.push(temp.charAt(j));
                }
            } else {
                stack.push(ch);
            }
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.reverse().toString();
    }
}
