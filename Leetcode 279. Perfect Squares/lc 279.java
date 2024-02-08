class Solution {
    // int solve(int ind,int n,List<Integer> ps,int[][] dp){
    //     if(n==0)return 0;
    //     if(dp[n]!=-1)return dp[n];
    //     int ans=100004;
    //     for(int i=0;i<ps.size();i++){
    //         if(ps.get(i)>n)break;
    //         ans=Math.min(ans,solve(n-ps.get(i),ps,dp)+1);
    //     }
    //     return dp[n]=ans;
    // }

    int solve2(int ind,int rem,List<Integer> arr,int[][] dp){
        if(rem<0)return 100005;
        if(ind==arr.size())return (rem==0)?0:100005;
        if(dp[ind][rem]!=-1)return dp[ind][rem];
        

        return dp[ind][rem]=Math.min(solve2(ind,rem-arr.get(ind),arr,dp)+1,solve2(ind+1,rem,arr,dp));
        
    }
    public int numSquares(int n) {
        int sqr=(int)Math.sqrt(n);
        if(sqr*sqr == n)return 1;
        List<Integer> ps=new ArrayList<>();
        ps.add(1);
        for(int i=2;i<n;i++){
            sqr=(int)Math.sqrt(i);
            if(sqr*sqr == i)ps.add(i);
        }

        //System.out.println(ps);
        int sum=n;
        int[][] dp=new int[ps.size()][sum+1];
        for(int[] row:dp)Arrays.fill(row,-1);
        return solve2(0,n,ps,dp);
        
    }
}