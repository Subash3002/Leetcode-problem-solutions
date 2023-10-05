class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res=new ArrayList<>();
        int len=nums.length;
        int min=len/3;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<len;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> m:hm.entrySet()){
            int value=m.getValue();
            if(value>min){
                res.add(m.getKey());
            }
        }

        return res;
    }
}