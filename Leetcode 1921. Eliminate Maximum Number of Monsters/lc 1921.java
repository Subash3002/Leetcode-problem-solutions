1921. Eliminate Maximum Number of Monsters
class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int[] time=new int[dist.length];
        for(int i=0;i<dist.length;i++){
            time[i]=(int)Math.ceil((double)dist[i]/speed[i]);
        }
        Arrays.sort(time);
        //System.out.println(Arrays.toString(time));
        for(int i=0;i<time.length;i++){
            if(time[i]<=i){
                return i;
            }
        }
        return time.length;
    }
}