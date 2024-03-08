class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int max=0;
        int sum=0;
        for(int k:hm.keySet()){
            max=Math.max(max,hm.get(k));
        }
        for(int k:hm.keySet()){
            if(hm.get(k)==max)sum+=max;
        }
        return sum;
       

        
    }
}