class Solution {
    public void solve(int open,int close,StringBuilder s,List<String> ans,int n){
        if(s.length()==n*2){
            ans.add(s.toString());
            return;
        }
        if(open<n){
            StringBuilder s1=new StringBuilder(s);
            s1.append('(');
            solve(open+1,close,s1,ans,n);
        }
        if(close<open){
            StringBuilder s1=new StringBuilder(s);
            s1.append(')');
            solve(open,close+1,s1,ans,n);
        } 
        

    }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        solve(0,0,new StringBuilder(),ans,n);
        return ans;
    }
}