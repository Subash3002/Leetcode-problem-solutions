class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n=nums.length;
        int[] preAbs=new int[n];
        int[] sufAbs=new int[n];

        for(int i=1;i<n;i++){
            int diff=nums[i]-nums[i-1];
            preAbs[i]=preAbs[i-1]+(i*diff);
            //System.out.print(preAbs[i]+" ");
        }
        //System.out.println();
        //sufAbs[n-1]=preAbs[n-1];
        for(int i=n-2;i>=0;i--){
            int diff=nums[i+1]-nums[i];
            sufAbs[i]=sufAbs[i+1]+((n-1-i)*diff);
            System.out.print(sufAbs[i]+" ");
        }
        

        for(int i=0;i<n;i++){
            sufAbs[i]+=preAbs[i];
        }

        return sufAbs;


    }
}