class Solution {
    public String addBinary(String a, String b) {
        String ans="";
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        while(i>=0 || j>=0){
            char c1;
            char c2;
            if(i<0){
                c1='0';
            }else{
                c1=a.charAt(i);
            }
            if(j<0){
                c2='0';
            }else{
                c2=b.charAt(j);
            }
            int sum=carry+(c1-'0')+(c2-'0');
            if(sum==3){
                carry=1;
                ans='1'+ans;
            }else if(sum==2){
                carry=1;
                ans='0'+ans;
            }else if(sum==1){
                carry=0;
                ans='1'+ans;
            }else{
                carry=0;
                ans='0'+ans;
            }
            i--;
            j--;

        }
        if(carry!=0)ans='1'+ans;
        return ans;
    }
}