class Pair{
    int ind;
    long sum;
    Pair(int ind,long sum){
        this.ind=ind;
        this.sum=sum;
    }

    int first(){
        return ind;
    }

    long second(){
        return sum;
    }
}
class Solution {
    public int shortestSubarray(int[] nums, int k) {
        //Imp note
        //the peak is unnecessary while calculating the subarray sum,so to remove it 
        //we use Deque,where the the peak is removed and make the prefix sum monotonic
        Deque<Pair> dq=new ArrayDeque<>();
        int n=nums.length;
        long sum=0;
        int len=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            //check if sum>=k
            if(sum>=k){
                len=Math.min(len,i+1);
            }
            //compress the subarray from left
            Pair p=new Pair(Integer.MIN_VALUE,Long.MIN_VALUE);
            while(!dq.isEmpty() && sum-dq.peekFirst().second()>=k){
                p=dq.peekFirst();
                dq.removeFirst();
            }
            //if new compressed subarray found
            if(p.second()!=Long.MIN_VALUE){
                len=Math.min(len,i-p.first());
            }

            //maintaing monotonic deque
            while(!dq.isEmpty() && dq.peekLast().second()>=sum){
                dq.removeLast();
            }
            dq.addLast(new Pair(i,sum));
        }

        return len!=Integer.MAX_VALUE?len:-1;
    }
}