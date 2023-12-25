class Solution {
    public int numDecodings(String s) {
        
        int n=s.length();
        //int[] dp=new int[n+1];
        if(n==0 || s[])
        
        int second=0;
        int first=1;
        //dp[n]=1;

        for(int i=n-1;i>=0;i--){
            int curVal=0;
            if(s.charAt(i)!='0'){
                //dp[i]=dp[i+1];
                curVal=first;
                
            }else{
                first=0;
            }
            if(i<n-1 && s.charAt(i)!='0' && Integer.valueOf(s.substring(i,i+2))<=26){
                //dp[i]+=dp[i+2];
                curVal+=second;
                
            }
            second=first;
            first=curVal;

        }
        return first;
    }
}