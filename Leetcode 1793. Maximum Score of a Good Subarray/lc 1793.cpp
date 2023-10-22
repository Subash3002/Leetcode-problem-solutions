class Solution {
public:
    vector<int> NSL(vector<int> &nums){
        stack<int> s;
        vector<int> res(nums.size());

        for(int i=0;i<nums.size();i++){
            while(!s.empty() && nums[s.top()]>=nums[i]){
                s.pop();
            }
            if(s.empty()){
                res[i]=-1;
            }else{
                res[i]=s.top();
            }
            s.push(i);
        }
        return res;

    }

    vector<int> NSR(vector<int> &nums){
        stack<int> s;
        vector<int> res(nums.size());
        for(int i=nums.size()-1;i>=0;i--){
            while(!s.empty() && nums[s.top()]>=nums[i]){
                s.pop();
            }
            if(s.empty()){
                res[i]=nums.size();
            }else{
                res[i]=s.top();
            }
            s.push(i);
        }
        return res;

    }
    int maximumScore(vector<int>& nums, int k) {
        vector<int> nsl=NSL(nums);
        // for(auto i:nsl)cout<<i<<" ";
        // cout<<endl;
        vector<int> nsr=NSR(nums);
        // for(auto i:nsr)cout<<i<<" ";
        // cout<<endl;

        int max_sum=0;
        for(int i=0;i<nums.size();i++){
            int left=nsl[i]+1;
            int right=nsr[i]-1;
            if(left<=k && right>=k){
                int cur_sum=nums[i]*(right-left+1);
                max_sum=max(max_sum,cur_sum);
            }
            
        }
        return max_sum;
    }
};