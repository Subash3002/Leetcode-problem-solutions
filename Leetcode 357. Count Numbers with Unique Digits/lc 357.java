class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0){
            return 1;
        }
        int ans=10;//for 1 digit and including 0
        int count=9;//we have 9 possibility fr 1 digit
        //computing for next n-1 digits
        for(int i=0;i<n-1;i++){
            count*=(9-i);
            ans+=count;
        }
        return ans;
        //eg:for n=3
        //1st digit=9 possibilities(1to9)
        //2nd digit=9*9 (8 possibility and also we can have 0 and only excluding the number in 1st digit)
        //3rd digit=9*9*8
        

    }
}