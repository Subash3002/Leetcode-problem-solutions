class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int ans=0;
        int minx=Math.max(ax1,bx1);
        int miny=Math.max(ay1,by1);
        int maxx=Math.min(ax2,bx2);
        int maxy=Math.min(ay2,by2);

        if(minx<maxx && miny<maxy){
            int intersectArea=(maxx-minx)*(maxy-miny);
            ans=Math.abs((ax2-ax1)*(ay2-ay1)) + Math.abs((bx2-bx1)*(by2-by1)) - intersectArea;
        }else{
            ans=Math.abs((ax2-ax1)*(ay2-ay1)) + Math.abs((bx2-bx1)*(by2-by1));

        }

        return ans;
    }
}