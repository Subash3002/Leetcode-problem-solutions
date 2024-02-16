class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i:arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }

        int[] ar=new int[hm.size()];
        int ind=0;
        for(int i:hm.keySet()){
            ar[ind++]=hm.get(i);
        }
        Arrays.sort(ar);
        int f=-1;
        int rem=k;
        for(int i=0;i<ar.length;i++){
            while(rem>0 && ar[i]>0){
                rem--;
                ar[i]--;
            }
            if(ar[i]==0){
                f=i;
            }else {
                f=i-1;
                break;
            }
           // System.out.println(ar[i]);
        }
        //System.out.println(f+" "+ar.length);
        return ar.length-f-1;
    }
}