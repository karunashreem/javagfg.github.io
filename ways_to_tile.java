class Solution {
    static Long numberOfWays(int N) {
        // code here
        long dp[] = new long[N+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= N; i++){
            dp[i] = (dp[i-1]+dp[i-2])%1000000007;
        }
        return dp[N];
    }
};
