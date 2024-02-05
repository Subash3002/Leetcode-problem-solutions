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
    public int minInsertions(String s) {
        int n=s.length();
        StringBuilder sb=new StringBuilder(s);
        String t=sb.reverse().toString();
        int[][] dp=new int[n][n];
        for(int[] row:dp)Arrays.fill(row,-1);
        int pLen=solve(n-1,n-1,s,t,dp);
        return n-pLen;
    }

}