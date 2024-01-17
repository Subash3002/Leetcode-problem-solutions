class Solution {
public:
    bool uniqueOccurrences(vector<int>& arr) {
        unordered_map<int,int> mp;
        unordered_set<int> st;
        for(int i:arr){
            mp[i]++;
        }

        for(auto [k,v]:mp){
            if(st.find(v)!=st.end())return false;
            st.insert(v);
        }

        return true;
        
    }
};