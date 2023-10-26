class Solution {
    public int kthGrammar(int n, int k) {
        int ans=0;
        int left=0;
        int right=(int)Math.pow(2,n-1);
        for(int i=0;i<n-1;i++){
            int mid=left+(right-left)/2;

            if(k<=mid){
                right=mid;
            }else{
                left=mid+1;
                ans^=1;
            }
        } 
        return ans;
    }
}