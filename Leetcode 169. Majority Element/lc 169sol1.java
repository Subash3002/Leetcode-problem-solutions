class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int temp=0;

        for(int n:nums){
            if(count==0){
                temp=n;
            }

            if(n==temp){
                count++;
            }else{
                count--;
            }
        }
        return temp;
    }
}