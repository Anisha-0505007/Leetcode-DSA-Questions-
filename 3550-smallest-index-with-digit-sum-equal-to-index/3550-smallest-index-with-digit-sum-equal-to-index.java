class Solution {
    public int sum(int n){
        int s=0;
        int i = n;
        while (i>0){
            s += i%10 ;
            i/=10;
        }
        return s;
    }
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int n = nums[i];
            if (sum(n) == i){
                return i;
            }
        }
        return -1;
    }
}