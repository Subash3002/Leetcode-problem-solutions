class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& nums) {
        vector<int> ans;
        unordered_map<int,vector<int>> mp;
        int col=0;
        int n=nums.size();
        for(int i=0;i<n;i++){
            int cur=nums[i].size();
            col=max(col,cur);
            for(int j=0;j<nums[i].size();j++){
                
                mp[i+j].push_back(nums[i][j]);
                
            }
        }

        for(int i=0;i<=(n+col-2);i++){
            vector<int> ele=mp[i];
            for(int j=ele.size()-1;j>=0;j--){
                ans.push_back(ele[j]);
            }
        }

        return ans;

    }
};