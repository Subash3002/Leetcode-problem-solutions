class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(0,candidates,target,new ArrayList<>(),ans);
        return ans;
    }

    void backtrack(int ind,int[] candidates,int target,List<Integer> ds,List<List<Integer>> ans){

        if(target==0){
            ans.add(new ArrayList<>(ds)); 
            return;
        }

        for(int i=ind;i<candidates.length;i++){
            if(candidates[i]>target) break;
            if(i>ind && candidates[i]==candidates[i-1]) continue;

            ds.add(candidates[i]);
            backtrack(i+1,candidates,target-candidates[i],ds,ans);
            ds.remove(ds.size()-1);

        }

    }
}