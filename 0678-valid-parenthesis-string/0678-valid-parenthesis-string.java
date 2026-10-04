class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> star = new Stack<>();

        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                st.push(i);   
            } 
            else if (s.charAt(i) == '*') {
                star.push(i);
            } 
            else { 
                if (!st.empty()) {
                    st.pop();
                } 
                else if (!star.empty()) {
                    star.pop();
                } 
                else {
                    return false;
                }
            }
        }

        // match remaining '(' with '*' acting as ')'
        while (!st.empty() && !star.empty()) {
            if (st.peek() < star.peek()) {
                st.pop();
                star.pop();
            } else {
                return false;
            }
        }

        return st.empty();
    }
}