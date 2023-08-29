class Solution {
    public int bestClosingTime(String customers) {
        int len=customers.length();
        int[] prefix=new int[len+1];
        int[] suffix=new int[len+1];
        int prefixSum=0;
        int suffixSum=0;
        int minPenalty=Integer.MAX_VALUE;
        int ind=0;

        prefix[0]=0;
        suffix[len]=0;

        for(int i=0;i<len;i++){
            if(customers.charAt(i)=='N') prefixSum+=1;
            prefix[i+1]=prefixSum;
        }

        for(int i=len-1;i>=0;i--){
            if(customers.charAt(i)=='Y') suffixSum+=1;
            suffix[i]=suffixSum;
        }

        for(int i=0;i<len+1;i++){
            if(prefix[i]+suffix[i]<minPenalty){
                minPenalty=prefix[i]+suffix[i];
                ind=i;
            }
        }

        return ind;

    }
}