class Solution {
    public int findJudge(int n, int[][] trust) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        boolean[] hasTrust=new boolean[n];
        for(int[] p:trust){
            hm.put(p[1]-1,hm.getOrDefault(p[1]-1,0)+1);
            hasTrust[p[0]-1]=true;
        }
        
        for(int i=0;i<n;i++){
            if(!hasTrust[i] && hm.getOrDefault(i,0)==n-1)return i+1;
        }

        return -1;
    }
}