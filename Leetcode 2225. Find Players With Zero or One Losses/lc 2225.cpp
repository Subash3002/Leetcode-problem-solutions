class Solution {
public:
    vector<vector<int>> findWinners(vector<vector<int>>& matches) {
        map<int,int> wnr;
        map<int,int> lsr;

        for(auto i:matches){
            wnr[i[0]]++;
            lsr[i[1]]++;
        }

        vector<vector<int>> ans(2);

        for(auto [k,v]:wnr){
            if(lsr.find(k)==lsr.end()){
                ans[0].push_back(k);
            }
        }

        for(auto [k,v]:lsr){
            if(v==1){
                ans[1].push_back(k);
            }
        }

        return ans;

    }
};