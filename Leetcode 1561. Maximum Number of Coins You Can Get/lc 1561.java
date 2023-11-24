class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int tot=0;
        int a=piles.length-1;
        int b=0;

        while(b<a){
            tot+=piles[a-1];
            a-=2;
            b++;
        }
        return tot;
    }
}