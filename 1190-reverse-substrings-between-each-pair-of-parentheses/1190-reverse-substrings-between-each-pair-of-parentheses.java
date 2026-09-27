class Solution {
    public String reverseParentheses(String s) {
        java.util.Deque<Integer> stack = new java.util.ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(sb.length());
            } else if (c == ')') {
                int j = stack.pop();
                StringBuilder reversed = new StringBuilder(sb.substring(j)).reverse();
                sb.replace(j, sb.length(), reversed.toString());
            } else {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}