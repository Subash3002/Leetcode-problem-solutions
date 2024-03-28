class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int i=0,j=0;
        int n=nums.length;
        int ans=0;

        HashMap<Integer,Integer> hm=new HashMap<>();

        while(j<n){
            hm.put(nums[j],hm.getOrDefault(nums[j],0)+1);
            while(hm.get(nums[j])>k){
                hm.put(nums[i],hm.getOrDefault(nums[i],0)-1);
                i++;
            }
            ans=Math.max(ans,j-i+1);
            j++;
        }

        return ans;
    }
}