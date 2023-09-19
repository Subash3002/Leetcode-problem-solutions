class Solution {
    public String countAndSay(int n) {
        String s="1";
        for(int i=2;i<=n;i++){
            s=convert(s);
        }
        return s;
    }

    String convert(String s){
        int count=1;
        char prevCh=s.charAt(0);
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<s.length();i++){
            char curCh=s.charAt(i);
            if(prevCh==curCh){
                count++;
            }else{
                sb.append(Integer.toString(count));
                sb.append(prevCh);
                prevCh=curCh;
                count=1;
            }
        }
        sb.append(Integer.toString(count));
        sb.append(prevCh);
        return sb.toString();
    }
}