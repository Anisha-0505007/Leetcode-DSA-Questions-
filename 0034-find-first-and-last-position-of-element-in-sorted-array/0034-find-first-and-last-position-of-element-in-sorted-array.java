class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int p=-1,q=-1;
        int l=0,r=n-1;

        while(l<=r){
           int mid = l+(r-l)/2;
           if(nums[mid]==target){
            p=mid;
            r=mid-1;
           } 
           else if(nums[mid]<target){
            l=mid+1;
           }
           else{
            r=mid-1;
           }
        }
        l=0;
        r=n-1;
        while(l<=r){
           int mid = l+(r-l)/2;
           if(nums[mid]==target){
            q=mid;
            l=mid+1;
           } 
           else if(nums[mid]<target){
            l=mid+1;
           }
           else{
            r=mid-1;
           }
        }
        return new int[]{p,q};

    }
}