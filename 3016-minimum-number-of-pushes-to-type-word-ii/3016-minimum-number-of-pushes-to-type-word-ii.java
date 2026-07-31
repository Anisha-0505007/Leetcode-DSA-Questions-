

class Solution {
    public int minimumPushes(String word) {
        // Step 1- Count the frequency of each character
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        
        // Step 2- Sort the frequencies in ascending order
        Arrays.sort(freq);
        
        int totalPushes = 0;
        int position = 0;
        
        // Step 3- Iterate from highest frequency to lowest
        for (int i = 25; i >= 0; i--) {
            if (freq[i] == 0) {
                break; 
            }
            
            
            int pushCost = (position / 8) + 1;
            totalPushes += freq[i] * pushCost;
            position++;
        }
        
        return totalPushes;
    }
}