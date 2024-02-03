class Solution {
    int solve(int ind,int k,int[] arr,int[] dp){

        if(ind>=arr.length)return 0;
        if(dp[ind]!=-1)return dp[ind];
        int curMax=0;
        int ans=0;
        for(int i=ind;i<Math.min(arr.length,ind+k);i++){
            curMax=Math.max(curMax,arr[i]);
            int subarr_size=i-ind+1;
            ans=Math.max(ans,subarr_size*curMax+solve(i+1,k,arr,dp));
            
        }
        return dp[ind]=ans;
    
    }

    public int maxSumAfterPartitioning(int[] arr, int k) {
        int[] dp=new int[arr.length+1];
        // Arrays.fill(dp,-1);
        // return solve(0,k,arr,dp);

        int n=arr.length;

        for(int i=n-1;i>=0;i--){
            int maxx=0;
            int ans=0;
            for(int j=i;j<Math.min(n,i+k);j++){
                maxx=Math.max(maxx,arr[j]);
                int subarr_size=j-i+1;
                ans=Math.max(ans,subarr_size*maxx+dp[j+1]);
            }
            dp[i]=ans;
        }
        return dp[0];
    }
}