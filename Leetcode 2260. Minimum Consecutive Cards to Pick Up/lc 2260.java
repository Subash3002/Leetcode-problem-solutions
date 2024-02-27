class Solution {
    public int minimumCardPickup(int[] cards) {
        Map<Integer,Integer> mp=new HashMap<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<cards.length;i++){
            if(mp.containsKey(cards[i])){
                min=Math.min(min,i-mp.get(cards[i]));
            }
            mp.put(cards[i],i);
        }

        return (min!=Integer.MAX_VALUE)?min+1:-1;
    }
}