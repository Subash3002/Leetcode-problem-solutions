class Solution {
    int MOD=1000000007;
    int solve(int n,int k,int[][] dp){
        if(k==0)return 1;
        if(n==0)return 0;
        if(dp[n][k]!=-1)return dp[n][k];
        int cnt=0;
        for(int i=1;i<=Math.min(n,k+1);i++){
            cnt=(cnt+solve(n-1,k-(i-1),dp))%MOD;
        }
        return dp[n][k]=cnt;
    }
    public int kInversePairs(int n, int k) {
        int[][] dp=new int[n+1][k+1];
        //for(int[] row:dp)Arrays.fill(row,-1);
        dp[0][0]=1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<=k;j++){
                if(j==0){
                    dp[i][j]=1;
                    continue;
                }

                // for(int x=1;x<=Math.min(i,j+1);x++){
                //     dp[i][j]=(dp[i][j]+dp[i-1][j-x+1])%MOD;
                // }

                dp[i][j]=(dp[i-1][j]+dp[i][j-1])%MOD;
                if(j>=i){
                    dp[i][j]=(dp[i][j]-dp[i-1][j-i]+MOD)%MOD;
                }
            }
        }
        return dp[n][k];


        //return solve(n,k,dp);
    }
}