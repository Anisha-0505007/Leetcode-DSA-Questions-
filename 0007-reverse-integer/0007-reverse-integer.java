class Solution {
    public int reverse(int x) {
        int rev = 0;
        int max = 2147483647;
        int min = -2147483648;
        int i = x;

        while (i != 0) {
            int digit = i % 10;

            
            if (rev > max/10 || (rev == max/10 && digit > 7)) {
                return 0;
            }
            if (rev < min/10 || (rev == min/10 && digit < -8)) {
                return 0;
            }

            rev = rev * 10 + digit;
            i /= 10;
        }

        return rev;
    }
}