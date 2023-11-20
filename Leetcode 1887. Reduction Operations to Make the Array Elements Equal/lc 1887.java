class Solution {
    public int reductionOperations(int[] nums) {
        int[] arr=new int[50001];
        int min=50002;
        long ans=0;
        long c=0;
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
            min=Math.min(min,nums[i]);
        }

        for(int i=50000;i>min;i--){
            if(arr[i]>0){
                c+=arr[i];
                ans+=c;
            }
        }
        return (int)ans;
    }
}