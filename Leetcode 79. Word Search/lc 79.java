class Solution {
    // boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        int row=board.length;
        int col=board[0].length;

        // visited=new boolean[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]==word.charAt(0) && search(i,j,board,0,word)){
                    return true;
                }
            }
        }
        return false;
    }

    boolean search(int i,int j,char[][] board,int index,String word){
    
        if(index==word.length())return true;

        if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j]!=word.charAt(index)){
            return false;
        }
        char temp=board[i][j];
        board[i][j]='*';
        //visited[i][j]=true;

        if(search(i+1,j,board,index+1,word) || search(i-1,j,board,index+1,word) || search(i,j-1,board,index+1,word) || search(i,j+1,board,index+1,word)){
            return true;
        }
        //visited[i][j]=false;
        board[i][j]=temp;

        return false;
    }


}