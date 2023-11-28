class Solution {
    public int numberOfWays(String corridor) {
        int MOD=1000000007;
        long ans=1;
        int seats=0;
        int lastseat=-1;
        for(int i=0;i<corridor.length();i++){
            if(corridor.charAt(i)=='P') continue;
            seats++;
            if(seats>2 && seats%2!=0){
                int ways=i-lastseat;
                ans=(ans*ways)%MOD;
            }
            lastseat=i;

        }
        
        return (seats>=2 && seats%2==0)?(int)ans:0;

    }
}