class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];

        // Count frequencies
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder left = new StringBuilder();
        String middle = "";

        // Build left half and find middle character
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 == 1) {
                middle = String.valueOf((char) ('a' + i));
            }

            for (int j = 0; j < freq[i] / 2; j++) {
                left.append((char) ('a' + i));
            }
        }

        StringBuilder ans = new StringBuilder();
        ans.append(left);
        ans.append(middle);
        ans.append(new StringBuilder(left).reverse());

        return ans.toString();
    }
}