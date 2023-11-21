class Solution {
public:
    const int MOD=1e9+7;
    int rev(int n){
        int num=0;
        while(n>0){
            int dig=n%10;
            num=num*10+dig;
            n/=10;
        }
        return num;
    }
    int countNicePairs(vector<int>& nums) {
        int ans=0;
        unordered_map<int,int> mp;

        for(auto e:nums){
            int val=e-rev(e);
            ans=(ans+mp[val])%MOD;
            mp[val]++;
        }

        return ans;
    }
};