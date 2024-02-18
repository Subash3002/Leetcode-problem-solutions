class Solution {
    public int mostBooked(int n, int[][] meetings) {
        int len=meetings.length;

        Arrays.sort(meetings,(arr1,arr2)->Integer.compare(arr1[0],arr2[0]));
        //for(int[] meeting:meetings)System.out.println(Arrays.toString(meeting));
        Comparator<long[]> customComparator=new Comparator<long[]>(){
            public int compare(long[] arr1,long[] arr2){
                int firstCompare=Long.compare(arr1[0],arr2[0]);
                if(firstCompare==0){
                    return Long.compare(arr1[1],arr2[1]);
                }
                return firstCompare;
            }
        };

        Comparator<long[]> customComparator2=new Comparator<long[]>(){

            public int compare(long[] arr1,long[] arr2){
                return Long.compare(arr1[1],arr2[1]);
            }
        };


        PriorityQueue<long[]> pq=new PriorityQueue<>(customComparator);
        int[] cnt=new int[n];
        for(int i=0;i<n;i++){
            pq.offer(new long[]{1L*0,1L*i});
        }
        //pq.offer(new int[]{0,0});
        
        for(int[] meet:meetings){
            int start=meet[0];
            int end=meet[1];
            long[] nextfree=new long[2];
            PriorityQueue<long[]> pq2=new PriorityQueue<>(customComparator2);
            long[] topL=new long[2];
            topL=pq.peek();
            while(!pq.isEmpty() && topL[0]<=1L*start){
                pq2.offer(pq.poll());
                topL=pq.peek();
            }
            if(!pq2.isEmpty()){
                nextfree=pq2.poll();
            }else{
                nextfree=pq.poll();
            }
            while(!pq2.isEmpty())pq.offer(pq2.poll());
            long newstart=1L*meet[1];
            if(nextfree[0]>start){
                newstart=nextfree[0]+(meet[1]-meet[0]);
            }
            cnt[(int)nextfree[1]]++;
            pq.offer(new long[]{newstart,nextfree[1]});
            
            
            //System.out.println(Arrays.toString(nextfree));
            
            
        }
        // while(!pq.isEmpty()){
        //     System.out.println(Arrays.toString(pq.poll()));
        // }
        //System.out.println(Arrays.toString(cnt));
        int max=-1;
        int ele=-1;

        for(int i=0;i<n;i++){
            if(cnt[i]>max){
                max=cnt[i];
                ele=i;
            }
        }
        return ele;
        
    }
}