class Solution {
public:
    string findPdrm(string s,int l,int r){
        while(l>-1 && r<s.length() && s[l]==s[r]){
            l--;
            r++;
        }
        return s.substr(l+1,r-l-1);
    }
    string longestPalindrome(string s) {
        string ans="";
        for(int i=0;i<s.length();i++){
            //find for odd
            string s1=findPdrm(s,i,i);
            //find for even
            string s2=findPdrm(s,i,i+1);

            if(ans.length()<max(s1.length(),s2.length())){
                if(s1.length()>s2.length()){
                    ans=s1;
                }else{
                    ans=s2;
                }
            }
        }
        return ans;
    }
};