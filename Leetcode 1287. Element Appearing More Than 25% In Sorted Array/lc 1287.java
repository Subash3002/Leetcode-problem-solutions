class Solution {
    public int findSpecialInteger(int[] arr) {
        int n=arr.length;
        int max=(int)Math.ceil((n+1)/(double)4);
        
        for(int i=1;i<n;i++){
            int c=1;
            while(i<n && arr[i]==arr[i-1]){
                c++;
                i++;
            }
            if(c>=max){
                return arr[i-1];
            }
        }
        return 1;
    }
}