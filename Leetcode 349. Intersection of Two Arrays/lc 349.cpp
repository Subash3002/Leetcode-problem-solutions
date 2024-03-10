class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        unordered_set<int> st;
        for(int i:nums1)st.insert(i);
        vector<int> res;
        for(int i:nums2){
            if(st.find(i)!=st.end()){
                res.push_back(i);
                st.erase(i);
            }
        }
       
        
        return res;
    }
};