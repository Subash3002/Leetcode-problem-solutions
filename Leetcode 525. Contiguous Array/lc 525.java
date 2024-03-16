class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,-1);
        int prefixSum=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            prefixSum+=nums[i]==1?1:-1;
            if(hm.containsKey(prefixSum)){
                max=Math.max(max,i-hm.get(prefixSum));
            }else{
                hm.put(prefixSum,i);
            }
        }

        return max;
    }
}