class Solution {
public:
    int minMoves(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int n=nums.size();
        int sum=0;
        int i=n-1;
        int cnt=1;
        while(i>0){
            int maxx=nums[i]+sum;
            int minn=nums[i-1]+sum;
            int curOps=cnt*(maxx-minn);
            sum+=curOps;
            cnt++;
            i--;
        }
        return sum;
    }
};