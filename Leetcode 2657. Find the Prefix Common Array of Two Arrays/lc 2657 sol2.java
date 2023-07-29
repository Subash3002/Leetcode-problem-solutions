class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int[] ans=new int[n];
        
        for(int i=0;i<n;i++){
            ans[i]=check(i,A,B);
        }

        return ans;
        
    }

    int check(int indx,int[] A,int[] B){
        int count=0;
        for(int i=0;i<=indx;i++){
            for(int j=0;j<=indx;j++){
                if(A[i]==B[j]){
                    count++;
                }
            }
        }
        return count;
    }
}