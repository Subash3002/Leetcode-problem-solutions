class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[] onesRow=new int[m];
        int[] onesCol=new int[n];

        int[][] ans=new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                onesRow[i]+=grid[i][j];
                onesCol[j]+=grid[i][j];
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[i][j]=onesRow[i]+onesCol[j]-(n-onesRow[i])-(m-onesCol[j]);
            }
        }

        return ans;

    }
}