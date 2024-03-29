class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1)return x;
        int l=1;
        int h=x;
        int ans=1;
        while(l<=h){
            
            int mid=l+(h-l)/2;
            //System.out.println(mid);
            long sqr=(long)mid*mid;
            if(sqr==x)return mid;
            else if(sqr>x){
                h=mid-1;
            }else{
                ans=mid;
                l=mid+1;
            }
        }
        return ans;
    }
}