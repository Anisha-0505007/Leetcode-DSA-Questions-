class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int max = nums[nums.length-1];
        int max1 = nums[nums.length-2];

        return (max-1)*(max1-1);
    }
}