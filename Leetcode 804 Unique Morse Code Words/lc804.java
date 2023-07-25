class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] arr={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        Set<String> set=new HashSet();
        for(String s:words){
            String a="";
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                int ind= (c-'a');
                a+=arr[ind];
            }
            set.add(a);
        }
        
        return set.size();
    }
}