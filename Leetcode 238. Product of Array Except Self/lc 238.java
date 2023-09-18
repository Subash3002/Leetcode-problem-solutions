class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];

        left[0]=1;
        // we make first element as 1 because we dont have any prefis product for the firat element and if we put 0 instead of 1 it will make all other product as 0.

        for(int i=1;i<nums.length;i++){
            left[i]=left[i-1]*nums[i-1];
        }

        right[nums.length-1]=1;

        for(int i=nums.length-2;i>=0;i--){
            right[i]=right[i+1]*nums[i+1];
        }

        for(int i=0;i<nums.length;i++){
            left[i]=left[i]*right[i];
        }

        return left;

    }
}