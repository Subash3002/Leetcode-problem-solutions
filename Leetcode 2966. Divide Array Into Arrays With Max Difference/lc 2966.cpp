#include <bits/stdc++.h>
class Solution {
public:
    vector<vector<int>> divideArray(vector<int>& nums, int k) {
        
        sort(nums.begin(),nums.end());
        vector<vector<int>> ans;
        
        for(int i=0;i<nums.size()-2;i+=3){
            if(nums[i+2]-nums[i]>k || nums[i+1]-nums[i]>k || nums[i+2]-nums[i+1]>k){
                return ans;
            }
        }
        vector<int> block;
        for(int i=0;i<nums.size();i++){
            block.push_back(nums[i]);
            if(block.size()==3){
                ans.push_back(block);
                block.clear();
            }
        }
        if(!block.empty()){
            ans.push_back(block);
        }
        
        return ans;
    }
};