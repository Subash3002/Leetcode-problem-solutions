class Solution {
public:
    vector<int> restoreArray(vector<vector<int>>& adjacentPairs) {
        vector<int> ans;
        unordered_map<int,vector<int>> graph;

        for(auto pair:adjacentPairs){
            graph[pair[0]].emplace_back(pair[1]);
            graph[pair[1]].emplace_back(pair[0]);
        }

        for(auto pair:graph){
            if(pair.second.size()==1){
                ans.emplace_back(pair.first);
                ans.emplace_back(pair.second[0]);
                break;
            }
        }

        while(ans.size()<graph.size()){
            int lastEle=ans[ans.size()-1];
            int secondLast=ans[ans.size()-2];
            vector<int> pair=graph[lastEle];
            if(pair.size()==1){
                ans.emplace_back(graph[lastEle][0]);
                
            }else{
                if(pair[0]!=secondLast){
                    ans.emplace_back(pair[0]);
                }else{
                    ans.emplace_back(pair[1]);
                }
            }
        }
        return ans;
    }
};