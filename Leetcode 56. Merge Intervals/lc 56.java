class Solution {
    public int[][] merge(int[][] intervals) {
        
        List<int[]> res=new ArrayList<>();

        if(intervals.length<2){
            return intervals;
        }

        Arrays.sort(intervals,(arr1,arr2)->Integer.compare(arr1[0],arr2[0]));
        int[] cur_int=intervals[0];
        res.add(cur_int);

        for(int[] interval:intervals){
            int cur_beg=cur_int[0];
            int cur_end=cur_int[1];
            int next_beg=interval[0];
            int next_end=interval[1];

            if(cur_end>=next_beg){
                cur_int[1]=Math.max(cur_end,next_end);
            }else{
                cur_int=interval;
                res.add(cur_int);
            }
        }

        int[][] ans=new int[res.size()][];

        for(int i=0;i<res.size();i++){
            ans[i]=res.get(i);
        }

        return ans;
    }
}