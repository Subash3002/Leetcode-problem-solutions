class Solution {
    public String getPermutation(int n, int k) {
        String ans="";
        ArrayList<Integer> arr=new ArrayList<>();
        int fact=1;
        for(int i=1;i<n;i++){
            arr.add(i);
            fact=fact*i;
        }
        arr.add(n);
        k=k-1;
        while(true){
            ans+=arr.get(k/fact);
            arr.remove(arr.get(k/fact));
            if(arr.size()==0){
                break;
            }

            k=k%fact;
            fact=fact/arr.size();
        }
        return ans;
    }
}