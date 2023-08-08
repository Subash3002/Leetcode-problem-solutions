class Solution {
    public void rotate(int[][] matrix) {
        
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[i].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        for(int[] nums:matrix){
            int start=0;
            int end=nums.length-1;
            while(start<=end){
                swap(start,end,nums);
                start++;
                end--;
            }
        }
    }

    void swap(int ind1,int ind2,int[] nums){

        int temp=nums[ind1];
        nums[ind1]=nums[ind2];
        nums[ind2]=temp;
    }
}