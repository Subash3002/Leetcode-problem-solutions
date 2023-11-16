class Solution {
public:
    string findDifferentBinaryString(vector<string>& nums) {
        string ans;
        for(int i=0;i<nums.size();i++){
            char c=nums[i][i];
            c=(c=='0')?'1':'0';
            ans.push_back(c);
        }
        return ans;
    }
};