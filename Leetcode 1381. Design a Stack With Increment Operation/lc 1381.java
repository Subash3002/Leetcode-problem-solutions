class CustomStack {
    int[] arr;
    int max;
    int cur=0;
    public CustomStack(int maxSize) {
        arr=new int[maxSize];
        max=maxSize;
    }
    
    public void push(int x) {
        if(cur<max){
            arr[cur++]=x;
        }
    }
    
    public int pop() {
        if(cur==0){
            return -1;
        }
        return arr[--cur];
        
    }
    
    public void increment(int k, int val) {
        if(k>cur){
            k=cur;
        }

        for(int i=0;i<k;i++){
            arr[i]+=val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */