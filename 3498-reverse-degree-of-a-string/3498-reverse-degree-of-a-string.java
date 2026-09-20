class Solution {
    public int reverseDegree(String s) {
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int revAlphaIndex = 26 - (c - 'a');
            int stringIndex = i + 1;
            total += revAlphaIndex * stringIndex;
        }
        return total;
    }
}