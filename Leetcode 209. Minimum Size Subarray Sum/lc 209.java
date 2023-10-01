class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min=nums.length+1;

        int l=0;
        int cur=0;

        for(int r=0;r<nums.length;r++){
            cur+=nums[r];
            while(cur>=target){
                min=Math.min(min,r-l+1);
                cur-=nums[l++];
            }
        }
        return min>nums.length?0:min;
    }
}