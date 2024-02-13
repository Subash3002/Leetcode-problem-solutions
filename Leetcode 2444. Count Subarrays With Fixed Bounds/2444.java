
class Solution {

    public long countSubarrays(int[] nums, int minK, int maxK) {
        long ans=0;
        int minIdx=-1;
        int maxIdx=-1;
        int badIdx=-1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==minK)minIdx=i;
            if(nums[i]==maxK)maxIdx=i;
            if(nums[i]<minK || nums[i]>maxK)badIdx=i;

            ans+=Math.max(0,Math.min(minIdx,maxIdx)-badIdx);
        }

        return ans;
    }
}