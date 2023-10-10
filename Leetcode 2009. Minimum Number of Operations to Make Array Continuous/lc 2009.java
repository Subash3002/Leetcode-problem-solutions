class Solution {
    public int minOperations(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i:nums){
            hs.add(i);
        }
        Integer[] arr=new Integer[hs.size()];
        hs.toArray(arr);
        Arrays.sort(arr);
        // for(int i:arr){
        //     System.out.println(i);
        // }
        
        int min=Integer.MAX_VALUE;
        int r=0;
        for(int l=0;l<arr.length;++l){
            while(r<arr.length && arr[r]<arr[l]+nums.length){
                r+=1;
            }
            int window=r-l;
            min=Math.min(min,nums.length-window);
            
            if(r==arr.length) break;
        }
        return min;
        

    }
}