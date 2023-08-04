class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        permutation(0,nums,ans);
        return ans;
    }

    void permutation(int ind,int[] nums,List<List<Integer>> ans){
        if(ind==nums.length){
            List<Integer> ds=new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                ds.add(nums[j]);
            }
            
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=ind;i<nums.length;i++){
            swap(i,ind,nums);
            permutation(ind+1,nums,ans);
            swap(i,ind,nums);
        }
    }

    void swap(int ind1,int ind2,int[] nums){
        int temp=nums[ind1];
        nums[ind1]=nums[ind2];
        nums[ind2]=temp;
    }
}