class Solution {
public:
    int minOperations(vector<int>& nums) {
        int len=nums.size();

        set<int> st;
        for(int i=0;i<nums.size();i++){
            st.emplace(nums[i]);
        }
        vector<int> arr(st.size());
        copy(st.begin(),st.end(),arr.begin());

        int minn=INT_MAX;
        int r=0;

        for(int l=0;l<arr.size();l++){
            while(r<arr.size() && arr[r]<arr[l]+len){
                r++;
            }
            int window=r-l;
            minn=min(minn,len-window);
            if(r==arr.size()) break;
        }
        return minn;

    }
};