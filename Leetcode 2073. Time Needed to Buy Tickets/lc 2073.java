class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n=tickets.length;

        Queue<Integer> q=new LinkedList<>();

        int lessthanK=0;
        
        for(int i=0;i<n;i++){
            q.add(tickets[i]);
            if(tickets[i]==tickets[k] && i<k)lessthanK++;
            else if(tickets[i]<tickets[k])lessthanK++;;

        }
        System.out.println(lessthanK);
        int cnt=0;
        while(q.size()>n-lessthanK-1){
            cnt++;
            int rem=q.remove()-1;
            if(rem>0)q.add(rem);
        }

        return cnt;
        

    }
}