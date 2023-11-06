class SeatManager {
    int last;
    PriorityQueue<Integer> seats;
    public SeatManager(int n) {
        seats=new PriorityQueue<>();
        last=0;
    }

    
    public int reserve() {
        if(seats.isEmpty()){
            return ++last;
        }else{
            return seats.poll();
        }
    }
    
    public void unreserve(int seatNumber) {
        if(seatNumber==last){
            last--;
        }else{
            seats.offer(seatNumber);
        }
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */