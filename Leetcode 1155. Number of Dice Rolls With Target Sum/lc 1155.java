class Solution {
    int MOD=1000000007;
    int[][] visited;
    public int numRollsToTarget(int n, int k, int target) {
        visited=new int[n+1][target+1];
        return solve(n,k,target);
    }

    int solve(int n,int k,int target){
        // if(n==0){
        //     return (target==0)?1:0;
        // }
        if (n == 0 && target == 0){
            return 1;
        }
        if (target < n || n * k < target) {
            return 0;
        }
        if(visited[n][target]!=0){
            return visited[n][target];
        }
        int ans=0;

        for(int i=1;i<=k;i++){
            if(target>=i){
                ans=(ans+solve(n-1,k,target-i))%MOD;
            }    
        }
        visited[n][target]=ans;
        return ans;
    }
}