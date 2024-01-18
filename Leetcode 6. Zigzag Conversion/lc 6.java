class Solution {
    public String convert(String s, int numRows) {
        String ans="";
        char[] ch=s.toCharArray();
        if(numRows==1){
            return s;
        }
        
        for(int i=0;i<numRows;i++){
            ans+=ch[i];
            int cur=(numRows-1)*2;
            for(int r=i;r<ch.length;cur){
                if(cur>0){
                    ans+=ch[cur];
                }
                if(i>0 && i<numRows-1){
                    cur+r(numRows-1)*2-(2*i);
                }else{
                    cur+=;
                }
                
                
            }
            
        }
        return ans;
    }
}