class Solution {
    // int solve(int s,int n,int[] nums,int[] dp){
    //     if(s==n)return nums[s];
    //     if(n<s)return 0;

    //     if(dp[n]!=-1)return dp[n];

    //     return dp[n]=Math.max(solve(s,n-1,nums,dp),solve(s,n-2,nums,dp)+nums[n]);
    // }
    int solve(int s,int n,int[] nums){
        int[] dp=new int[n];
        dp[s]=nums[s];
        for(int i=s+1;i<n;i++){
            if(i>1){
                dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
            }else{
                dp[i]=Math.max(dp[i-1],nums[i]);
            }
        }
        return dp[n-1];
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        int f=solve(0,n-1,nums);
        int s=solve(1,n,nums);
        return Math.max(f,s);
    }
}