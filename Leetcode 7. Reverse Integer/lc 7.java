class Solution {
    public int reverse(int x) {
        if(x<Integer.MIN_VALUE || x>Integer.MAX_VALUE){
            return 0;
        }
        if(x>0){
            return reversing(x);
        }
        return -1 * reversing(x*-1);
       
        
    }

    int reversing(int x){
        int digits=(int)(Math.log10(x))+1;
        long rev=0;
        int i=1;
        while(x>0){
            int rem=x%10;
            rev+=Math.pow(10,digits-i) * rem;
            if(rev>Math.pow(2,31)-1){
                return 0;
            }
            x=x/10;
            i++;
        }
        return (int)rev;
    }
}