class Solution {
public:
    bool backspaceCompare(string s, string t) {
        int i=s.size()-1,j=t.size()-1;

        while(true){
            int cnt=0;

            while(i>=0 && (s[i]=='#' || cnt>0)){
                if(s[i]=='#')cnt++;
                else cnt--;
                i--;
            }
            cnt=0;

            while(j>=0 && (t[j]=='#' || cnt>0)){
                if(t[j]=='#')cnt++;
                else cnt--;
                j--;
            }

            if(i<0 && j<0) return true;
            if(i<0 || j<0)return false;
            if(s[i]!=t[j])return false;
            i--;
            j--;
        }
        return false;
    }
};