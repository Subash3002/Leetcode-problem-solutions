class Solution {
    public String reverseWords(String s) {
        int n=s.length();
        String ans="";
        
        for(int i=0;i<n;i++){
            if(s.charAt(i)==' ')continue;
            String temp="";
            while(i<n && s.charAt(i)!=' '){
                temp+=s.charAt(i);
                i++;
            }
            ans=" "+temp+ans;
        }
        return ans.trim();
        
    }
}