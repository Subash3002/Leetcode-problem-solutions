class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1)return true;
        if((n&1)==1)return false;
        int zero_count=0;
        while(n>1){
            if((n&1)==0){
                zero_count++;
            }else{
                return false;
            }
            n=n>>1;
        }
        if(n==1 && (zero_count&1)==0){
            return true;
        }
        return false;
    }
}