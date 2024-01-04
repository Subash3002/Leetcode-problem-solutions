class Solution {
    int[][] dp;
    int solve(int i,int j,String s,String t){
        if(j==t.length())return 1;
        if(i==s.length())return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt(i)==t.charAt(j)){
            dp[i][j]= solve(i+1,j+1,s,t) + solve(i+1,j,s,t);
            return dp[i][j];
        }
        return dp[i][j]=solve(i+1,j,s,t);
    }

    public int numDistinct(String s, String t) {
        dp=new int[s.length()][t.length()];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        int ans=solve(0,0,s,t);
        return ans;
    }
}