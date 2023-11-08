class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int colDiff=Math.abs(sx-fx);
        int rowDiff=Math.abs(sy-fy);
        int maxCount=Math.max(rowDiff,colDiff);
        if(maxCount==0 && t==1)return false;
        if(maxCount<=t){
            return true;
        }
        return false;
        
    }
}