class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                int lastFound=hm.get(nums[i]);
                if(i-lastFound<=k)return true;
                hm.put(nums[i],i);
            }else{
                hm.put(nums[i],i);
            }
        } 

        return false;
    }
}