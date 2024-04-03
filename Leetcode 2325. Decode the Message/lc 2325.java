class Solution {
    public String decodeMessage(String key, String message) {
        char[] arr=new char[26];
        HashSet<Character> hs=new HashSet<>();
        char s='a';
        for(int i=0;i<key.length() && s<='z';i++){
            char c=key.charAt(i);
            if(c==' ')continue;
            if(!hs.contains(c)){
                arr[c-'a']=s++;
                hs.add(c);
            }
        }
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<message.length();i++){
            if(message.charAt(i)==' '){
                sb.append(" ");
                continue;
            }
            sb.append(arr[message.charAt(i)-'a']);
        }

        return sb.toString();
    }
}