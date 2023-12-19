class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        boolean fr=false;
        boolean fc=false;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    if(i==0)fc=true;
                    if(j==0)fr=true;
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if(fr){
            for(int i=0;i<n;i++){
                matrix[i][0]=0;
            }
        }
        if(fc){
            for(int j=0;j<m;j++){
                matrix[0][j]=0;
            }
        }
        


    }
}