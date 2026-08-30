class Solution:
    def minimumDifference(self, nums: List[int], k: int) -> int:
        min_diff = float('inf')
        nums.sort()
        for i in range(len(nums)-k+1):
            diff = nums[i+k-1] - nums[i]
            min_diff = min(min_diff , diff)
        return min_diff 
        