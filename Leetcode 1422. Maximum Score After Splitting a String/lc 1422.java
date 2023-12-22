class Solution {
    public int maxScore(String s) {
        int maxx=0;
        int n=s.length();
        int[] zero=new int[n-1];
        if(s.charAt(0)=='0'){
            zero[0]=1;
        }else{
            zero[0]=0;
        }

        for(int i=1;i<n-1;i++){
            if(s.charAt(i)=='0'){
                zero[i]=zero[i-1]+1;
            }else{
                zero[i]=zero[i-1];
            }
        }
        //for(int i:zero)System.out.println(i);
        int ones=0;
        for(int i=n-1;i>0;i--){
            if(s.charAt(i)=='1'){
                ones++;
                maxx=Math.max(maxx,zero[i-1]+ones);
            }else{
                maxx=Math.max(maxx,zero[i-1]+ones);
            }
        }
        return maxx;

        
    }
}