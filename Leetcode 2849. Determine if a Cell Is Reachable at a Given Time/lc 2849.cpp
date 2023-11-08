class Solution {
public:
    bool isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int rowDiff=abs(sx-fx);
        int colDiff=abs(sy-fy);
        int minOps=max(rowDiff,colDiff);
        if(t<minOps){
            return false;
        }else if(minOps==0 && t==1){
            return false;
        }else{
            return true;
        }
    }
};