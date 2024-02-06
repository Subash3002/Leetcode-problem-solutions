class Solution {
    int solve(int i,int j,String s,String t,int[][] dp){
        if(i<0 || j<0)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(s.charAt(i)==t.charAt(j)){
            return dp[i][j]=1+solve(i-1,j-1,s,t,dp);
        }else{
            return dp[i][j]=Math.max(solve(i-1,j,s,t,dp),solve(i,j-1,s,t,dp));
        }
    }
    public int minDistance(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();
        int[][] dp=new int[m][n];
        for(int[] row:dp)Arrays.fill(row,-1);
        int subseq=solve(m-1,n-1,word1,word2,dp);
        return (m+n-(2*subseq));
    }
}