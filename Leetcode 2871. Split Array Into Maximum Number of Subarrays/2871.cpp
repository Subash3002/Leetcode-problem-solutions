class Solution {
public:
    int maxSubarrays(vector<int>& nums) {
        int val=1048575;
        
        for(auto i:nums){
            val&=i;
        }
        if(val)return 1;
        
        val=1048575;
        int count=0;
        for(auto i:nums){
            val&=i;
            if(!val){
                count++;
                val=1048575;
            }
        }
        return count;
    }
};