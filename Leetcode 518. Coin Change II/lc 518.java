class Solution {
    int solve(int ind,int[] coins,int amt,int[][] dp){
        if(amt==0)return 1;
        if(ind<0)return 0;
        if(dp[ind][amt]!=-1)return dp[ind][amt];
        int take=0;
        if(coins[ind]<=amt){
            take=solve(ind,coins,amt-coins[ind],dp);
        }
        int notTake=solve(ind-1,coins,amt,dp);
        return dp[ind][amt]=take+notTake;
    }
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int[][] dp=new int[n+1][amount+1];
        //for(int[] row:dp)Arrays.fill(row,-1);
        //return solve(n-1,coins,amount,dp);

        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= amount; j++) {
                int take = (j - coins[i - 1] >= 0) ? dp[i][j - coins[i - 1]] : 0;
                int notTake = dp[i - 1][j];
                dp[i][j] = take + notTake;
            }
        }

        return dp[n][amount];

    }
}