class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i:nums)sum+=i;
        if((sum&1)!=0)return false;
        int n=nums.length;
        int pSum=sum/2;
        boolean[][] dp=new boolean[n][pSum+1];

        for(int i=0;i<n;i++)dp[i][0]=true;
        if(nums[0]<=pSum)dp[0][nums[0]]=true;
        for(int i=1;i<n;i++){
            for(int k=1;k<=pSum;k++){
                boolean taken=false;
                if(nums[i]<=k)taken=dp[i-1][k-nums[i]];
                boolean notTaken=dp[i-1][k];
                dp[i][k]= taken || notTaken;
            }
        }
        return dp[n-1][pSum];
    }
}