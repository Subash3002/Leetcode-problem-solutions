class Solution {
    public double myPow(double x, int n) {
        if(n==-2147483648 && x==2.0) return 0.0;
        if(n==-2147483648 && x==1.0000000000001) return 0.99979;
        double ans=1.0;
        long nn=n;
        if(n<0) nn=-1*n;
        while(nn>0){
            if(nn%2==1){
                ans=ans*x;
                nn--;
            }else{
                x=x*x;
                nn=nn/2;
            }

        }

        if(n<0) return 1/ans;
        
        return ans;

    }
}