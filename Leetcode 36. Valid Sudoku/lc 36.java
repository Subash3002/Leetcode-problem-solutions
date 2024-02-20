class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char c=board[i][j];
                if(c=='.')continue;
                boolean chk=chckRow(i,j,board) && chckCol(i,j,board) && chckBox(i,j,board);
                if(!chk)return false;
            }
        }
        return true;
    }

    boolean chckRow(int i,int j,char[][] board){
        for(int col=0;col<j;col++){
            if(col==j)continue;
            if(board[i][col]==board[i][j])return false;
        }
        return true;
    }

    boolean chckCol(int i,int j,char[][] board){
        for(int row=0;row<i;row++){
            if(row==i)continue;
            if(board[row][j]==board[i][j])return false;
        }
        return true;
    }

    boolean chckBox(int i,int j,char[][] board){
        int startrow=(i/3)*3;
        int startcol=(j/3)*3;
        
        for(int row=startrow;row<startrow+3;row++){
            for(int col=startcol;col<startcol+3;col++){
                if(row==i && col==j)continue;
                if(board[row][col]==board[i][j])return false;
            }
        }

        return true;
    }
}