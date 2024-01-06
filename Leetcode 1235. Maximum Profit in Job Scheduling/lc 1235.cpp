class Solution {
public:
    int dp[50001];
    int maxProfit(int ind,vector<int>& startTime,vector<vector<int>>& jobs){
        if(ind==startTime.size()){
            return 0;
        }
        if(dp[ind]!=-1) return dp[ind];
        int nxtInd=lower_bound(startTime.begin(),startTime.end(),jobs[ind][1])-startTime.begin();
        return dp[ind]=max(maxProfit(ind+1,startTime,jobs),jobs[ind][2]+maxProfit(nxtInd,startTime,jobs));
    }
    int jobScheduling(vector<int>& startTime, vector<int>& endTime, vector<int>& profit) {
        int n=startTime.size();
        memset(dp,-1,sizeof(dp));
        vector<vector<int>> jobs;

        for(int i=0;i<n;i++){
            jobs.push_back({startTime[i],endTime[i],profit[i]});
        }

        sort(jobs.begin(),jobs.end());

        for(int i=0;i<n;i++){
            startTime[i]=jobs[i][0];
        }

        return maxProfit(0,startTime,jobs);
    }
};