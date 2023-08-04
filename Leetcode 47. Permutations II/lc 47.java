class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        HashSet<List<Integer>> hs=new HashSet<>();
        List<List<Integer>> ans=new ArrayList<>();
        permutation(0,nums,hs);
        for(List<Integer> arr:hs){
            ans.add(arr);
        }
        return ans;

    }

    void permutation(int ind,int[] nums,HashSet<List<Integer>> hs){
        if(ind==nums.length){
            List<Integer> ds=new ArrayList<>();
            for(int n:nums){
                ds.add(n);
            }

            hs.add(new ArrayList<>(ds));
            return;
        }

        for(int i=ind;i<nums.length;i++){
            swap(ind,i,nums);
            permutation(ind+1,nums,hs);
            swap(ind,i,nums);
        }

    }

    void swap(int ind1,int ind2,int[] nums){
        int temp=nums[ind1];
        nums[ind1]=nums[ind2];
        nums[ind2]=temp;
    }
}