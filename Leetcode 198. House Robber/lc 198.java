class Solution {
    int solve(int n,int[] nums,int[] dp){
        if(n==0)return nums[0];
        if(n<0)return 0;
        if(dp[n]!=-1)return dp[n];
        int l=solve(n-1,nums,dp);
        int r=solve(n-2,nums,dp)+nums[n];
        return dp[n]=Math.max(l,r);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        int prev=nums[0];
        int prev2=0;
        for(int i=1;i<n;i++){
            int l=prev;
            int r=nums[i];
            if(i>1)r=nums[i]+prev2;
            int cur=Math.max(l,r);
            prev2=prev;
            prev=cur;
        }
        return prev;
        
    }
}