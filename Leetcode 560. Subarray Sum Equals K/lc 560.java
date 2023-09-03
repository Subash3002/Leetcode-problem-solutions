class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int count=0;
        Map<Integer,Integer> mp=new HashMap<>();
        int curSum=0;
        for(int i=0;i<nums.length;i++){
            curSum+=nums[i];
            if(curSum==k) count++;

            if(mp.containsKey(curSum-k))count+=mp.get(curSum-k);

            mp.put(curSum,mp.getOrDefault(curSum,0)+1);
        }
        return count;
    }
}