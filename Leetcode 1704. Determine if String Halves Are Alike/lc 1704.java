class Solution {
    public boolean isVowel(char c){
        String s="aeiouAEIOU";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c)return true;
        }
        return false;
    }
    public boolean halvesAreAlike(String s) {
        int cnt=0;
        for(int i=0;i<s.length()/2;i++){
            if(isVowel(s.charAt(i))){
                cnt++;
            }
        }

        for(int i=s.length()/2;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                cnt--;
                if(cnt<0)return false;
            }
        }

        return (cnt==0)?true:false;
    }
}