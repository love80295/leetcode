class Solution {

    static int MOD = 1000000007;
    Integer[][] dp;

    public int numRollsToTarget(int n, int k, int target) {
        dp = new Integer[n+1][target+1];
        return solve(n, k, target);
    }

    int solve(int diceLeft, int k, int target){

        if(diceLeft == 0 && target == 0) return 1;
        if(diceLeft == 0 || target < 0) return 0;

        if(dp[diceLeft][target] != null)
            return dp[diceLeft][target];

        int count = 0;

        for(int i = 1; i <= k; i++){
            count = (count + solve(diceLeft - 1, k, target - i)) % MOD;
        }

        return dp[diceLeft][target] = count;
    }
}