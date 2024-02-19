class MedianFinder {
    PriorityQueue<Integer> smaller;
    PriorityQueue<Integer> larger;
    boolean odd;
    public MedianFinder() {
        smaller=new PriorityQueue<>(Collections.reverseOrder());
        larger=new PriorityQueue<>();
        odd=true;
    }
    
    public void addNum(int num) {
        if(odd){
            larger.offer(num);
            smaller.offer(larger.poll());
        }else{
            smaller.offer(num);
            larger.offer(smaller.poll());
        }
        odd=!odd;
    }
    
    public double findMedian() {
        if(!odd){
            return (double)smaller.peek();
        }else{
            return (smaller.peek()+larger.peek())/2.0;
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */