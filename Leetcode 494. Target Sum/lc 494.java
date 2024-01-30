class Solution {
    int solve(int ind,int[] nums,int target,int[][] dp){
        
        if(ind==0){
            if(target==0 && nums[ind]==0)return 2;
            if(target==0 || nums[ind]==target)return 1;
            return 0;
        }
        if(dp[ind][target]!=-1)return dp[ind][target];
        int take=0;
        if(nums[ind]<=target){
            take=solve(ind-1,nums,target-nums[ind],dp);
        }
        int notTake=solve(ind-1,nums,target,dp);

        return dp[ind][target]=take+notTake;

    }
    public int findTargetSumWays(int[] nums, int target) {
        int n=nums.length;
        int sum=0;
        for(int i:nums)sum+=i;
        int diff=sum-target;
        if(diff%2!=0 || diff<0)return 0;
        int[][] dp=new int[n][(diff/2)+1];
        for(int[] row:dp)Arrays.fill(row,-1);
        return solve(n-1,nums,diff/2,dp);

        

    }
}