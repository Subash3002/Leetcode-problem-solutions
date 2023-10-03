class Solution {
    public int maxSubarrays(int[] nums) {
        
        int val=nums[0];
        
        for(int i=1;i<nums.length;i++){
            val&=nums[i];
        }
        
        if(val!=0) return 1;
        
        int count=0;
        val=1048575;
        
        for(int i=0;i<nums.length;i++){
            val&=nums[i];
            if(val==0){
                count++;
                val=1048575;
            }
        }
        return count;
    }
}