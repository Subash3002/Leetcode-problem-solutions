class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] f=new int[26];
        for(char c:tasks){
            f[c-'A']++;
        }
        
        int max=0;
        int mc=0;
        int sum=0;
        for(int i:f){
            if(i==0)continue;
            sum+=i;
            if(i==max)mc++;
            if(i>max){
                max=i;
                mc=1;
            }
        }
        
        int ans=((n+1)*(max-1))+mc;
        return Math.max(sum,ans);

        
    }
}