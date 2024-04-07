class Solution {
    public boolean checkValidString(String s) {
        int l1=0,l2=0;
       

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                l1++;
                l2++;
            }else if(c==')'){
                l1--;
                l2--;
            }else{
                l1--;
                l2++;
            }
            if(l2<0)return false;
            if(l1<0)l1=0;
        }
        
        return l1==0;
    }
}