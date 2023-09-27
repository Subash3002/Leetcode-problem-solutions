class Solution {
    public String decodeAtIndex(String s, int k) {
        long length=0;

        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                length=length*(c-'0');
            }else{
                length++;
            }
        }

        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            k%=length;
            if(Character.isDigit(c)){
                length=length/(c-'0');
            }else{
                if(k==0 || k==length){
                    return String.valueOf(c);
                }
                length--;
            }
        }

        return "";
    }
}