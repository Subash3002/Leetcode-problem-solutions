class Solution {
    int palindrome(String s,int i,int j){
        int cnt=0;
        while(i>=0 && j<s.length() && s.charAt(i--)==s.charAt(j++))cnt++;
        return cnt;
    }
    public int countSubstrings(String s) {
        int n=s.length();
        int ans=0;
        for(int i=0;i<n;i++){
            int odd=palindrome(s,i,i);
            int even=palindrome(s,i,i+1);
            ans+=odd+even;

        }

        return ans;
    }
}