class Solution {
    static int[][] dp;
    public boolean isMatch(String p, String s) {
        dp=new int[s.length()][p.length()];
        return solve(s.length()-1,p.length()-1,s,p);
    }

    boolean solve(int i,int j,String s,String p){
        if(i<0 && j<0)return true;
        if(i<0 && j>=0)return false;
        if(j<0 && i>=0){
            for(int c=i;c>=0;c--){
                if(s.charAt(c)!='*')return false;
            }
            return true;
        }
        if(dp[i][j]!=0)return(dp[i][j]==1)?true:false;
        if(s.charAt(i)==p.charAt(j) || s.charAt(i)=='?'){
            boolean res=solve(i-1,j-1,s,p);
            dp[i][j]=res?1:-1;
            return res;
        }

        if(s.charAt(i)=='*'){
            boolean res=solve(i-1,j,s,p) || solve(i,j-1,s,p);
            dp[i][j]=res?1:-1;
            return res;
        }
        dp[i][j]=-1;
        return false;
    }
}