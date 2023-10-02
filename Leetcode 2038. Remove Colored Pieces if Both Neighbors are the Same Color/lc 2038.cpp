class Solution {
public:
    bool winnerOfGame(string colors) {
        int aC=0,bC=0;
        int i=0;

        while(i<colors.size()){
            int t1=0,t2=0;

            while(i<colors.size() && colors[i]=='A'){
                t1++;
                if(t1>=3){
                    aC++;
                }
                i++;
            }

            while(i<colors.size() && colors[i]=='B'){
                t2++;
                if(t2>=3){
                    bC++;
                }
                i++;
            }

        }

        return (aC>bC)?true:false;
    }
};