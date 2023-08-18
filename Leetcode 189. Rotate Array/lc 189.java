class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(0,nums.length-1,nums);
        reverse(0,k-1,nums);
        reverse(k,nums.length-1,nums);
    }

    void swap(int ind1,int ind2,int[] nums){
        int temp=nums[ind1];
        nums[ind1]=nums[ind2];
        nums[ind2]=temp;
    }

    void reverse(int s,int e,int[] nums){
        int start=s;
        int end=e;

        while(start<end){
            swap(start,end,nums);
            start++;
            end--;
        }
    }
}