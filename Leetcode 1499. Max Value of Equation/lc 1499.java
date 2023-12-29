class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        
        int n=points.length;
        int i=0;
        int lastKnown=1;
        int MaxVal=Integer.MIN_VALUE;
        while(i<n){
            if(lastKnown<=i){
                lastKnown=i+1;
            }
            for(int j=lastKnown;j<n;j++){
                if(points[j][0]-points[i][0]>k) break;
                int curVal=points[j][0]-points[i][0]+points[i][1]+points[j][1];
                if(curVal>MaxVal){
                    MaxVal=curVal;
                    lastKnown=j;
                }

            }
            i++;
        }
        return MaxVal;
    }
}