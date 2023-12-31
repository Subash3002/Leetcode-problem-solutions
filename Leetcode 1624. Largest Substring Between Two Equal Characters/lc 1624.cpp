class Solution {
public:
    int maxLengthBetweenEqualCharacters(string s) {
        unordered_map<char,int> mp;
        int ans=-1;
        for(int i=0;i<s.length();i++){
            char c=s[i];
            if(mp.find(c)==mp.end()){
                mp[c]=i;
            }else{
                ans=max(ans,i-mp[c]-1);
            }
        }

        return ans;

    }
};