class Solution {
    //static int[][] dp;
    // int solve(int i,int j,String s,String t){
    //     //System.out.println(i+" "+j);
    //     if(j==0)return i;
    //     if(i==0)return j;
    //     if(dp[i][j]!=-1)return dp[i][j];
    //     int take=10000;
    //     if(s.charAt(i-1)==t.charAt(j-1)){
    //         take=solve(i-1,j-1,s,t);
    //     }
    //     int delete=1+solve(i-1,j,s,t);
    //     int insert=1+solve(i,j-1,s,t);
    //     int replace=1+solve(i-1,j-1,s,t);
    //     int notTake=Math.min(delete,Math.min(insert,replace));

    //     return dp[i][j]=Math.min(take,notTake);
    // }
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int[][] dp=new int[n+1][m+1];
        //for(int[] row:dp)Arrays.fill(row,-1);
        //return solve(n,m,word1,word2);

        for(int i=0;i<=n;i++)dp[i][0]=i;
        for(int j=0;j<=m;j++)dp[0][j]=j;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                int take=10000;
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    take=dp[i-1][j-1];
                }
                int delete=1+dp[i-1][j];
                int insert=1+dp[i][j-1];
                int replace=1+dp[i-1][j-1];
                int notTake=Math.min(delete,Math.min(insert,replace));

                dp[i][j]=Math.min(take,notTake);
            }
        }

        return dp[n][m];
    }
}