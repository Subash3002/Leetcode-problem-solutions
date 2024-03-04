class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int n=tokens.length;
        Arrays.sort(tokens);
        int score=0;
        int ops1=0;
        int ops2=n-1;

        while(ops1<n && ops1<=ops2){
            while(ops1<n && power>=tokens[ops1]){
                score++;
                power-=tokens[ops1];
                ops1++;
            }
            if(score>=1 && ops2>ops1){
                score--;
                power+=tokens[ops2];
                ops2--;
            }else{
                break;
            }
        }

        return score;

    }
}