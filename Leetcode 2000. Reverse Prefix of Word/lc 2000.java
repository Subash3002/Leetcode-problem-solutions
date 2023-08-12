class Solution {
    public String reversePrefix(String word, char ch) {
        int ind=word.indexOf(ch);
        if(ind==-1){
            return word;
        }else{
            StringBuilder sb=new StringBuilder(word.substring(0,ind+1));
            return sb.reverse().toString() + word.substring(ind+1,word.length());
            
        }
    }
}