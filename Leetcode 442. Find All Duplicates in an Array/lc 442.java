class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            int abs=Math.abs(nums[i]);
            if(nums[abs-1]<0){
                ans.add(abs);
            }else{
                nums[abs-1]*=-1;
            }
        }
        return ans;
    }
}