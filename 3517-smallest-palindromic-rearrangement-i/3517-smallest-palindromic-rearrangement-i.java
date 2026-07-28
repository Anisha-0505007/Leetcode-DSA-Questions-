class Solution {
    public String smallestPalindrome(String s) {

        int[] freq = new int[26];

        // Count frequency of each character
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder left = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        char middle = '\0';

        // Build left half and find middle character
        for (int i = 0; i < 26; i++) {

            // Add freq/2 copies to the left half
            for (int j = 0; j < freq[i] / 2; j++) {
                left.append((char) ('a' + i));
            }

            // Odd frequency character goes to the middle
            if (freq[i] % 2 == 1) {
                middle = (char) ('a' + i);
            }
        }

        ans.append(left);

        if (middle != '\0') {
            ans.append(middle);
        }

        ans.append(new StringBuilder(left).reverse());

        return ans.toString();
    }
}