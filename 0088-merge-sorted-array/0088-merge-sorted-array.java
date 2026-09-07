class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ma[] = new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                ma[k++] = nums1[i++];
            }
            else{
                ma[k++] = nums2[j++];
            }
        }
        if(m==i){
            while(j<n){
                ma[k++] = nums2[j++];
            }
        }
        if(n==j){
            while(i<m){
                ma[k++] = nums1[i++];
            }
        }
        for(i=0;i<n+m;i++){
            nums1[i] = ma[i];
        }
    }
}