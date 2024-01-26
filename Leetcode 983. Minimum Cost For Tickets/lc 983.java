class Solution {
    int upperBound(int[] days,int tar){
        int s=0;
        int e=days.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(days[mid]<=tar)s=mid+1;
            else e=mid-1;
        }
        //System.out.println(s);
        return s;
        
    }
    int solve(int ind,int[] days,int[] costs,int[] dp){
        if(ind>=days.length)return 0;
        if(dp[days[ind]]!=-1)return dp[days[ind]];
        int pass1=solve(ind+1,days,costs,dp)+costs[0];
        //valid-=1;
        int pass2=solve(upperBound(days,days[ind]+6),days,costs,dp)+costs[1];
        //valid-=6;
        int pass3=solve(upperBound(days,days[ind]+29),days,costs,dp)+costs[2];
        //valid-=29;

        // int pass1 = solve(ind + 1, days, costs, dp) + costs[0];

        // int pass2Index = upperBound(days, days[ind] + 6);
        // int pass2 = (pass2Index < days.length) ? solve(pass2Index, days, costs, dp) + costs[1] : costs[1];

        // int pass3Index = upperBound(days, days[ind] + 29);
        // int pass3 = (pass3Index < days.length) ? solve(pass3Index, days, costs, dp) + costs[2] : costs[2];
        return dp[days[ind]]=Math.min(pass1,Math.min(pass2,pass3));

    }
    public int mincostTickets(int[] days, int[] costs) {
        Arrays.sort(days);
        int[] dp=new int[366];
        Arrays.fill(dp,-1);
        return solve(0,days,costs,dp);
    }
}