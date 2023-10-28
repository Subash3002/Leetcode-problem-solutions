class Solution {
    public String longestPalindrome(String s) {
        int len=s.length();

        while(len>0){
            for(int i=0;i<s.length()-len+1;i++){
                if(check(s.substring(i,i+len))){
                    return s.substring(i,i+len);
                }
            }
            len--;
        }
        return "";
    }
    boolean check(String s){
        int start=0;
        int end=s.length()-1;
        while(start<=end){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }
}