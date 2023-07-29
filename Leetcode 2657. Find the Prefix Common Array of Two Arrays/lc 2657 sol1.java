class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int[] ans=new int[n];
        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<n;i++){
            set.add(A[i]);
            set.add(B[i]);
            int count=2*(i+1)-set.size();
            ans[i]=count;
        }
        return ans;
    }
}