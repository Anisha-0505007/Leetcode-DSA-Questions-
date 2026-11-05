public class Solution {
    public int titleToNumber(String A) {
        StringBuilder sb = new StringBuilder();
        sb.append(A);
        sb.reverse();
        int n = 0;
        int i=0;
        int l = sb.length();
        while(l>0){
           char d = sb.charAt(i);
           int num = (int)d-64;
           n+= ((int)Math.pow(26,i)*num);
           i++;
           l--;
        }
        return n;
    }
    
}
