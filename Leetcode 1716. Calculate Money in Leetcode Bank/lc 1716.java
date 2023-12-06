class Solution {
    public int totalMoney(int n) {
        int ans=0;
        int mon=n/7;

        for(int i=1;i<=mon;i++){
            ans+=(i*7)+21;
        }

        for(int i=0;i<n%7;i++){
            ans+=mon+1+i;
        }

        return ans;
    }
}