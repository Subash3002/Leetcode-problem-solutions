class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length-1;
        int lm=0;
        int rm=0;

        int ans=0;

        while(l<=r){
            if(height[l]<=height[r]){
                if(height[l]<lm)ans+=lm-height[l];
                lm=Math.max(lm,height[l]);
                l++;
            }else{
                if(height[r]<rm)ans+=rm-height[r];
                rm=Math.max(rm,height[r]);
                r--;
            }
        }

        return ans;
    }
}