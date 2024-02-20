class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        solve(0,nums,new ArrayList<>());
        return ans;
    }

    void solve(int ind,int[] nums,List<Integer> l){
        if(ind==nums.length){
            ans.add(new ArrayList<>(l));
            return;
        }

        solve(ind+1,nums,l);
        l.add(nums[ind]);
        solve(ind+1,nums,l);
        l.remove(l.size()-1);
        
    }
}