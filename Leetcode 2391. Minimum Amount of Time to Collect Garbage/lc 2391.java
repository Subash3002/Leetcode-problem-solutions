class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int travelM=0, travelP=0, travelG=0;
        int totalWord=0;
        int len=garbage.length;
        boolean a=true;
        boolean b=true;
        boolean c=true;
        for(int i=len-1;i>=0;i--){
            if(garbage[i].contains("M") && a){
                travelM=i;
                a=false;
            }
            if(garbage[i].contains("P") && b){
                travelP=i;
                b=false;
            }
            if(garbage[i].contains("G") && c){
                travelG=i;
                c=false;
            }
        }
        int totM=0;
        int totP=0;
        int totG=0;

        for(int x=0;x<travelM;x++){
            totM+=travel[x];
        }
        for(int y=0;y<travelP;y++){
            totP+=travel[y];
        }
        for(int z=0;z<travelG;z++){
            totG+=travel[z];
        }
        for(int k=0;k<len;k++){
            totalWord+=garbage[k].length();
        }

        return totalWord+totM+totP+totG;
    }
}