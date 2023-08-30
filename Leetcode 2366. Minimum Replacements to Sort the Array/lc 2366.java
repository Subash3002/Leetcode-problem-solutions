class Solution {
    public long minimumReplacement(int[] nums) {
        long operations=0;
        int len=nums.length;
        long minVal=nums[len-1];

        for(int i=len-2;i>=0;i--){
    
            long parts=(nums[i]+minVal-1)/minVal;

            operations+=(parts-1);

            minVal=nums[i]/parts;
        }

        return operations;
    }

}