class Solution {
    public boolean winnerOfGame(String colors) {
        int aC=0;
        int bC=0;
        
        int i=0;
        while(i<colors.length()){
            int t1=0;
            int t2=0;
            while(i<colors.length() && colors.charAt(i)=='A'){
                t1++;
                if(t1>=3){
                    aC++;
                }
                i++;
            }
            while(i<colors.length() && colors.charAt(i)=='B'){
                t2++;
                if(t2>=3){
                    bC++;
                }
                i++;
            }
        }

        if(aC>bC){
            return true;
        }else{
            return false;
        }
    }
}