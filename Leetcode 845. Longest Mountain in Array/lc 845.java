class Solution {
    public int longestMountain(int[] arr) {
        int maxLen=0;
        int n=arr.length;
        int i=1;
        while(i<n){
            int up=0,down=0;
            while(i<n && arr[i-1]==arr[i]){
                i++;
            }

            while(i<n && arr[i-1]<arr[i]){
                up++;
                i++;
            }

            while(i<n && arr[i-1]>arr[i]){
                down++;
                i++;
            }

            if(up!=0 && down!=0){
                maxLen=Math.max(maxLen,up+down+1);
            }
        }
        return maxLen;
    }
}