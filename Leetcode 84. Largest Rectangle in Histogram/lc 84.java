class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int[] left=new int[n];
        
        left[0]=-1;
        for(int i=1;i<n;i++){
            int prev=i-1;
            while(prev>=0 && heights[prev]>=heights[i]){
                prev=left[prev];
            }
            left[i]=prev;
        }

        int[] right=new int[n];
        right[n-1]=n;
        for(int i=n-2;i>=0;i--){
            int next=i+1;
            while(next<=n-1 && heights[next]>=heights[i]){
                next=right[next];
            }
            right[i]=next;
        }


        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,heights[i]*(right[i]-left[i]-1));
        }

        return max;
        
    }
}