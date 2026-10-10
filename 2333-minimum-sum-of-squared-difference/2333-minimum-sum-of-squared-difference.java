class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        long k = (long) k1 + k2;
        
        int maxDiff = 0;
        int[] diffCount = new int[100001];
        long totalDiffSum = 0;
        
        for (int i = 0; i < n; i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            if (diff > 0) {
                diffCount[diff]++;
                if (diff > maxDiff) {
                    maxDiff = diff;
                }
            }
            totalDiffSum += diff;
        }
        
        if (totalDiffSum <= k) {
            return 0;
        }
        
        // Greedily reduce from largest difference to smallest
        for (int d = maxDiff; d > 0 && k > 0; d--) {
            if (diffCount[d] == 0) continue;
            
            long count = diffCount[d];
            if (k >= count) {
                k -= count;
                diffCount[d - 1] += count;
                diffCount[d] = 0;
            } else {
                diffCount[d] -= k;
                diffCount[d - 1] += k;
                k = 0;
            }
        }
        
        // Calculate total squared differences
        long result = 0;
        for (int d = 1; d <= maxDiff; d++) {
            if (diffCount[d] > 0) {
                result += (long) diffCount[d] * d * d;
            }
        }
        
        return result;
    }
}