class Solution {
    public boolean isMonotonic(int[] nums) {
        int direction=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]) continue;
            if(direction==0 && nums[i]<nums[i+1]){
                direction=1;
            }else if(direction==1 && nums[i]<nums[i+1]){
                direction=1;
            }else if(direction==0 && nums[i]>nums[i+1]){
                direction=-1;
            }else if(direction==-1 && nums[i]>nums[i+1]){
                direction=-1;
            }else{
                return false;
            }
        }
        return true;
    }
}