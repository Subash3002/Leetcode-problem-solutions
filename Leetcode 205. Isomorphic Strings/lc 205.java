class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hm=new HashMap<>();
        HashMap<Character,Character> hm2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(hm.containsKey(c)){
                if(hm.get(c)!=t.charAt(i))return false;
            }else{
                if(hm2.containsKey(t.charAt(i)))return false;
                hm.put(c,t.charAt(i));
                hm2.put(t.charAt(i),c);
            }
        }
        return true;
    }
}