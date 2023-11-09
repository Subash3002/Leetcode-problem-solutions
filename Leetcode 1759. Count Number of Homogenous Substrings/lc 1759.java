class Solution {
    public int countHomogenous(String s) {
        int mod=1000000007;
        long res=0;
        int i=1;
        while(i<s.length()){
            int c=1;
            while(i<s.length() && s.charAt(i)==s.charAt(i-1)){
                res=(res+c)%mod;
                c++;
                i++;
            }
            i++;
        }
        
        return (int)(res+s.length())%mod;
    }
}