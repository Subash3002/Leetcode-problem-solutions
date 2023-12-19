class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m=img.length;
        int n=img[0].length;
        int[][] ans=new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int top=Math.max(0,i-1);
                int bottom=Math.min(m-1,i+1);
                int left=Math.max(0,j-1);
                int right=Math.min(n-1,j+1);
                int total=0;
                int count=0;
                for(int row=top;row<=bottom;row++){
                    for(int col=left;col<=right;col++){
                        total+=img[row][col];
                        count++;
                    }
                }
                ans[i][j]=total/count;
            }
        }

        return ans;
    }
}