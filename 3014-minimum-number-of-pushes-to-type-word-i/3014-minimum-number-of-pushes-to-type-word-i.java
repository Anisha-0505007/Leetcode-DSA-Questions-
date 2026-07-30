class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int totalPushes = 0;
        
        for (int i = 0; i < n; i++) {
            // (i / 8) + 1 gives the number of pushes required for the current character
            totalPushes += (i / 8) + 1;
        }
        
        return totalPushes;
    }
}