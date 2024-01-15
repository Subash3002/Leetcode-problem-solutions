class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int[][] dp=new int[n][n];
        for(int[] row:dp)Arrays.fill(row,-1);

        for(int i=0;i<=n-1;i++){
            dp[n-1][i]=triangle.get(n-1).get(i);
        }

        for(int i=n-2;i>=0;i--){
            for(int j=0;j<=i;j++){
                int down=dp[i+1][j];
                int downRight=dp[i+1][j+1];
                dp[i][j]=Math.min(down,downRight)+triangle.get(i).get(j);
            }
        }
        return dp[0][0];
    }
}