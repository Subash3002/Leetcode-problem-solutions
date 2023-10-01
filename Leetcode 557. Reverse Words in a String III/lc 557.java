class Solution {
    public String reverseWords(String s) {
        String[] ans=s.split(" ");
        String res="";
        for(int i=0;i<ans.length;i++){
            res+=(reverse(ans[i])+" ");
        }
        return res.trim();
    }

    String reverse(String s){
        StringBuilder sb=new StringBuilder(s);
        return sb.reverse().toString();
        
    }
}