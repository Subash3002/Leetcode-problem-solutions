class Solution {
    public int findKthLargest(int[] nums, int k) {
        Comparator<Integer> customComparator=new Comparator<Integer>(){
            public int compare(Integer a,Integer b){
                return Integer.compare(b,a);
            }
        };

        PriorityQueue<Integer> pq=new PriorityQueue<>(customComparator);

        for(int i=0;i<nums.length;i++){
            pq.offer(nums[i]);
        }

        int k1=k-1;

        while(!pq.isEmpty() && k1>0){
            pq.poll();
            k1--;
        }

        return pq.peek();

    }
}