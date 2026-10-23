class Solution {
    public int sortPermutation(int[] nums) {
        int n = nums.length;
        int maxK = -1;
        
        for (int i = 0; i < n; i++) {
            // If the element is not in its correct position
            if (nums[i] != i) {
                if (maxK == -1) {
                    maxK = nums[i];
                } else {
                    maxK &= nums[i];
                }
            }
        }
        
        // If all elements are already in their correct positions
        return maxK == -1 ? 0 : maxK;
    }
}