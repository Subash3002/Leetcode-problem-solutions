class Solution {
    public long countSubarrays(int[] nums, int k) {
        long ans=0;
        int max=0;
        for(int i:nums)max=Math.max(max,i);
        int maxCnt=0;
        int i=0;
        int j=0;
        int n=nums.length;
        while(j<n){
            if(nums[j]==max)maxCnt++;
            while(i<=j && maxCnt>=k){
                ans+=n-j;
                if(nums[i]==max)maxCnt--;
                i++;
            }
            
            j++;
        }
        return ans;

    }
}