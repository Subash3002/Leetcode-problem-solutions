class Solution {
    int[] alp=new int[26];
    void copyArr(int[] arr){

        for(int i=0;i<26;i++){
            alp[i]=arr[i];
        }
        
    }
    public int countCharacters(String[] words, String chars) {
        int sum=0;
        int[] alph=new int[26];
        for(int i=0;i<chars.length();i++){
            char c=chars.charAt(i);
            alph[c-'a']++;
        }
        
        for(int i=0;i<words.length;i++){
            copyArr(alph);
            int f=1;
            String s=words[i];
            for(char c:s.toCharArray()){
                if(alp[c-'a']==0){
                    f=0;
                    break;
                }else{
                    alp[c-'a']--;
                }
            }
            if(f==1){
                sum+=s.length();
            }
            
        }
        return sum;
    }
}