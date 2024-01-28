class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;

        int[][] prefixSum=new int[m][n];

        for(int r=0;r<m;r++){
            for(int c=0;c<n;c++){
                int top=(r>0)?prefixSum[r-1][c]:0;
                int left=(c>0)?prefixSum[r][c-1]:0;
                int topLeft=(Math.min(r,c)>0)?prefixSum[r-1][c-1]:0;
                prefixSum[r][c]=matrix[r][c]+top+left-topLeft;
            }
        }
        int ans=0;
        for(int r1=0;r1<m;r1++){
            for(int r2=r1;r2<m;r2++){
                HashMap<Integer,Integer> hm=new HashMap<>();
                hm.put(0,1);
                for(int c=0;c<n;c++){
                    int top=(r1>0)?prefixSum[r1-1][c]:0;
                    int curSum=prefixSum[r2][c]-top;
                    ans+=hm.getOrDefault(curSum-target,0);
                    hm.put(curSum,hm.getOrDefault(curSum,0)+1);
                }
            }
        }
        return ans;
    }
}