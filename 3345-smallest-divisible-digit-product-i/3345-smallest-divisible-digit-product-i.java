class Solution {
    public int digit(int num){
        int s=1;
        while(num>0){
            s*=num%10;
            num/=10;
        }
        return s;
    }
    public int smallestNumber(int n, int t) {
        int i = n;
        int product = 1;
        while(product%t !=0){
            product = digit(i);
            if (product%t==0){
                break;
            }
            i++;
        }
        return i;
    }
}