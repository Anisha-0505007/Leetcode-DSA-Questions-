class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        StringBuilder sn = new StringBuilder();

        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);

            if(!Character.isLetterOrDigit(ch)){
                continue;
            }

            sn.append(Character.toLowerCase(ch));
        }

        String cleaned = sn.toString();
        String reversed = sn.reverse().toString();

        return cleaned.equals(reversed);
    }
}