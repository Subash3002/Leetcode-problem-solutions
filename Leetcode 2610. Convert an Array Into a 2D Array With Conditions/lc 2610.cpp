class Solution {
public:
    vector<vector<int>> findMatrix(vector<int>& nums) {
        unordered_map<int,int> mp;
        int cnt=0;
        for(int i:nums){
            mp[i]++;
            cnt=max(cnt,mp[i]);
        }
        vector<vector<int>> arr(cnt);

        for(auto e:mp){
            int key=e.first;
            int freq=e.second;
            for(int i=0;i<freq;i++){
                arr[i].push_back(key);
            }
        }
        return arr;
    }
};