class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        
        Map<Integer,Integer> hm=new TreeMap<>();

        for(int i=0;i<people.length;i++){
            hm.put(people[i],0);
        }

        for(int i=0;i<flowers.length;i++){
            int start=flowers[i][0];
            int end=flowers[i][1];

            if(!hm.containsKey(start)){
                hm.put(start,0);
            }
            if(!hm.containsKey(end+1)){
                hm.put(end+1,0);
            }
            hm.put(start,hm.get(start)+1);
            hm.put(end+1,hm.get(end+1)-1);
        }
        
        

        int cur=0;
        for(Integer k:hm.keySet()){
            cur+=hm.get(k);
            hm.put(k,cur);
            //System.out.println(k);
        }

        int[] ans=new int[people.length];
        for(int i=0;i<people.length;i++){
            ans[i]=hm.get(people[i]);
        }

        return ans;
    }
}