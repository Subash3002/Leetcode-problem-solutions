class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int profit=0;
        int max=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }else{
                profit=prices[i]-buy;
                if(profit>max){
                    max=profit;
                }
            }

        }

        return max;
    }
}