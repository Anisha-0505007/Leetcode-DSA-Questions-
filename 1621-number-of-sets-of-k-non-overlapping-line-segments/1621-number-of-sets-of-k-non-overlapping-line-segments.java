class Solution {
    public int numberOfSets(int n, int k) {
        long MOD = 1000000007;
        int N = n + k - 1;
        int R = 2 * k;
        
        if (R > N || R < 0) return 0;
        
    
        long numerator = 1;
        long denominator = 1;
        
        for (int i = 0; i < R; i++) {
            numerator = (numerator * (N - i)) % MOD;
            denominator = (denominator * (i + 1)) % MOD;
        }
        
        long invDenominator = power(denominator, MOD - 2, MOD);
        return (int) ((numerator * invDenominator) % MOD);
    }
    
    private long power(long base, long exp, long mod) {
        long res = 1;
        base %= mod;
        while (exp > 0) {
            if ((exp & 1) == 1) res = (res * base) % mod;
            base = (base * base) % mod;
            exp >>= 1;
        }
        return res;
    }
}