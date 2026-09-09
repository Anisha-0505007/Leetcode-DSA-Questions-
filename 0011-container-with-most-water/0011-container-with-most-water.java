class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i = 0,j=n-1;
        int max = Integer.MIN_VALUE;
        while(i<j){
            int h = Math.min(height[j],height[i]);
            int w = j-i;
            int r = h*w;
            if(r>max){
                max = r;
            }
            if(height[i]>height[j]){j--;}
            else{i++;}
        }
        return max;

    }
}