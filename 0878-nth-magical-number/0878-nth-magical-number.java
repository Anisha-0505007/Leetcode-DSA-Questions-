class Solution {
    static final long MOD = 1000000007;

    long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }
    public int nthMagicalNumber(int n, int a, int b) {
        long lcm = ((long)a/gcd(a,b)) * b;
        long low = 1;
        long high =  Math.min((long) a, (long) b)*n;
        long ans = 0;

        while(low <= high){
            long mid = low + (high - low)/2;
            long count = mid/a + mid/b - mid/lcm;

            if(count >= n){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return (int)(ans%MOD);
    }
}