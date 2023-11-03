class Solution {
public:
    vector<string> buildArray(vector<int>& target, int n) {
        vector<string> ans;
        int ind=0;
        for(int i=1;i<=n && ind<target.size();i++){
            ans.push_back("Push");
            if(i<target[ind]){
                ans.push_back("Pop");
            }else{
                ind++;
            }
        }
        return ans;
    }
};