class Solution {
    public int maximumScore(int[] nums, int k) {
        int l=k;
        int r=k;
        int cur_min=nums[k];
        int sum=nums[k];

        while(l>0 || r<nums.length-1){
            int left=(l>0)?nums[l-1]:0;
            int right=(r<nums.length-1)?nums[r+1]:0;

            if(left>right){
                l--;
                cur_min=Math.min(cur_min,left);
            }else{
                r++;
                cur_min=Math.min(cur_min,right);
            }
            int cur_sum=cur_min*(r-l+1);
            sum=Math.max(sum,cur_sum);
        }
        return sum;
    }
}