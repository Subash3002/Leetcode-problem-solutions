class Solution {
    static int MOD=1000000007;
    int solve(int m,int n,int startRow, int startColumn,int move,int maxMove,int[][][] dp){
        if(move>maxMove)return 0;
        if(startRow<0 || startRow==m || startColumn<0 || startColumn==n){
            return 1;
        }
        if(dp[startRow][startColumn][move]!=-1)return dp[startRow][startColumn][move];
        int up=solve(m,n,startRow-1,startColumn,move+1,maxMove,dp);
        int down=solve(m,n,startRow+1,startColumn,move+1,maxMove,dp);
        int left=solve(m,n,startRow,startColumn-1,move+1,maxMove,dp);
        int right=solve(m,n,startRow,startColumn+1,move+1,maxMove,dp);
        return dp[startRow][startColumn][move]=((up+down)%MOD + (left+right)%MOD)%MOD;
    }
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int[][][] dp=new int[m][n][maxMove+1];
        for(int[][] r:dp){
            for(int[] row:r)Arrays.fill(row,-1);
        }
        return solve(m,n,startRow,startColumn,0,maxMove,dp);
    }
}