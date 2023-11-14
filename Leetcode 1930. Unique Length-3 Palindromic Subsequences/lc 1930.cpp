class Solution {
public:
    int countPalindromicSubsequence(string s) {
        int ans=0;
        unordered_map<char,pair<int,int>> mp;

        for(char c='a';c<='z';c++){
            mp[c]={-1,-1};
        }

        for(int i=0;i<s.length();i++){
            if(mp[s[i]].first==-1){
                mp[s[i]].first=i;
            }else{
                mp[s[i]].second=i;
            }
        }

        for(auto m:mp){
            int sta=m.second.first;
            int e=m.second.second;

            if(e!=-1){
                unordered_set<char> st;
                for(int i=sta+1;i<e;i++){
                    st.insert(s[i]);
                }
                ans+=st.size();
            }
            
        }
        
        return ans;
    }
};