class Solution {
    public long countVowels(String word) {
        long count=0;
        int len=word.length();
        for(int i=len-1;i>=0;i--){
            if(vowelschck(word.charAt(i))){
                count+=(long)(i+1)*(len-i);
            }
        }
        
        
        return count;

    }

    boolean vowelschck(char c){
        
        if(c=='a' || c=='e' || c=='i' ||
        c=='o' || c=='u'){
            return true;
        }
        
        return false;
    }


}