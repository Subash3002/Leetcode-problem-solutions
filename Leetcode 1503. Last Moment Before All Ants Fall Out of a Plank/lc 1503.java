class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int maxTime=0;
        for(int i:left){
            maxTime=Math.max(maxTime,i);
        }
        for(int i:right){
            maxTime=Math.max(maxTime,n-i);
        }
        return maxTime;
    }
}