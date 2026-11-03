class Solution {
    public int consecutiveNumbersSum(int n) {
        int c = 1;
        for(int i=2;;i++){
           int x = n - (i*(i-1)/2);
           if(x==0){
               break;
           }
           if(x%i == 0){
              c++;
           }
           if(x/i == 0){
               break;
           }
           
        }
        return c;
    }
}