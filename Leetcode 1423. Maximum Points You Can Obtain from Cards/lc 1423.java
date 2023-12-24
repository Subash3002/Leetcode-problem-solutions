class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int begTot=0;
        for(int i=0;i<k;i++){
            begTot+=cardPoints[i];
        }
        int ans=begTot;
        int beg=k-1;
        int last=n-1;
        int lastTot=0;
        while(beg>-1){
            begTot-=cardPoints[beg];
            lastTot+=cardPoints[last];
            ans=Math.max(ans,begTot+lastTot);
            beg--;
            last--;
        }
        return ans;
    }
}