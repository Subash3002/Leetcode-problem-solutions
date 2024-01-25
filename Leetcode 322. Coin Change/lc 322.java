class Solution {
    int solve(int ind,int[] coins,int amount,int[][] dp){
        if(amount==0){
            return 0;
        }
        if(ind<0)return Integer.MAX_VALUE/2;
        if(dp[ind][amount]!=-1)return dp[ind][amount];
        int take=Integer.MAX_VALUE/2;
        if(coins[ind]<=amount){
            take=1+solve(ind,coins,amount-coins[ind],dp);
        }
        int notTake=solve(ind-1,coins,amount,dp);

        return dp[ind][amount]=Math.min(take,notTake);
    }
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[][] dp=new int[n][amount+1];
        for(int[] row:dp)Arrays.fill(row,-1);
        int ans=solve(n-1,coins,amount,dp);

        return ans<Integer.MAX_VALUE/2?ans:-1;
    }
}