class Solution {
    public int maximumGap(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        for(int i:nums)pq.add(i);

        int max=0;
        

        while(pq.size()>1){
            max=Math.max(max,Math.abs(pq.poll()-pq.peek()));
        }

        return max;
        
    }
}