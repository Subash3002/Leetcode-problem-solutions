class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res=new ArrayList<>();

        for(int[] in:intervals){
            if(newInterval[1]<in[0]){
                res.add(newInterval);
                newInterval=in;
            }else if(newInterval[0]>in[1]){
                res.add(in);
            }else{
                newInterval[0]=Math.min(newInterval[0],in[0]);
                newInterval[1]=Math.max(newInterval[1],in[1]);
            }
        }

        res.add(newInterval);

        return res.toArray(new int[res.size()][]);
    }
}