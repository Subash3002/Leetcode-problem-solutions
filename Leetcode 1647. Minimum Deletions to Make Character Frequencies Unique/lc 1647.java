class Solution {
    public int minDeletions(String s) {
        int[] arr=new int[26];
        for(char c:s.toCharArray()){
            arr[c-'a']+=1;
        }
        Arrays.sort(arr);
        int del=0;
        for(int i=24;i>=0;i--){
            if(arr[i]==0) break;
            if(arr[i]>=arr[i+1]){
                int prev=arr[i];
                arr[i]=Math.max(0,arr[i+1]-1);
                del+=prev-arr[i];
            }
        }
        return del;
    }
}