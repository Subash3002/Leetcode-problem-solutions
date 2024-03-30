class Solution {
    int find(int[] nums,int k){
        int i=0;
        int j=0;
        int n=nums.length;
        int ans=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        while(j<n){
            hm.put(nums[j],hm.getOrDefault(nums[j],0)+1);
            while(hm.size()>k && i<=j){
                hm.put(nums[i],hm.getOrDefault(nums[i],0)-1);
                if(hm.get(nums[i])==0)hm.remove(nums[i]);
                i++;
            }
            ans+=j-i+1;
            j++;
        }
        return ans;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return find(nums,k)-find(nums,k-1);
    }
}