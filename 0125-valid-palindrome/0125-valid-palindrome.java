class Solution {
    public boolean isPalindrome(String s) {
        int length = s.length();
        int ans = helper(s, 0, length - 1);
        if (ans == 1) {
            return true;
        } else {
            return false;
        }
    }

    public int helper(String s, int r, int l) {
    
        if (l <= r) {
            return 1;
        }

        char cLeft = s.charAt(r);
        char cRight = s.charAt(l);

        
        if (!Character.isLetterOrDigit(cLeft)) {
            return helper(s, r + 1, l);
        }
        
        if (!Character.isLetterOrDigit(cRight)) {
            return helper(s, r, l - 1);
        }

        
        if (Character.toLowerCase(cLeft) == Character.toLowerCase(cRight)) {
            return helper(s, r + 1, l - 1); 
        }

        return 0; 
    }
}