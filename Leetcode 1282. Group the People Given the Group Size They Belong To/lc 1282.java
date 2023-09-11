class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> ans=new ArrayList<>();
        HashMap<Integer,List<Integer>> hm=new HashMap<>();

        for(int i=0;i<groupSizes.length;i++){
            int val=groupSizes[i];
            List<Integer> list=hm.getOrDefault(val,new ArrayList<>());
            list.add(i);
            hm.put(val,list);
        }

        for(int key:hm.keySet()){
            int i=0;
            List<Integer> list=hm.get(key);
            while(i<list.size()){
                ans.add(list.subList(i,i+key));
                i+=key;
            }
        }

        return ans;


    }
}