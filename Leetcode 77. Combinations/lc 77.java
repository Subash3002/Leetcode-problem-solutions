class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        combination(1,n,k,new ArrayList<Integer>(),ans);
        return ans;

    }

    void combination(int ind,int num,int k,List<Integer> ds,List<List<Integer>> ans){
        if(k==0){
            ans.add(new ArrayList<>(ds));
            return;  
        }

        for(int i=ind;i<=num-k+1;i++){
            ds.add(i);
            combination(i+1,num,k-1,ds,ans);
            ds.remove(ds.size()-1);
        }
        
    }
}