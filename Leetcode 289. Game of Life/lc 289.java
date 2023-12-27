class Solution {
    public void gameOfLife(int[][] board) {
        
        int m=board.length;
        int n=board[0].length;
        //int[][] arr=new int[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int sum=0;
                
                if(i>0){
                    sum+=(board[i-1][j]>0)?1:0;
                    
                }
                if(i<m-1){
                    sum+=(board[i+1][j]>0)?1:0;
                    
                }
                if(j>0){
                    sum+=(board[i][j-1]>0)?1:0;
                    
                }
                if(j<n-1){
                    sum+=(board[i][j+1]>0)?1:0;
                    
                }
                if(i>0 && j>0){
                    sum+=(board[i-1][j-1]>0)?1:0;
                }
                if(i<m-1 && j<n-1){
                    sum+=(board[i+1][j+1]>0)?1:0;
                    
                }
                if(i>0 && j<n-1){
                    sum+=(board[i-1][j+1]>0)?1:0;
                    
                }
                if(i<m-1 && j>0){
                    sum+=(board[i+1][j-1]>0 )?1:0;
                    
                }
               

                if(board[i][j]==1 && sum<2){
                    board[i][j]=2;
                }
                else if(board[i][j]==1 && sum>3){
                    board[i][j]=2;
                }else if(board[i][j]==0 && sum==3){
                    board[i][j]=-1;
                }

               
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==-1){
                    board[i][j]=1;
                }else if(board[i][j]==2){
                    board[i][j]=0;
                }
            }
        }
    }
}