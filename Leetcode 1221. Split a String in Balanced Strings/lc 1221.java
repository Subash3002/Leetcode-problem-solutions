class Solution {
    
    public int balancedStringSplit(String s) {
        int ans=0;
        int cnt1=(s.charAt(0)=='L')?1:0;
        int cnt2=(s.charAt(0)=='R')?1:0;

        for(int i=1;i<s.length();i++){
            if(s.charAt(i)=='L')cnt1++;
            else cnt2++;
            if(cnt1==cnt2)ans++;
        }
        return ans;
    }
}