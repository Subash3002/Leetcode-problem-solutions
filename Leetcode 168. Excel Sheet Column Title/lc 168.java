class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb=new StringBuilder("");

        int num=columnNumber;
        while(num>0){
            int n=num%26;
            if(n==0){
                sb.append('Z');
            }else{
                sb.append((char)('A'+(n-1)));
            }
            
            num=(num-1)/26;
        }
        return sb.reverse().toString();
    }
}