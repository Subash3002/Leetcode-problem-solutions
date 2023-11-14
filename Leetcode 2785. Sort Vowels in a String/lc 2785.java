class Solution {
    public String sortVowels(String s) {
        char[] ch =s.toCharArray();
        String ans="";
        ArrayList<Character> vow=new ArrayList<Character>();
        for(int i=0;i<ch.length;i++){
            if(check(ch[i])){
                vow.add(ch[i]);
                ch[i]='u';
            }
        }
        Collections.sort(vow);
        int c=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='u'){
                ans+=String.valueOf(vow.get(c));
                c++;
            }else{
                ans+=String.valueOf(ch[i]);
            }
            
        }
        return ans;
    }
    
    boolean check(char c){
        char[] vowels={'A','E','I','O','U','a','e','i','o','u'};
        for(int i=0;i<vowels.length;i++){
            if(c==vowels[i]){
                return true;
            }
        }
        return false;
    }
}