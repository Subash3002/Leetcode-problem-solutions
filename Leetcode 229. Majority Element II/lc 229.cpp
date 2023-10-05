class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
        vector<int> ans;
        unordered_map<int,int> mp;
        for(int i=0;i<nums.size();i++){
            mp[nums[i]]++;
        }
        int min=nums.size()/3;

        for(auto i:mp){
            if(i.second>min){
                ans.emplace_back(i.first);
            }
        }
        return ans;
    }
};