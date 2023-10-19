class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i=s.length()-1;
        int j=t.length()-1;

        while(true){
            int cnt=0;
            while(i>=0 && (s.charAt(i)=='#' || cnt>0)){
                if(s.charAt(i)=='#')cnt++;
                else cnt--;
                i--;
            }

            cnt=0;
            while(j>=0 && (t.charAt(j)=='#' || cnt>0)){
                if(t.charAt(j)=='#')cnt++;
                else cnt--;
                j--;
            }

            
            if(i<0 && j<0)return true;
            if(i<0 || j<0)return false;
            if(s.charAt(i)!=t.charAt(j)) return false;
            i--;
            j--;
        }
        
    }
}