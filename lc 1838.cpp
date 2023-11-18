class Solution {
public:
    int maxFrequency(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        int ans=1;
        int l=0,r=0;
        long long int total=0;

        for(r=0;r<nums.size();r++){

            total+=nums[r];

            if(l<r && nums[r]*1ll*(r-l+1)>total+k){
                total-=nums[l];
                l++;
            }

            ans=max(ans,r-l+1);
            
        }
        return ans;

    }
};