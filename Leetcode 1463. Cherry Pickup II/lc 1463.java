class Solution {
    int solve(int r,int c1,int c2,int[][] grid,int[][][] dp){
        if(c1==c2 || Math.min(c1,c2)<0 || Math.max(c1,c2)==grid[0].length)return 0;
        if(r==grid.length-1)return grid[r][c1]+grid[r][c2];

        if(dp[r][c1][c2]!=-1)return dp[r][c1][c2];

        int res=0;
        for(int i=-1;i<=1;i++){
            for(int j=-1;j<=1;j++){
                res=Math.max(res,solve(r+1,c1+i,c2+j,grid,dp));
            }
        }
        res+=grid[r][c1]+grid[r][c2];
        return dp[r][c1][c2]=res;
        
    }
    public int cherryPickup(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int[][][] dp=new int[r][c][c];
        // for(int[][] td:dp){
        //     for(int[] row:td)Arrays.fill(row,-1);
        // }
        //return solve(0,0,grid[0].length-1,grid,dp);


        for(int i=0;i<c;i++){
            for(int j=0;j<c;j++){
                if(i==j){
                    dp[r-1][i][j]=0;
                }else{
                    dp[r-1][i][j]=grid[r-1][i]+grid[r-1][j];
                }
            }
        }

        //dp[r-1][0][c-1]=grid[r-1][0]+grid[r-1][c-1];

        for(int i=r-2;i>=0;i--){
            for(int j=0;j<c;j++){
                for(int k=c-1;k>=0;k--){
                    if(j==k)continue;
                    int res=0;
                    for(int d1=-1;d1<=1;d1++){
                        for(int d2=-1;d2<=1;d2++){
                            if(Math.min(j+d1,k+d2)<0 || Math.max(j+d1,k+d2)==c || j+d1==k+d2)continue;
                            res=Math.max(res,dp[i+1][j+d1][k+d2]);
                        }
                    }
                    res+=grid[i][j]+grid[i][k];
                    dp[i][j][k]=res;
                }
            }
        }
        int ans=0;
        for(int j=0;j<c;j++){
            for(int k=0;k<c;k++){
                ans=Math.max(ans,dp[0][j][k]);
            }
        }
        
        return dp[0][0][c-1];
    }
}