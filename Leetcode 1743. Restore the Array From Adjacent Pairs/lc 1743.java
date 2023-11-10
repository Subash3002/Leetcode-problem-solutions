class Solution {
    public int[] restoreArray(int[][] adjacentPairs) {
        ArrayList<Integer> ans=new ArrayList<>();
        HashMap<Integer,ArrayList<Integer>> graph=new HashMap<>();
        
        for(int i=0;i<adjacentPairs.length;i++){
            int f=adjacentPairs[i][0];
            int s=adjacentPairs[i][1];

            if(graph.containsKey(f)){
                ArrayList<Integer> adj=graph.get(f);
                adj.add(s);
                graph.put(f,adj);
            }else{
                ArrayList<Integer> adj=new ArrayList<>();
                adj.add(s);
                graph.put(f,adj);
            }

            if(graph.containsKey(s)){
                ArrayList<Integer> adj=graph.get(s);
                adj.add(f);
                graph.put(s,adj);
            }else{
                ArrayList<Integer> adj=new ArrayList<>();
                adj.add(f);
                graph.put(s,adj);
            }
            
        }
        
        for(Map.Entry<Integer,ArrayList<Integer>> m:graph.entrySet()){
            ArrayList<Integer> val=m.getValue();
            if(val.size()==1){
                ans.add(m.getKey());
                ans.add(val.get(0));
                break;
            }
        }

        while(ans.size()<graph.size()){
            int lastElement=ans.get(ans.size()-1);
            int secondLastElement=ans.get(ans.size()-2);
            if(graph.get(lastElement).size()==1){
                ans.add(graph.get(lastElement).get(0));
            }else{
                int f=graph.get(lastElement).get(0);
                if(f!=secondLastElement){
                    ans.add(f);
                }else{
                    ans.add(graph.get(lastElement).get(1));
                }
            }
        }
        int[] res=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            res[i]=ans.get(i);
        }
        return res;
    }
}