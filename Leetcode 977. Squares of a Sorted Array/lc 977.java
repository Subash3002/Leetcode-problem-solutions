class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int l=0;
        int h=nums.length-1;
        int[] res=new int[n];
        
        while(l<=h){
            if(Math.abs(nums[h])>=Math.abs(nums[l])){
                res[--n]=nums[h]*nums[h];
                h--;
            }else{
                res[--n]=nums[l]*nums[l];
                l++;
            }
        }
        return res;
    }
}