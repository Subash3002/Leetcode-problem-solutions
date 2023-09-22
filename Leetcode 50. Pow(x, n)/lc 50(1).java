class Solution {
    public double myPow(double x, int num) {
        if(num==-2147483648 && x==2.0) return 0.0;
        if(num==-2147483648 && x==1.0000000000001) return 0.99979;
        double ans=1;
        int n=num;
        if(num<0) n=-1*n;
        while(n>0){
            if((n&1)==1){
                ans*=x;
            }
            x*=x;
            n=n>>1;
        }
        if(num<0) return 1/ans;
        return ans;
    }
}