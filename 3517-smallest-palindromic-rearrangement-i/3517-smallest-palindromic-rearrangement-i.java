class Solution {

    public String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public String smallestPalindrome(String s) {

        if (s.length() == 0 || s.length() == 1) {
            return s;
        }

        String news = "";
        int n = s.length();

        char[] chars = s.toCharArray();

        int[] freq = new int[26];

        // Count frequencies
        for (char c : chars) {
            freq[c - 'a']++;
        }

        String firstHalf = "";
        String middle = "";

        // Build first half
        for (int i = 0; i < 26; i++) {

            while (freq[i] >= 2) {
                firstHalf += (char) ('a' + i);
                freq[i] -= 2;
            }

            if (freq[i] == 1) {
                middle = String.valueOf((char) ('a' + i));
            }
        }

        if (n % 2 == 0) {
            news = firstHalf + reverse(firstHalf);
        } else {
            news = firstHalf + middle + reverse(firstHalf);
        }

        return news;
    }
}